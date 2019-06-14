package main.scala.com.h2.entities

import java.time.LocalDate
class Customer(f: String, l: String, e: String, b: LocalDate) {
  val first: String = f
  val last: String = l
  val email: String = e
  val birthday: LocalDate = b

  override def toString: String = first + "," + last
}
