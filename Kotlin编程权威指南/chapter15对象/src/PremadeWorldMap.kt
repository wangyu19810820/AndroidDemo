import java.io.File

class PremadeWorldMap {

    // 对象表达式
    val abandonedTownSquare = object : Room("wy") {
        override fun load() = "You anticipate applause, but no one is here..."
    }

    // 伴生对象
    companion object {
        private const val MAPS_FILEPATH = "menu-file.txt"

        fun load() = File(MAPS_FILEPATH).readBytes()
    }
}

fun main() {
    PremadeWorldMap.load()
}