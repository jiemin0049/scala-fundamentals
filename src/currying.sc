/* function with no currying */
def multiplySimple(a: Int, b: Int) = a * b

val a = multiplySimple(2, 10)

/* function with currying */
def multiplycurry(a: Int)(b: Int) = a * b

val b = multiplycurry(2)(10)

/* refers to the second function in
   curried form by partially applying on multipleCurry */
val c = multiplycurry(2) _
b == c(10)


def time(n: Int)(operation: Int => Unit) = {
  val startTime = System.currentTimeMillis()
  operation(n)
  val elapsedTime = System.currentTimeMillis() - startTime
  println(s"====== operation took $elapsedTime ms ======")
}

val operation = (n: Int) => {
  Thread.sleep(1000)
  val numbers = (1 to n).toList
  println(s"Sum of first $n numbers is ${numbers.sum}")
}

time(100)(operation)
time(100) {operation}
time(10000) {
  n => val numbers2 = (1 to n).toList
    println(s"Sum of first $n numbers2 is ${numbers2.sum}")
}