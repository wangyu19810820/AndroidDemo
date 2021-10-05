class Player7 {
    val name: String
    private fun firstLetter() = name[0]

    init {
        name = "Jack"
        println(firstLetter())
    }
}

fun main() {
    Player7()
}