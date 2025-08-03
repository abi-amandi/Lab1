fun whoAmI(value: Any): String {
    return value::class.simpleName ?: "Unknown"
}
