fun main() {
    val str1 = "Jason"
    val str2 = "jason".capitalize()
    println(str1 == str2)
    println(str1 === str2)

    "The people's Republic of China".forEach {
        println("$it *")
    }
}