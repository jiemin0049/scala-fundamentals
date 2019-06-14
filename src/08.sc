/* Function Literals*/
def transform(numbers: Seq[Int], f: Int => Int) = numbers.map(number => f(number))

val n = Seq(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

val incrementedBy1 = transform(n, (x: Int) => x + 1)

val squared = transform(n, x => math.pow(x, 2).intValue())

val multipliedBy2 = transform(n, 2 * _)

/* Function Values */
val multiply = (a: Int, b: Int) => a * b
multiply

multiply(2, 10)
multiply(3, 4)