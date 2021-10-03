fun main() {
    val result: Int = listOf<Int>(3, 2, 1).first().let {
        it * it
    }
    println(result)

    val firstElement:Int = listOf<Int>(3, 2, 1).first()
    val result2: Int = firstElement * firstElement

    println(formatGreeting("Jack"))
}

fun formatGreeting(questName: String?): String {
    return questName?.let {
        "Welcome, $it"
    } ?: "What's your name?"
}

fun formatGreeting2(questName: String?) : String {
    return if (questName != null) {
        "Welcome, $questName"
    } else {
        "What's your name?"
    }
}