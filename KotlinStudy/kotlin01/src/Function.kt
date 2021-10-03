fun main() {
    println(doSomething(age = 5, flag = false))
    println(fix("wy"))
    TODO("nothing")
    println("after nothing")
}

private fun doSomething(age: Int, flag: Boolean) : String {
    return "result age=$age, flag=$flag"
}

fun fix(name: String, age: Int = 2) {
    println("$name $age")
}