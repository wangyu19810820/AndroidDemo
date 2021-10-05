class Player3(
    _name: String,
    var age: Int = 20,
    var isNormal: Boolean
) {
    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    constructor(name: String) : this(name, age = 10, isNormal = false)

    constructor(name: String, age: Int) : this(name, age, isNormal = false) {
        this.name = name.toUpperCase()
    }

    init {
        require(age > 0){"age must be positive"}
        require(name.isNotBlank()){"Player must have a name."}
    }
}

fun main() {
    val p = Player3(isNormal = false, _name = "")


}