const express = require('express');
const knex = require('knex');
const app = express();
const config = require('config');

const connectedKnex = knex({
    client: 'pg',
    version: config.db.version,
    connection: {
        host: config.db.host,
        user: config.db.user,
        password: config.db.password,
        database: config.db.database
    }
});

const port = config.express.port;

app.use(express.json())
app.use(express.urlencoded({
    extended: true
}));


app.get('/getnumber',async (req, resp) => {
    try {
        const numbers = await connectedKnex('number').select('*');
        resp.status(200).json({ numbers });

    }
    catch (err) {
        resp.status(500).json({ "error": err.message });
    }
});

app.listen(port, () => {
    console.log(`Listening to port ${port}`);
});


