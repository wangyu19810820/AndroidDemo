import java.io.File

fun main() {
    val result: String? = File("/Users/wangyu/Downloads/a/a/使用必看.txt")
        .takeUnless { it.isHidden }
        ?.readText()
    println(result)
}