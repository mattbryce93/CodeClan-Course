const _ = require("lodash");

const Bank = function(){
  this.accounts = [];
};

Bank.prototype.addAccount = function (account) {
  this.accounts.push(account);
};

Bank.prototype.findAccountByName = function (name) {
  return _.find(this.accounts, {"name": name});
  // return _.filter(this.accounts, {"name": name}); //This also works but it returns as an array, for me the find method makes more sense if you're looking for a single result
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
          .filter({'type': type}) //different ways of doing filters, only needs one of these filter lines, but you can choose your preffered style
          .filter(['type', type])
          .filter(account  => account.type === type)
          .sumBy("balance")
          .value();
};

module.exports = Bank;
