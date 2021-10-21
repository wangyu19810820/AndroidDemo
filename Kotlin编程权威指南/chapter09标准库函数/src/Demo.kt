import java.io.File

fun main() {
    applyTest()
    letTest()
    runTest()
    withTest()
    alsoTest()
    takeIfTest()
    takeUnlessTest()
}

fun applyTest() {
    val menuFile = File("menu-file.txt")
    menuFile.setReadable(true)
    menuFile.setWritable(true)
    menuFile.setExecutable(true)

    val menuFile2 = File("menu-file.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(true)
    }
}

fun letTest() {
    val firstItemSquared = listOf(1, 2, 3).first().let {
        it * it
    }

    val firstElement = listOf(1, 2, 3).first()
    val firstItemSquared2 = firstElement * firstElement

    fun formatGreeting(vipGuest: String?) : String {
        return vipGuest?.let {
            "Welcome, $it. Please, go straight back - your table is ready."
        } ?: "Welcome to the tavern. You'll be seated soon."
    }

    fun formatGreeting2(vipGuest: String?) : String {
        return if (vipGuest != null) {
            "Welcome, $vipGuest. Please, go straight back - your table is ready."
        } else {
            "Welcome to the tavern. You'll be seated soon."
        }
    }
}

fun runTest() {
    val menuFile = File("menu-file.txt")
    val servesDragonsBreath = menuFile.run {
        readText().contains("Dragon's Breath")
    }

    fun nameIsLong(name: String) = name.length >= 20
    "Madrigal".run(::nameIsLong)
    "Polarcubis, Supreme Master of NyetHack".run(::nameIsLong)

    fun playerCreateMessage(nameTooLong: Boolean) : String {
        return if (nameTooLong) {
            "Name is too long. Please choose another name."
        } else {
            "Welcome, adventurer"
        }
    }

    "Polarcubis, Supreme Master of NyetHack"
        .run(::nameIsLong)
        .run(::playerCreateMessage)
        .run(::println)

    println(playerCreateMessage(nameIsLong("Polarcubis, Supreme Master of NyetHack")))

    val healthPoints = 100
    val status = run {
        if (healthPoints == 100) "perfect health" else "has injuries"
    }
}

fun withTest() {
    val nameTooLong = with("Polarcubis, Supreme Master of NyetHack") {
        length > 20
    }
}

fun alsoTest() {
    var fileContents: List<String>
    File("menu-file.txt")
        .also {
            println(it.name)
        }.also {
            fileContents = it.readLines()
        }
}

fun takeIfTest() {
    val fileContents = File("menu-file.txt")
        .takeIf { it.canRead() && it.canWrite() }
        ?.readText()
    val file = File("menu-file.txt")
    val fileContents2 = if (file.canRead() && file.canWrite()) {
        file.readText()
    } else {
        null
    }
}

fun takeUnlessTest() {
    val fileContents = File("menu-file.txt").takeUnless { it.isHidden }?.readText()
}