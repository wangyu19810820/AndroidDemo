data class Student(var name: String, val age: Int) {
    private val hobby = "music"
    val subject: String
    var score = 0

    init {
        println("initializing student")
        subject = "Math"
    }

    constructor(_name: String) : this(_name, 10) {
        score = 10
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, hobby='$hobby', subject='$subject', score=$score)"
    }

}

fun main() {
    val s = Student("Jack")
    val copy = s.copy("Rose")

    println(s)
    println(copy)
}