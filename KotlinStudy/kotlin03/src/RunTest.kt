import java.io.File

fun main() {
    var file = File("/Users/wangyu/Downloads/a/a/使用必看.txt")
    val result = file.run {
        readText().contains("https")
        "xxx"
    }
    println(result)

    val result2: Boolean = "The people's Republic of China".run(::isLong)
    println(result2)

    "The people's Republic of China"
        .run(::isLong)
        .run(::showMessage)
        .run(::println)
}

fun isLong(name: String) = name.length >= 10

fun showMessage(isLong: Boolean): String {
    return if(isLong) {
        "Name is too long."
    } else {
        "Please rename."
    }
}