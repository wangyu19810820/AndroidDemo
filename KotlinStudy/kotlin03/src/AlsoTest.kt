import java.io.File

fun main() {
    var fileContents:List<String>
    val file: File = File("/Users/wangyu/Downloads/a/a/使用必看.txt")
        .also {
            println(it.name)
        }.also {
            fileContents = it.readLines()
        }

    println(fileContents)
}