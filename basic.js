function factors(num) {
    const result = [];
    for (let i = 1; i <= num; i++) {
        if (num % i === 0) {
            result.push(i);
        }
    }
    return result;
}

// Test cases
console.log(factors(45)); // [1, 3, 5, 9, 15, 45]
console.log(factors(53)); // [1, 53]
console.log(factors(64)); // [1, 2, 4, 8, 16, 32, 64]
