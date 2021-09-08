// --- Directions
// Write a function that accepts a string.  The function should
// capitalize the first letter of each word in the string then
// return the capitalized string.
// --- Examples
//   capitalize('a short sentence') --> 'A Short Sentence'
//   capitalize('a lazy fox') --> 'A Lazy Fox'
//   capitalize('look, it is working!') --> 'Look, It Is Working!'

function capitalize(str) {
    str = str.charAt(0).toUpperCase() + str.slice(1);
    const chars = str.split('');

    for (let i = 1; i < chars.length; i++) {
        if (chars[i] === ' ') {
            chars[i + 1] = chars[i + 1].toUpperCase();
        }
    }

    return chars.join('');
}

// function capitalize(str) {
//     const words = str.split(' ');
//     let captitalizeSentence = '';

//     for (let word of words) {
//         // capitalize first character
//         word = word.charAt(0).toUpperCase() + word.slice(1);

//         captitalizeSentence = `${captitalizeSentence} ${word}`;
//     }

//     return captitalizeSentence.trim();
// }

module.exports = capitalize;
