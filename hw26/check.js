const equal_is = (arr1, arr2) => {
    if (!(Array.isArray(arr1) && Array.isArray(arr2))) {
        throw new Error('One of the parameters is not array');
    }
    else {
        if (arr1.length == arr2.length) {
            for (let i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
        else return false;
    }
}

const bigger_is = (num1, num2) => {
    if (!(typeof num1 == 'number' && typeof num2 == 'number')) {
        throw new Error('One of the parameters is not number');
    }
    else {
        if (num1 > num2) return true;
        else return false;
    }
}

module.exports = {
    equal_is , bigger_is
}
