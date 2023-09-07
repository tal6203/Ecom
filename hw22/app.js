const express = require('express');
const router = express.Router();
const path = require('path');
const url = require('url');
const cors = require('cors');
const { response } = require('express');

const port = 8080;

const app = express();

app.use(express.json())
app.use(express.urlencoded({
    extended: true
}))

app.use(express.static(path.join('.', '/static/')));


app.get('/my_page', (req, resp) => {
    resp.sendFile(path.join(__dirname, '/static/index.html'));
});

app.get('/datetime', (req, resp) => {
    resp.writeHead(201);
    resp.end(`${new Date().toLocaleDateString()} ${new Date().toLocaleTimeString()}`);
});

app.get('/bigger', (req, resp) => {
    const a = Number(req.query.a);
    const b = Number(req.query.b);
    if (isNaN(a)) {
        resp.writeHead(400);
        resp.end(`a is not a number`);
        return;
    }
    if (isNaN(b)) {
        resp.writeHead(400);
        resp.end(`b is not a number`);
        return;
    }
    if (a > b) {
        resp.writeHead(201);
        resp.end(`${a} > ${b}`);
    }
    if (b > a) {
        resp.writeHead(201);
        resp.end(`${a} < ${b}`);
    }
    if (a == b) {
        resp.writeHead(201);
        resp.end(`${a} == ${b}`);
    }

});

app.get('/targil', (req, resp) => {
    const a = Number(req.query.a);
    const b = Number(req.query.b);
    const sum = Number(req.query.sum);

    if (isNaN(a)) {
        resp.writeHead(400);
        resp.end(`a is not a number`);
        return;
    }
    if (isNaN(b)) {
        resp.writeHead(400);
        resp.end(`b is not a number`);
        return;
    }
    if (isNaN(sum)) {
        resp.writeHead(400);
        resp.end(`sum is not a number`);
        return;
    }
    if (a + b == sum) {
        resp.sendFile(path.join(__dirname, '/static/correct.html'));
    }
    else {
        resp.sendFile(path.join(__dirname, '/static/wrong.html'));
    }

});

app.get('/targil/:a/:b/:sum', (req, resp) => {
    const a = Number(req.params.a);
    const b = Number(req.params.b);
    const sum = Number(req.params.sum);

    if (isNaN(a)) {
        resp.writeHead(400);
        resp.end(`a is not a number`);
        return;
    }
    if (isNaN(b)) {
        resp.writeHead(400);
        resp.end(`b is not a number`);
        return;
    }
    if (isNaN(sum)) {
        resp.writeHead(400);
        resp.end(`sum is not a number`);
        return;
    }
    if (a + b == sum) {
        resp.sendFile(path.join(__dirname, '/static/correct.html'));
    }
    else {
        resp.sendFile(path.join(__dirname, '/static/wrong.html'));
    }

});


app.get('/targil', (req, resp) => {
    const a = Number(req.body.a);
    const b = Number(req.body.b);
    const sum = Number(req.body.sum);

    if (isNaN(a)) {
        resp.writeHead(400);
        resp.end(`a is not a number`);
        return;
    }
    if (isNaN(b)) {
        resp.writeHead(400);
        resp.end(`b is not a number`);
        return;
    }
    if (isNaN(sum)) {
        resp.writeHead(400);
        resp.end(`sum is not a number`);
        return;
    }
    if (a + b == sum) {
        resp.sendFile(path.join(__dirname, '/static/correct.html'));
    }
    else {
        resp.sendFile(path.join(__dirname, '/static/wrong.html'));
    }

});



app.listen(port, () => {
    console.log(`Listening to port ${port}`);
});