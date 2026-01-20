// JavaScript evolution: From var to let/const
// ES5 (2009) - Function-scoped var with hoisting
function example() {
    console.log(x); // undefined (hoisted)
    var x = 10;
    if (true) {
        var y = 20; // Function-scoped
    }
    console.log(y); // 20 (accessible)
}

// ES6 (2015) - Block-scoped let/const
function modernExample() {
    // console.log(z); // ReferenceError (TDZ)
    let z = 30;
    if (true) {
        let w = 40; // Block-scoped
    }
    // console.log(w); // ReferenceError
}