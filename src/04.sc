object Employee {
  private val departmentCodeByName: Map[String, String] = Map(
    "HR" -> "Human Resources",
    "ACT" -> "Account",
    "R&D" -> "Research and Development",
    "MKT" -> "Marketing",
    "SLS" -> "Sales",
    "OPS" -> "Operations"
  )

  def apply(first: String, last: String, stocks: Int): Employee =
    new Employee(first, last, stocks)

  def getDepartmentName(code: String): String =
    departmentCodeByName.getOrElse(code, "Code not found")
}

class Employee(f: String, l: String, s: Int) {

  private val first = f
  private val last = l
  private val stocks: Int = s

  def getFirst = first

  def getLast = last

  def getStocks = stocks

  def awardMoreStocks(numberOfStocks: Int): Employee
  = Employee(first, last, stocks + numberOfStocks)

  override def toString: String = first + " " + last + " " + stocks
}

val bobMartin = Employee("Bob", "Martin", 12)
bobMartin.awardMoreStocks(25)
Employee.getDepartmentName("HR")
