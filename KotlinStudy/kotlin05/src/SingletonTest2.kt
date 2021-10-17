open class Player {
    open fun load() = "loading nothing..."
}

fun main() {
    val p = object : Player() {
        override fun load(): String {
            return "anonymous class loading..."
        }
    }
    println(p.load())
}