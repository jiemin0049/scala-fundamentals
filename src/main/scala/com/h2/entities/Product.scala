package main.scala.com.h2.entities

abstract class Product {
  val name: String

  override def toString: String = "product=" + name
}

/* --------------------Deposits Products -------------*/
abstract class Deposits extends Product {
  val minBalancePerMonth: Int
  val interestRatePerYear: Double
}

abstract class Checkings extends Deposits

abstract class Savings extends Deposits {
  val transactionsAllowedPerMonth: Int
}

/* --------------------Deposits Products -------------*/
class CoreChecking(bal: Int, rate: Double) extends Checkings {
  println("created Core Checking Product")
  override val interestRatePerYear: Double = rate
  override val minBalancePerMonth: Int = bal
  override val name: String = "Core Checking"
}

class StudentChecking(bal: Int, rate: Double) extends Checkings {
  println("created Student Checking Product")
  override val interestRatePerYear: Double = rate
  override val minBalancePerMonth: Int = bal
  override val name: String = "Student Checking"
}

/* --------------------Saving Products -------------*/
class RewardsSavings(bal: Int, rate: Double, trans: Int) extends Savings {
  println("created Rewards Savings Product")
  override val interestRatePerYear: Double = rate
  override val minBalancePerMonth: Int = bal
  override val transactionsAllowedPerMonth: Int = bal
  override val name: String = "Rewards Savings"
}

/* ------------------- Lending Products -------------*/
abstract class Lending extends Product {
  val annualFee: Double
  val apr: Double
  val rewardsPercent: Double
}

class CreditCard(fee: Double, rate: Double, pct: Double) extends Lending {
  override val annualFee: Double = fee
  override val apr: Double = rate
  override val rewardsPercent: Double = pct
  override val name: String = "Credit Card"
}
