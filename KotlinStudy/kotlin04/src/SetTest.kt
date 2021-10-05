fun main() {
    val set = setOf<String>("Jason", "Jack", "Jacky", "Jack")
    println(set)
    println(set.elementAt(2))

    val mutableSet = mutableSetOf<String>("Jason", "Jack", "Jacky", "Jack")
    mutableSet += "Jimmy"
    mutableSet -= "Jason"
    println(mutableSet)

    var list = listOf<String>("Jason", "Jack", "Jacky", "Jack")
        .toSet()
        .toList()
    println(list)

    println(listOf<String>("Jason", "Jack", "Jacky", "Jack").distinct())
}