abstract class Employee(val name: String, val id: Int) {
    abstract fun showDetails()
}

class TemporaryStaff(name: String, id: Int, val contractDuration: Int) : Employee(name, id) {
    override fun showDetails() {
        println("Temporary Staff: $name, ID: $id, Duration: $contractDuration months")
    }
}

class PermanentStaff(name: String, id: Int, val pension: Boolean) : Employee(name, id) {
    override fun showDetails() {
        println("Permanent Staff: $name, ID: $id, Pension Eligible: $pension")
    }
}

fun runEmployeeDemo() {
    val temp = TemporaryStaff("Alex", 101, 6)
    val perm = PermanentStaff("Sara", 102, true)

    temp.showDetails()
    perm.showDetails()
}
