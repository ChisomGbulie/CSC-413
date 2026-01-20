// JavaScript evolution: Adding type discipline
// ES5 (2009) - Dynamic typing only
var x = 10;
console.log("x (initial):", x, "Type:", typeof x);
x = "string"; // Allowed
console.log("x (after reassign):", x, "Type:", typeof x);

// ES6 (2015) - const for immutable references
const PI = 3.14159;
console.log("PI:", PI);
// PI = 3.14; // Would throw TypeError in strict mode

// Modern JS with type discipline patterns
// Using typeof checks for runtime type safety
function add(a, b) {
    if (typeof a !== 'number' || typeof b !== 'number') {
        throw new TypeError('Arguments must be numbers');
    }
    return a + b;
}

console.log("add(5, 3):", add(5, 3));