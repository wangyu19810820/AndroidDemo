import java.io.File

fun main() {
    val result: String? = File("/Users/wangyu/Downloads/a/a/使用必看.txt")
        .takeIf { it.exists() && it.canRead() }
        ?.readText()
    println(result)
}