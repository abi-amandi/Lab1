fun printNames() {
    val names = arrayOf("Anna", "Ben", "Chris", "Diana", "Eli")
    for ((index, name) in names.withIndex()) {
        println("$index: $name")
    }
}
