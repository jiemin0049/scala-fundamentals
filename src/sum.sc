/* Partially Applied Functions */
def sum(a: Int, b: Int, c: Int) = a + b + c

/* case 1: when all arguments are supplied */
val s1 = sum(1, 2, 3)

/* case 2: wehn one argument is not supplied */
val s2 = sum(_: Int, 2, 3)
val s3 = sum(1, _: Int, 2)
val s4 = sum(1, 2, _: Int)
s2(1)
s2(2)
s2(3)

/* case 2: wehn 2 arguments are not supplied */
val s5 = sum(_: Int, _: Int, 2)
val s6 = sum(1, _: Int, _: Int)
s5(1, 2)
s6(2, 3)

/* case 3: wehn no arguments are not supplied */
val s7 = sum(_: Int, _: Int, _: Int)
val s8 = sum _
s7(1, 2, 3)
s8(1, 2, 3)
