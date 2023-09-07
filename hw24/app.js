const express = require('express');
const router = express.Router();
const path = require('path');
const url = require('url');
const cors = require('cors')
const { response } = require('express');
const knex = require('knex');
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


const port = 8080;

const app = express();


app.use(express.json())
app.use(express.urlencoded({
    extended: true
}));


app.use(express.static(path.join('.', '/static/')));

app.use(express.static(path.join('.', '/script/')));

// get all
app.get('/test', async (req, resp) => {
    try {
        const test = await connectedKnex('test').select('*');
        resp.status(200).json({ test });
        console.log(test);
    }
    catch (err) {
        resp.status(500).json({ "error": err.message });
    }
});

// get end point by id
app.get('/test/:id', async (req, resp) => {
    try {
        const test = await connectedKnex('test').select('*').where('id', req.params.id).first();
        resp.status(200).json(test);
    }
    catch (err) {
        resp.status(500).json({ "error": err.message });
    }
});


function is_valid_test(obj) {
    return obj.hasOwnProperty('updateat') && obj.hasOwnProperty('name') &&
        obj.hasOwnProperty('date') && obj.hasOwnProperty('courseid');
}

function is_valid_test_for_update(obj) {
    return obj.hasOwnProperty('updateat') && obj.hasOwnProperty('name') && obj.hasOwnProperty('courseid');
}

// ADD
app.post('/test', async (req, resp) => {
    console.log(req.body);
    const test = req.body;
    try {
        if (!is_valid_test(test)) {
            resp.status(400).json({ error: 'values of test are not llegal' });
            return
        }
        const result = await connectedKnex('test').insert(test);
        resp.status(201).json({
            new_test: { ...test, ID: result[0] },
            url: `http://localhost:8080/test/${result}`
        });
    }
    catch (err) {
        resp.status(500).json({ "error": err.message });
    }
});


app.put('/test/:id', async (req, resp) => {
    console.log(req.body);
    const test = req.body;
    try {
        if (!is_valid_test_for_update(test)) {
            resp.status(400).json({ error: 'values of test are not llegal' });
            return
        }
        const result = await connectedKnex('test').where('id', req.params.id).update(test);
        resp.status(200).json({
            status: 'updated',
            'how many rows updated': result
        })
    }
    catch (err) {
        resp.status(500).json({ "error": err.message });
    }
});


// DELETE 
app.delete('/test/:id', async (req, resp) => {
    try {
        const result = await connectedKnex('test').where('id', req.params.id).del();
        resp.status(200).json({
            status: 'success',
            "how many deleted": result
        });
    }
    catch (err) {
        resp.status(500).json({ "error": err.message });
    }

});







app.listen(port, () => {
    console.log(`Listening to port ${port}`);
})