fun main() {
    var str: String? = "butterfly"
//    str = ""
//    println(str?.capitalize())
//    str = str?.let {
//        if (it.isNotBlank()) {
//            it.capitalize()
//        } else {
//            "butterfly"
//        }
//    }
//    println(str)

//    str = null
//    println(str!!.capitalize())

//    str = str?.capitalize()?.plus(" is great")

    str = "rose"
    println(str ?: "jack")

    str = null
    str = str?.let { it.capitalize() } ?: "butterfly"
    println(str)
}