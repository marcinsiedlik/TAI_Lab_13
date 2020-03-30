var Complex = /** @class */ (function () {
    function Complex(real, imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex.prototype.add = function (number) {
        return new Complex(this.real + number.real, this.imaginary + number.imaginary);
    };
    Complex.prototype.subtract = function (number) {
        return new Complex(this.real - number.real, this.imaginary - number.imaginary);
    };
    Complex.prototype.module = function () {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    };
    Complex.prototype.toString = function () {
        return "Complex: real=" + this.real + ", imaginary=" + this.imaginary;
    };
    return Complex;
}());
var number1 = new Complex(2, 4);
var number2 = new Complex(6, 8);
var added = number1.add(number2);
console.log("add: " + added);
var subtracted = added.subtract(number1);
console.log("subtract: " + subtracted);
var module = subtracted.module();
console.log("module: " + module);
