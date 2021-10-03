import java.io.File

fun main() {
    val file1 = File("/Users/wangyu/Downloads/a/a/使用必看.txt")
    file1.setReadable(true)
    file1.setWritable(true)
    file1.setExecutable(false)

    val file2: File = File("~/Downloads/a/a/使用必看.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
}