const val NAME = "Jimmy's friend"
const val NAMES = "jack,jacky,jason"

fun main() {
    val index:Int = NAME.indexOf('\'')
    var str1 = NAME.substring(0, index)
    println(str1)

    var str2 = NAME.substring(0 until index)
    println(str2)

    var data:List<String> = NAMES.split(",")
    val (origin:String, dest:String, proxy:String) = NAMES.split(",")
    println("$origin $dest $proxy")

    val str3 = "The people's Republic of China"
    val str4 = str3.replace(Regex("[aeiou]")) {
        when(it.value) {
            "a" -> "8"
            "e" -> "6"
            "i" -> "9"
            "o" -> "1"
            "u" -> "3"
            else -> it.value
        }
    }
    println(str3)
    println(str4)
}