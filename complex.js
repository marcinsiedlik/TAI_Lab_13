"use strict";
class Complex {
    constructor(real, imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    add(number) {
        return new Complex(this.real + number.real, this.imaginary + number.imaginary);
    }
    subtract(number) {
        return new Complex(this.real - number.real, this.imaginary - number.imaginary);
    }
    module() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }
    toString() {
        return `Complex: real=${this.real}, imaginary=${this.imaginary}`;
    }
}
let number1 = new Complex(2, 4);
let number2 = new Complex(6, 8);
let added = number1.add(number2);
console.log(`add: ${added}`);
let subtracted = added.subtract(number1);
console.log(`subtract: ${subtracted}`);
let module = subtracted.module();
console.log(`module: ${module}`);
