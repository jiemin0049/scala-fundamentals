class Employee {
  var first: String = ""
  var last: String = ""
  override def toString: String = first + " " + last
}

var amyJones = new Employee
amyJones.first = "Amy"
amyJones.last = "Jones"
amyJones

var bobMartin = new Employee
bobMartin.first = "Bob"
bobMartin.last = "Martin"
bobMartin