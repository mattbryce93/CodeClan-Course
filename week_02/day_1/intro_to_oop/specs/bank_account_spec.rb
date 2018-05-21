require( 'minitest/autorun' )
require( 'minitest/rg' )
require_relative( '../bank_account' )

#each instance of a bank account has a balance, a holder name
#and each bank account has a type, either personal or business

class TestBankAccount < Minitest::Test

  def test_account_name
    bank_account = BankAccount.new('John', 500, 'business')
    assert_equal("John", bank_account.holder_name)
  end

  def test_account_balance
    bank_account = BankAccount.new('John', 500, 'business')
    assert_equal(500, bank_account.balance)
  end

  def test_account_type
    bank_account = BankAccount.new('John', 500, 'business')
    assert_equal("business", bank_account.type)
  end

  def test_set_account_name
    #  arrange
    bank_account = BankAccount.new('John', 500, 'business')
    # act
    bank_account.holder_name = 'John McC'
    #assert
    assert_equal('John McC', bank_account.holder_name)
  end

  def test_set_account_balance
    bank_account = BankAccount.new('John', 500, 'business')
    bank_account.balance = 100
    assert_equal(100, bank_account.balance)
  end

  def test_set_account_type
    bank_account = BankAccount.new('John', 500, 'business')
    bank_account.type = 'personal'
    assert_equal('personal', bank_account.type)
  end

  def test_monthly_fee
    bank_account = BankAccount.new('John', 500, 'business')
    bank_account.pay_monthly_fee()
    assert_equal(450, bank_account.balance)
  end

  def test_monthly_fee__personal
    bank_account = BankAccount.new('John', 500, 'personal')
    bank_account.pay_monthly_fee()
    assert_equal(490, bank_account.balance)
  end
end
