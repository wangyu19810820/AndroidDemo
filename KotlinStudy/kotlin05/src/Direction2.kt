enum class Direction2(private val coordinate: Coordinate) {
    EAST(Coordinate(1, 0)),
    WEST(Coordinate(-1, 0)),
    SOUTH(Coordinate(-1, 0)),
    NORTH(Coordinate(1, 0));

    fun updateCoordinate(playerCoordinate: Coordinate) =
        Coordinate(playerCoordinate.x + coordinate.x, playerCoordinate.y + coordinate.y)
}

fun main() {
    println(Direction2.EAST.updateCoordinate(Coordinate(10, 20)))
}