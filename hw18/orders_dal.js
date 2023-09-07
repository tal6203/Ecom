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

function apply_fk(db) {
    return new Promise((resolve, reject) => {
        db.get("PRAGMA foreign_keys = ON", (err, res) => {
            if (err) {
                console.log(`error ${JSON.stringify(err)}`);
                reject(err)
            }
            else {
                console.log(`res ${JSON.stringify(res)}`);
                resolve(res);
            }
        })
    });
}




function get_all(db) {
    return new Promise((resolve, reject) => {
        db.all(`SELECT * FROM ORDERS`, (err, row) => {
            if (err) {
                console.log(`ERROR: ${err}`);
                reject(err)
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
        db.all(`SELECT * FROM ORDERS WHERE id = ${id};`, (err, row) => {
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


function insert(db, order) {
    return new Promise((resolve, reject) => {
        const insert_user = `INSERT INTO ORDERS (book_id,how_many,time_of_order,customer_fname,customer_lname,credit_card)
                         VALUES(? , ?, ?, ?, ?, ?);`
        db.run(insert_user, order, (err) => {
            if (err) {
                console.log(err);
                reject(err)
            }
            else {
                console.log(order);
                resolve();
            }
        });
    });
}


function up(db, id, current_field, updated_value) {
    return new Promise((resolve, reject) => {
        const sql_update = `UPDATE ORDERS
                        SET ${current_field} = ?
                        WHERE id = ? ;`;
        db.run(sql_update, [updated_value, id], err => {
            if (err) {
                console.log(err);
                reject(err)
            }
            else {
                console.log(updated_value);
                resolve();
            }
        });

    })
}

function delete_by_id(db, id) {
    return new Promise((resolve, reject) => {
        const sql_delete = `DELETE FROM ORDERS WHERE ID = ?;`
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





const customer = [1, 100, new Date().toLocaleString(), "eitan", "aharon", "2113-7658-2468-7998"];

async function main() {
    const db = await open_db(db_file_loc);
    console.log(db);
    await apply_fk(db);
    await get_all(db);
    //await insert(db,customer);
    //await get_by_id(db,4);
    //await up(db,4,"how_many",150);
    //await delete_by_id(db,2);
    await close_db(db);
}

main();
