fun main() {
    val result1: Boolean = "The people's Republic of China".run {
        length >= 10
    }
    val result2 = with("The people's Republic of China") {
        length >= 10
    }
}