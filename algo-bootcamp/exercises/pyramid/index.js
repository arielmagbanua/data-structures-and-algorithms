// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a pyramid shape
// with N levels using the # character.  Make sure the
// pyramid has spaces on both the left *and* right hand sides
// --- Examples
//   pyramid(1)
//       '#'
//   pyramid(2)
//       ' # '
//       '###'
//   pyramid(3)
//       '  #  '
//       ' ### '
//       '#####'

function pyramid(n, row = 0, level = '') {
    if (row === n) {
        return;
    }

    if (level.length === 2 * n - 1) {
        console.log(level);
        return pyramid(n, ++row);
    }

    const midpoint = Math.floor((2 * n - 1) / 2);
    let add;
    
    if (midpoint - row <= level.length && midpoint + row >= level.length) {
        add = '#';
    } else {
        add = ' ';
    }

    pyramid(n, row, level + add);
}

// function pyramid(n) {
//     const midpoint = Math.floor((2 * n - 1) / 2);

//     for (let row = 0; row < n; row++) {
//         let level = '';
        
//         for (let column = 0; column < 2 * n - 1; column++) {
//             if (midpoint - row <= column && midpoint + row >= column) {
//                 level += '#';
//             } else {
//                 level += ' ';
//             }
//         }

//         console.log(level);
//     }
// }

// function pyramid(n) {
//     let width = (n * 2) - 1;

//     for (let row = 1; row <= n; row++) {
//         const pounds = (row * 2) - 1;
//         let sideSpaces = (width - pounds) / 2;

//         let level = '';

//         for (let i = 0; i < sideSpaces; i++) {
//             level += ' ';
//         }

//         for (let i = 0; i < pounds; i++) {
//             level += '#';
//         }

//         for (let i = 0; i < sideSpaces; i++) {
//             level += ' ';
//         }

//         console.log(level);
//     }
// }

// function pyramid(n) {
//     let spaces = n;
//     let pounds = 1;

//     for (let row = 1; row <= n; row++) {
//         spaces -= 1;

//         let level = '';

//         for (let i = 0; i < spaces; i++) {
//             level += ' ';
//         }

//         for (let i = 0; i < pounds; i++) {
//             level += '#';
//         }

//         for (let i = 0; i < spaces; i++) {
//             level += ' ';
//         }

//         pounds += 2; 
//         console.log(level);
//     }
// }

module.exports = pyramid;
