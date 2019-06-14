case class Dollars(amount: Int) {
  def prettify: String = "$" + amount
}

implicit def doubleToDollars(d: Int) = Dollars(d)

val customerBalance: Int = 10000
customerBalance prettify