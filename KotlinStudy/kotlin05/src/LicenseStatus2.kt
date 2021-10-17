sealed class LicenseStatus2 {
    object UNQUALIFIED : LicenseStatus2()
    object LEARNING : LicenseStatus2()
    class QUALIFIED(var licenseId: String) : LicenseStatus2()
}

class Driver2(var status: LicenseStatus2) {
    fun checkLicense() : String {
        return when(status) {
            is LicenseStatus2.UNQUALIFIED -> "没资格"
            is LicenseStatus2.LEARNING -> "在学"
            is LicenseStatus2.QUALIFIED -> "有资格,驾驶证编号：${(this.status as LicenseStatus2.QUALIFIED).licenseId}"
        }
    }
}

fun main() {
    var status = LicenseStatus2.QUALIFIED("123456")
    var driver = Driver2(status)
    println(driver.checkLicense())
}