package main.scala.com.h2.entities

class Account(c: Customer, p: Product, b: Int) {
  val customer: Customer = c
  val product: Product = p
  private var balance: Int = b

  def deposit(amount: Int) = {
    require(amount > 0, "amount deposited should be greater than zero.")
    println(s"Depositing $amount to $customer account")
    balance += amount
  }

  def withdraw(amount: Int) = {
    require(amount > 0 && balance > amount, "amount error!")
    println(s"Withdrawing $amount to $customer account")
    balance -= amount
  }

  override def toString = s"$customer with $product has remaining balance of $balance"
}
