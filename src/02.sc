class Employee(val first: String, last: String) {
  override def toString: String = first + " " + last
}

var bobMartin = new Employee("Bob", "Martin")
bobMartin.first

class Color(val value: String)
val c = new Color("read")
c.value

class Shape(var value: String)
val s = new Shape("circle")
s.value
s.value = "square"
s.value

