val priceCoffeeByDay: Map[String, Double] = Map(
  "Sunday" -> 2.45,
  "Monday" -> 3.54,
  "Tuesday" -> 4.50,
  "Wednesday" -> 3.21,
  "Thursday" -> 5.11,
  "Friday" -> 2.39,
  "Saturday" -> 5.87
)

val sum = priceCoffeeByDay.values.sum
val min = priceCoffeeByDay.values.min

val ReduceOther = priceCoffeeByDay.values.reduce((a, b) => a + b)
val ReduceOther2 = priceCoffeeByDay.values.reduce(_ + _)
val minUsingReduce = priceCoffeeByDay.values.reduce(_ min _)