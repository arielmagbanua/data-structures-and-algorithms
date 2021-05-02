// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

function maxChar(str) {
  let charMap = {};
  let max = 0;
  let maxChar = '';

  for (let char of str) {
    if (charMap[char]) {
      charMap[char]++;
    } else {
      charMap[char] = 1;
    }
  }

  for (let char in charMap) {
    if (charMap[char] > max) {
      max = charMap[char];
      maxChar = char;
    }
  }

  return maxChar;
}

module.exports = maxChar;

// my solution
// function maxChar(str) {
//   let charRef = {};
//
//   for (let character of str) {
//     if (!charRef[character]) {
//       charRef[character] = 0;
//     }
//
//     ++charRef[character];
//   }
//
//   let chosenKey = '';
//   let count = 0;
//   for (let [key, value] of Object.entries(charRef)) {
//     if (count < value) {
//       count = value;
//       chosenKey = key;
//     }
//   }
//
//   return chosenKey;
// }
