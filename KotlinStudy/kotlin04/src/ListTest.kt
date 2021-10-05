fun main() {
    val list:List<String> = listOf("Jason", "Jack", "Jacky")
//    println(list[3])
    println(list.getOrElse(3){"Unknow"})
    println(list.getOrNull(3) ?: "Unknow")
}