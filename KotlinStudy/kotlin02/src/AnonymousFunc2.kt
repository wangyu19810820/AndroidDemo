fun main() {
    var getDiscountWords = {goodsName:String, hour:Int ->
        var currentYear = 2017
        "${currentYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }

    showOnBoard("卫生纸", getDiscountWords)
    showOnBoard("卫生纸"){ goodsName:String, hour:Int ->
        var currentYear = 2017
        "${currentYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }
}

private fun showOnBoard(goodsName:String, getDiscountWords:(String, Int) -> String) {
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName, hour))
}