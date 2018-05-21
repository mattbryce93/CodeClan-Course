class BankAccount
  # attr_reader :holder_name, :balance, :type
  # attr_writer :holder_name, :balance, :type
  attr_accessor :holder_name, :balance, :type

  def initialize(input_name, input_balance, input_type)
    @holder_name = input_name
    @balance = input_balance
    @type = input_type
  end

  # def holder_name()
  #   return @holder_name
  # end
  #
  # def balance()
  #   return @balance
  # end
  #
  # def type()
  #   return @type
  # end

  # def set_holder_name(new_name)
  #   @holder_name = new_name
  # end
  #
  # def set_account_balance(new_balance)
  #   @balance = new_balance
  # end
  #
  # def set_account_type(new_type)
  #   @type = new_type
  # end

  def pay_monthly_fee()
    if @type == 'business'
      @balance -= 50
    else
      @balance -= 10
    end
  end

end
