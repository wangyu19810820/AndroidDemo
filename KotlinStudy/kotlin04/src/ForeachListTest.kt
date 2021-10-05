fun main() {
    val list:List<String> = listOf("Jason", "Jack", "Jacky", "Jimmy")
    for (s in list) {
        println(s)
    }

    list.forEach{
        println(it)
    }

    list.forEachIndexed { index, s ->
        println("$index, $s")
    }

    val(origin: String, _: String, proxy: String) = list
    println("origin:$origin, proxy:$proxy")
}