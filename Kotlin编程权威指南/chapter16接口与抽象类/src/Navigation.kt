data class Coordinate(val x: Int, val y:Int) {
     val isInBounds = x >= 0 && y >= 0

    operator fun plus(other: Coordinate) = Coordinate(x + other.x, y + other.y)
}

enum class Direction(private val coordinate: Coordinate) {
    NORTH(Coordinate(0, -1)),
    EAST(Coordinate(1, 0)),
    SOUTH(Coordinate(0, 1)),
    WEST(Coordinate(-1, 0));

    fun updateCoordinate(playerCoordinate: Coordinate) = coordinate + playerCoordinate
}

fun main() {
    val c1 = Coordinate(0, 0)
    val c2 = c1.copy()
    println(c1 == c2)
    println("$c1, $c2")
    val (x, y) = c1
    println("$x, $y")
}