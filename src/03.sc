class Employee(f: String, l: String, s: Int) {
  private val departmentCodeByName: Map[String, String] = Map(
    "HR" -> "Human Resources",
    "ACT" -> "Account",
    "R&D" -> "Research and Development",
    "MKT" -> "Marketing",
    "SLS" -> "Sales",
    "OPS" -> "Operations"
  )

  private val first = f
  private val last = l
  private var stocks: Int = s

  def getFirst = first

  def getLast = last

  def getStocks = stocks

  def awardMoreStocks(numberOfStocks: Int) = stocks += numberOfStocks

  def getDepartmentName(code: String): String =
    departmentCodeByName.getOrElse(code, "Code not found")

  override def toString: String = first + " " + last + " " + stocks
}

var bobMartin = new Employee("Bob", "Martin", 10)
bobMartin.getFirst
bobMartin.getLast
bobMartin.getStocks

bobMartin.awardMoreStocks(15)
bobMartin.getStocks

bobMartin.getDepartmentName("HR")
