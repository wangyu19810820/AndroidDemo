fun main() {
    val total: Int = "Mississippi".count()
    val totalS: Int = "Mississippi".count({ letter ->
        letter == 's'
    })
    println(total)
    println(totalS)

    val blessingFunction: () -> String
    blessingFunction = {
        val holiday = "New Year"
        "Happy $holiday"
    }
    println(blessingFunction())

    val blessingFunction1: (String) -> String = {
        val holiday = "New Year"
        "$it, Happy $holiday"
    }
    println(blessingFunction1("Jack"))

    val blessingFunction2 = {
        val holiday = "New Year"
        "Happy $holiday"
    }
    println(blessingFunction2())

    val blessingFunction3:(String, Int) -> String = {name, year ->
        val holiday = "New Year"
        "$name, Happy $holiday $year"
    }
    println(blessingFunction3("Jack", 2022))

    val blessingFunction4 = {name: String, year: Int ->
        val holiday = "New Year"
        "$name, Happy $holiday $year"
    }
    println(blessingFunction4("Jack", 2022))
}