const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a sentence: ', (inputSentence) => {
    // Process the input sentence here
    const reversedSentence = inputSentence
        .split(' ')
        .map(word => word.split('').reverse().join(''))
        .join(' ');

    console.log('Reversed Sentence: ' + reversedSentence);

    rl.close();
});
