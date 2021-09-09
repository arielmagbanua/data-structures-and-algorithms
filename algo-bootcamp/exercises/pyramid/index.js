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

function pyramid(n) {
    let width = (n * 2) - 1;
    

    for (let row = 1; row <= n; row++) {
        const pounds = (row * 2) - 1;
        sideSpaces = (width - pounds) / 2;

        let level = '';

        for (let i = 0; i < sideSpaces; i++) {
            level += ' ';
        }

        for (let i = 0; i < pounds; i++) {
            level += '#';
        }

        for (let i = 0; i < sideSpaces; i++) {
            level += ' ';
        }

        console.log(level);
    }
}

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
