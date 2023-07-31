function buildLetterFrequency(text) {
    const frequency = {};
    const letters = text.toLowerCase().replace(/[^a-zа-я]/g, "");

    for (const letter of letters) {
        frequency[letter] = (frequency[letter] || 0) + 1;
    }

    return frequency;
}

const text = "This is a sample text to build a letter frequency dictionary.";
const letterFrequency = buildLetterFrequency(text);
console.log(letterFrequency);