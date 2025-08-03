// File: shape.kt
interface Shape {
    fun setup()
    fun draw()
}

class Circle : Shape {
    override fun setup() {
        println("Setting up Circle")
    }

    override fun draw() {
        println("Drawing a Circle")
    }
}

class Square : Shape {
    override fun setup() {
        println("Setting up Square")
    }

    override fun draw() {
        println("Drawing a Square")
    }
}

fun runShapeDemo() {
    val shapes: List<Shape> = listOf(Circle(), Square())
    for (shape in shapes) {
        shape.setup()
        shape.draw()
    }
}
