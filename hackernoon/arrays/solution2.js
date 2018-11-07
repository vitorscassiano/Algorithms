/*
	How do you find the duplicate number on a given integer array?
*/

function findMissingNumber(list) {
    const map = new Map();
    for (const i of list) {
        if(map.get(i)){
            let count = map.get(i)
            map.set(i, ++count)
        } else {
            map.set(i,1)
        }
    }

    for (const [key, value] of map.entries()) {
        if(value > 1) {
            return key;
        }
    }
}

function main() {
	const list = [1,2,3,4,5,5];
    const missingNumber = findMissingNumber(list);
    console.log(missingNumber);
}

main();
