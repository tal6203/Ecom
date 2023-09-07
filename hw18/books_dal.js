const sqlite3 = require('sqlite3').verbose();
const db_file_loc = 'db1.db';

function open_db(file_name) {
    return new Promise((resolve, reject) => {
        const db = new sqlite3.Database(file_name, (err) => {
            if (err) {
                console.log(`Failed to connect to ${file_name}`);
                reject(err);
            }
            else {
                console.log(`Successfully connected to ${file_name}`);
                resolve(db);
            }
        });
    })


}

function get_all(db) {
    return new Promise((resolve, reject) => {
        db.all(`SELECT * FROM BOOKS`, (err, row) => {
            if (err) {
                reject(`ERROR: ${err}`);
            }
            else {
                console.log(row);
                resolve();
            }
        })
    })
}





function get_by_id(db, id) {
    return new Promise((resolve, reject) => {
        db.all(`SELECT * FROM BOOKS WHERE id = ${id};`, (err, row) => {
            if (err) {
                console.log(err);
                reject(err)
            }
            else {
                console.table(row);
                resolve();
            }
        });
    });
}

function insert(db, user) {
    return new Promise((resolve, reject) => {
        const insert_user = `INSERT INTO BOOKS (title,publish_year,price,left_in_stock,book_image_src)
                         VALUES(?, ?, ?, ?, ?);`
        db.run(insert_user, user, (err) => {
            if (err) {
                console.log(err);
                reject(err);
            }
            else {
                console.log(user);
                resolve();
            }
        });
    });
}

function up(db, id, current_field, updated_value) {
    return new Promise((resolve, reject) => {
        const sql_update = `UPDATE BOOKS
                        SET ${current_field} = ?
                        WHERE id = ? ;`;
        db.run(sql_update, [updated_value, id], err => {
            if (err) {
                console.log(err);
                reject(err)
            }
            else {
                console.log(`The update will be done successfully${updated_value}`);
                resolve();
            }
        });

    })
}

function find_by_title(db, title) {
    return new Promise((resolve, reject) => {
        db.serialize(() => {
            db.each(`SELECT * FROM BOOKS WHERE title GLOB '${title}*' ;`, (err, row) => {
                if (err) {
                    console.log(err);
                    reject(err)
                }
                else {
                    console.log(row.title);
                    resolve();
                }
            });
        });
    });
}



function delete_by_id(db, id) {
    return new Promise((resolve, reject) => {
        const sql_delete = `DELETE FROM BOOKS WHERE ID = ?;`
        db.run(sql_delete, [id], err => {
            if (err) {
                console.log(err);
                reject(err)
            }
            else {
                console.log(`id ${id} delete`);
                resolve();
            }
        });
    });
}



function close_db(db) {
    return new Promise((resolve, reject) => {
        db.close(err => {
            if (err) {
                console.log(err.message);
                reject(err);
            }
            else {
                console.log('Database connection closed!');
                resolve(db);
            }
        });
    });
}




const user = ["spider man", 2003, 120, 7, "book5.jpg"];

async function main() {
    const db = await open_db(db_file_loc);
    console.log(db);
    await get_all(db);
    await get_by_id(db, 6);
    //await insert(db, user);
    await up(db, 7, "publish_year", 2004);
    await find_by_title(db, "ri");
    await delete_by_id(db, 7);
    await close_db(db);
}

main();

// const init = async () => {
//     let res = await fetch("https://randomuser.me/api/");
//     let data = await res.json();
//     console.log(data.results[0].name.first);
// }

// init();