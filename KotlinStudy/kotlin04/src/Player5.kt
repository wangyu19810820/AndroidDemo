class Player5(_name: String) {
    var name = _name
    val config by lazy {loadingConfig()}

    private fun loadingConfig(): String {
        println("loading...")
        return "xxx"
    }
}

fun main() {
    val p = Player5("Jack")
    Thread.sleep(3000)
    println(p.config)
}