var readline = require('readline');

var rl = readline.createInterface(
    process.stdin, process.stdout);

function your_age() {
    const my_promies = new Promise((success, failure) => {
        rl.setPrompt(`What is your age? `);
        rl.prompt();
        rl.on('line', (age) => {
            if (age < 99) {
                success(age);

            }
            else {

                failure(`ERROR ${age}`);
            }
            rl.close();
        });

    });
    return my_promies;
}


// // your_age().then(
// //     value => { { console.log(`Age received by the user: ${value}`) } },
// //     error => { console.log(error) });


async function run_it() {
    try {
        const success = await your_age();
        console.log(success);
    }
    catch (error) {
        console.log(`Error: ${error}`);

    }
}

run_it();


const fs = require('fs');
function your_file() {
    const file_promies = new Promise((success, failure) => {

        fs.readdir(__dirname, (err, files) => {
            if (err) {
                failure(err);
            }
            else {
                success(files);
            }
        })

    });
    return file_promies;
}

async function toRun() {
    try {
        const success = await your_file();
        console.log(success);
    }
    catch (error) {
        console.log(`Error: ${error}`);

    }
}

toRun();


// file_promies.then(
//     (value) => {
//         console.log(value);
//     }
// )
// .catch(err => {
//     console.log(err);
// } )





