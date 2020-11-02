package test

object Roots {
    fun hasPositiveRoot(a: Double, b: Double, c: Double): Boolean {
        val delta = b * b - 4 * a * c
        if (delta < 0) {
            throw Exception("Polynomial has no real roots")
        }

        val x1 = (-b + Math.sqrt(delta)) / (2 * a)
        val x2 = (-b - Math.sqrt(delta)) / (2 * a)
        return x1 > 0 || x2 > 0
    }
}


fun main() {
    println(Roots.hasPositiveRoot(1.0,-2.0, 1.0))
    println(Roots.hasPositiveRoot(2.0,-2.0, -10.0))
    println(Roots.hasPositiveRoot(-2.0,-2.0, +10.0))
    println(Roots.hasPositiveRoot(2.0,+16.0, 10.0))
}
