fun main() {
    val age = 3
    if (age in 0..3) {
        println("婴幼儿")
    } else if (age in 3..12) {
        println("少儿")
    } else {
        println("未知")
    }

    if (age !in 4..12) {
        println("不在4至12岁之间")
    }

    val school = "小学"
    val level: Any = when(school) {
        "学前班" -> "幼儿"
        "小学" -> "少儿"
        "中学" -> "青少年"
        else -> {
            println("未知")
        }
    }
    println(level)
}