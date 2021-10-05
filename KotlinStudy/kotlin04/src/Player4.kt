class Player4 {
    lateinit var equipment: String

    fun ready() {
        equipment = "Sharp knife"
    }

    fun battle() {
        if (::equipment.isInitialized) {
            println(equipment)
        }
    }
}

fun main() {
    val p = Player4()
    p.ready()
    p.battle()
}