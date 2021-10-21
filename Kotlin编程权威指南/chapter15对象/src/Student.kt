sealed class StudentStatus {
    object NotEnrolled: StudentStatus()
    class Active(val courseId: String): StudentStatus()
    object Graduated: StudentStatus()
}

class Student(var status: StudentStatus)

fun main() {
    val student = Student(StudentStatus.Active("Kotlin101"))
    println(studentMessage(student.status))
}

fun studentMessage(status: StudentStatus) : String {
    return when(status) {
        is StudentStatus.NotEnrolled -> "Please choose a course"
        is StudentStatus.Active -> "You are enrolled in: ${status.courseId}"
        is StudentStatus.Graduated -> "Congratulations!"
    }
}