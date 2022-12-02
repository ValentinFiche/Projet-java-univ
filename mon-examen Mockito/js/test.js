const HelloString = require('./HelloString.js').HelloString;
const {expect} = require("chai");
let myPrint = new HelloString();

describe('Simple Math Test', () => {
    it('should return hello world', () => {
        expect(myPrint.Print()).to.equal("hello world");
    });
    it('should return hello world again', () => {
        expect(myPrint.Print()).to.equal("hello world");
    })
})