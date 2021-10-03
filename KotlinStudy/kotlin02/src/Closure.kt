fun main() {
    val getDiscountWords = configDiscountWords()
    print(getDiscountWords("沐浴露"))
}

fun configDiscountWords():(String) -> String {
    val currentYear = 2021
    val hour:Int = (1..24).shuffled().last()
    return {
        "${currentYear}年，双11${it}促销倒计时：$hour 小时"
    }
}