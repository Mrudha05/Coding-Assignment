const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter numbers separated by space: ', (input) => {
    // Convert the input string to an array of numbers
    const numbers = input.split(' ').map(Number);

    // Sorting the array in descending order using a custom sorting function
    const sortedArray = numbers.sort((a, b) => b - a);

    console.log('Sorted Array in Descending Order: ', sortedArray);

    rl.close();
});
