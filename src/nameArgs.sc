import java.time.LocalDateTime

def division(numerator: Int, denominator: Int) = numerator / denominator
division(20, 10)
division(denominator = 10, numerator = 20)


def log(message: String, eventTime: LocalDateTime = LocalDateTime.now) = println(s"$eventTime -> $message")
log("Hello World!", LocalDateTime.of(2018, 6, 12, 0, 0, 0))
log("I am hello!")