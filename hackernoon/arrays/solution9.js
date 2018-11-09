/*
 * How do you reverse an array in place in Java? (solution)
 */

function reverseInPlace(arr) {
    const len = arr.length;
    for(let i = 0; i < len/2; i++) {
        let temp;

        debugger;
        temp = arr[i];
        arr[i] = arr[len-i];
        arr[len-i] = temp;
    }
}

function main() {
    let arr = [1,2,3,4,5,6];
    reverseInPlace(arr);
    console.log(arr);
}

main();
