case class Dollars(amount: Double)

def withTax(dollars: Dollars, taxRate: Double) = Dollars(dollars.amount + (1 + taxRate))

withTax(Dollars(200), 0.10)
