const http = require('http');
const fs = require('fs');



const host = 'localhost';
const port = 9000;

function readfileasync(path_to_file) {
    return new Promise((resolve, reject) => {
        fs.readFile(path_to_file, (err, data) => {
            if (!err) {
                resolve(data);
            }
            else {
                reject(err);
            }
        })
    })
}

const server = http.createServer(async (request, response) => {
    console.log(request.url);
    switch (request.url) {
        case "/":
        case "/index.html":
            try {
                const data = await readfileasync(__dirname + '/index.html');
                response.setHeader("Content-Type", "text/html");
                response.writeHead(200);
                response.end(data);
                break;
            }
            catch (err) {
                response.writeHead(500);
                response.end(err);
                return;
            }
        case "/time":
            try {
                response.setHeader("Content-Type", "text/html");
                response.writeHead(200);
                response.end(`${new Date().toLocaleTimeString()}`);
                break;
            }
            catch (err) {
                response.writeHead(500);
                response.end(err);
                return;
            }
        case "/posts":
            try {
                const data = await readfileasync(__dirname + '/posts.json');
                response.setHeader("Content-Type", "application/json");
                response.writeHead(200);
                response.end(data);
                break;
            }
            catch (err) {
                response.writeHead(500);
                response.end(err);
                return;
            }
        case "/random":
            try {
                response.setHeader("Content-Type", "text/html");
                response.writeHead(200);
                response.end(`<script>document.write(${Math.floor(Math.random() * 101)})</script>`);
                break;
            }
            catch (err) {
                response.writeHead(500);
                response.end(err);
                return;
            }
        case "/date":
            try {
                response.setHeader("Content-Type", "text/html");
                response.writeHead(200);
                response.end(`${new Date().toLocaleDateString()}`);
                break;
            }
            catch (err) {
                response.writeHead(500);
                response.end(err);
                return;
            }
        case "/getBooks":
            try {

                response.setHeader("Content-Type", "application/json");
                response.writeHead(200);
                response.end();
                break;
            }
            catch (err) {
                response.writeHead(500);
                response.end(err);
                return;
            }
        case "/books":
            try {
                const data = await readfileasync(__dirname + '/books.html');
                response.setHeader("Content-Type", "text/html");
                response.writeHead(200);
                response.end(data);
                break;
            }
            catch (err) {
                response.writeHead(500);
                response.end(err);
                return;
            }
        default:
            response.writeHead(200);
            response.end(`<h1> your url :<br /> ${request.url}</h1>`);
            break;
    }
})

server.listen(port, host, () => {
    console.log(`Server is running on http://${host}:${port}`);
})