const sqlite3 = require('sqlite3').verbose();
const db_file_loc = 'db1.db';


function open_db(file_name) {
    return new Promise((resolve, reject) => {
        const db = new sqlite3.Database(file_name, (err) => {
            if (err) {
                console.log(`Failed to connect to ${file_name}`);
                reject(err);
            } else {
                console.log(`Successfully connected to ${file_name}`);
                resolve(db);
            }
        });
    });
}
function get_all(db) {
    return new Promise((resolve, reject) => {
        db.all(`SELECT * FROM BOOKS`, (err, row) => {
            if (err) {
                reject(`ERROR: ${err}`);
            } else {
                console.log(row);
                resolve(row);
            }
        });
    });
}

function close_db(db) {
    return new Promise((resolve, reject) => {
        db.close((err) => {
            if (err) {
                console.log(err.message);
                reject(err);
            } else {
                console.log("Database connection closed!");
                resolve(db);
            }
        });
    });
}



async function main() {
    const db = await open_db(db_file_loc);
    await get_all(db);
    await close_db(db);
}

main();

module.exports = main();
