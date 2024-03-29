/* Extending classes and using Traits */
trait Db {
  private var contents: Map[String, String] = Map.empty
  def save(key: String, value: String) = contents += (key -> value)
  def get(key: String): Option[String] = contents.get(key)
}

class Human

class Employee extends  Human with Db

val employees: Db = new Employee
employees.save("e1", "Bob")
employees.save("e2", "Amy")

employees.get("e2")