// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a step shape
// with N levels using the # character.  Make sure the
// step has spaces on the right hand side!
// --- Examples
//   steps(2)
//       '# '
//       '##'
//   steps(3)
//       '#  '
//       '## '
//       '###'
//   steps(4)
//       '#   '
//       '##  '
//       '### '
//       '####'

function steps(n, row = 0, stair = '') {
    if (n === row) {
        return;
    }

    if (n === stair.length) {
        console.log(stair);
        return steps(n, ++row);
    }

    stair += stair.length <= row ? '#' : ' ';

    steps(n, row, stair);
}

// function steps(n, pounds = 1, spaces = n - 1) {
//     if (pounds > n) {
//         return;
//     }

//     let level = '';

//     // generate pounds
//     for (let i = 0; i < pounds; i++) {
//         level += '#';
//     }

//     // generate spaces
//     for (let i = 0; i < spaces; i++) {
//         level += ' ';
//     }

//     console.log(level);
//     steps(n, ++pounds, --spaces);
// }

// function steps(n) {
//     let num = n;

//     for (let i = 1; i <= n; i++) {
//         console.log(getLevel(i, num - i));
//     }
// }

// function getLevel(poundCount, spaceCount) {
//     let level = '';

//     // generate pound
//     for (let i = 0; i < poundCount; i++) {
//         level += '#';
//     }

//     // generate space
//     for (let i = 0; i < spaceCount; i++) {
//         level += ' ';
//     }
 
//     return level;
// }

module.exports = steps;
