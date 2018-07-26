const assert = require("assert");
const Account = require("../account");

describe("Account", function(){
    let account;

    beforeEach(function(){
        account = new Account("John", 1000, "personal");
    });

    it("should have a name", function(){
        assert.strictEqual(account.name, "John");
    });

    it("should have a balance", function(){
        assert.strictEqual(account.balance, 1000);
    });
    
    it("should have a type", function(){
        assert.strictEqual(account.type, "personal");
    });
});