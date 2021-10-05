fun main() {
    val mutableList: MutableList<String> = mutableListOf("Jason", "Jack", "Jacky")
    mutableList.add("Jimmy")
    mutableList.remove("Jack")

    println(mutableList)

    listOf("Jason", "Jack", "Jacky").toMutableList()
    mutableListOf("Jason", "Jack", "Jacky").toList()

    mutableList += "wy"
    println(mutableList)

    mutableList -= "Jason"
    println(mutableList)

    mutableList.removeIf{ it == "wy" }
    println(mutableList)


}