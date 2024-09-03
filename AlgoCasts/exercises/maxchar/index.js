// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

function maxChar(str) {
  const charMap = {};

  for (let char of str) {
    charMap[char] = charMap[char] + 1 || 1;
  }

  let greatestKey = null;
  let greatestValue = 0;
  for (const [key, value] of Object.entries(charMap)) {
    if (value > greatestValue) {
      greatestKey = key;
      greatestValue = value;
    }
  }

  return greatestKey;
}

module.exports = maxChar;
