// --- Directions
// Given an integer, return an integer that is the reverse
// ordering of numbers.
// --- Examples
//   reverseInt(15) === 51
//   reverseInt(981) === 189
//   reverseInt(500) === 5
//   reverseInt(-15) === -51
//   reverseInt(-90) === -9

function reverseInt(n) {
  const reversed = n.toString()
    .split('')
    .reverse()
    .join('');

  return parseInt(reversed) * Math.sign(n);
}

module.exports = reverseInt;

// My Solution
// function reverseInt(n) {
//   let signResult = Math.sign(n);
//
//   if (signResult === 0) {
//     return 0;
//   }
//
//   // convert number to array
//   let numArr = n.toString()
//     .split('');
//
//   if (signResult === 1) {
//     let reversed = numArr.reverse()
//       .join('');
//
//     return parseInt(reversed);
//   }
//
//   // pluck the first character
//   numArr.shift();
//   let reversed = '-' + numArr.reverse()
//     .join('');
//
//   return parseInt(reversed);
// }
