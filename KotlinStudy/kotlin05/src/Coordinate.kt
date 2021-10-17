data class Coordinate(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0
}

fun main() {
    println(Coordinate(10, 20))

    println(Coordinate(10, 20) == Coordinate(10, 20))

    val (x, y) = Coordinate(10, 20)
    println("$x, $y")
}