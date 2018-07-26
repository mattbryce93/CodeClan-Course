const _ = require("lodash");

const Bank = function(){
  this.accounts = [];
};

Bank.prototype.addAccount = function (account) {
  this.accounts.push(account);
};

Bank.prototype.findAccountByName = function (name) {
  return _.filter(this.accounts, ["name", name]);
};

Bank.prototype.findLargestAccount = function () {
  return _.maxBy(this.accounts, "balance");
};

Bank.prototype.findTotalOfBalances = function () {
  return _.sumBy(this.accounts, "balance");
};

Bank.prototype.averageAccountBalance = function () {
  return _.meanBy(this.accounts, "balance");
};

Bank.prototype.totalValueOfAccountType = function (type) {
  return _.chain(this.accounts)
          .filter(['type', type])
          .sumBy("balance")
          .value();
};

module.exports = Bank;
