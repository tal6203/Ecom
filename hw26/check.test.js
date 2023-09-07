const check = require('./check');
const assert = require('assert');
const expect = require('chai').expect;
const { json } = require('express');
const axios = require('axios');
const config = require('config');



describe('Testing basic functionality of the equal_is', () => {
    it('Send 2 arrays with equal members', () => {
        const actual = check.equal_is([1, 2, 3], [1, 2, 3]);


        const expected = true;

        assert.strictEqual(expected, actual);
    });
    it('Send 2 arrays with different members', () => {
        const actual = check.equal_is([1, 1, 3], [9, 2, 3]);


        const expected = false;

        assert.strictEqual(expected, actual);
    });

    it('Send 2 arrays with different length', () => {
        const actual = check.equal_is([1, 2, 3], [1, 2, 3, 4]);


        const expected = false;

        assert.strictEqual(expected, actual);
    });

    it('Send first parameter an array and second a number', () => {
        assert.throws(() => {
            check.equal_is([1, 2, 3], 27);
        });
    });

    it('Send first parameter an number and second a array', () => {
        assert.throws(() => {
            check.equal_is(45, [1, 2, 3]);
        });
    });

    it('Send first parameter an number and second a array', () => {
        assert.throws(() => {
            check.equal_is(18, [18, 9, 17]);
        });
    });

});


describe('Testing basic functionality of the bigger_is', () => {
    it('Sends the first parameter a larger number than the second parameter', () => {
        const actual = check.bigger_is(12, 5);


        const expected = true;

        assert.strictEqual(expected, actual);
    });

    it('Sends the first parameter a smaller number than the second parameter', () => {
        const actual = check.bigger_is(4, 82);


        const expected = false;

        assert.strictEqual(expected, actual);
    });

    it('Two parameters are different in type', () => {
        assert.throws(() => {
            check.bigger_is(4, [14, 4]);
            check.bigger_is([1, 15, 87], true);
            check.bigger_is([14, 4], 17);
        });
    });
});

const port = config.express.port;


it('bring number from DB and Two parameters from db', async () => {
    const res = await axios.get(`http://localhost:${port}/getnumber`);
    const numberFromDb = res.data.numbers;
    for (let i = 0; i < numberFromDb.length - 1; i++) {
        assert.throws(() => {
            check.bigger_is(numberFromDb[i], numberFromDb[i + 1]);
            check.bigger_is(numberFromDb[i], numberFromDb[i + 1]);
            check.bigger_is(numberFromDb[i], numberFromDb[i + 1]);
        });
    }
});


