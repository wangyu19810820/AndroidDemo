fun main() {
//    var greetingFunction: (String) -> String = { playerName ->
//        val currentYear = 2018
//        "Welcome to SimVillage, $playerName!(copyright $currentYear)"
//    }
//
//    greetingFunction = {
//        val currentYear = 2018
//        "Welcome to SimVillage, $it!(copyright $currentYear)"
//    }
//
//    val greetingFunction2 = { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName!(copyright $currentYear)"
//    }
//
//    runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName!(copyright $currentYear)"
//    }

    runSimulation()
}

inline fun runSimulation(playerName: String,
                         costPrinter: (Int) -> Unit,
                         greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost:${cost * numBuildings}")
}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName!(copyright $currentYear)"
    }
}