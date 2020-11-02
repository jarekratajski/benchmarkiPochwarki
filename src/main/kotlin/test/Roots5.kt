package test

object Roots5 {
    fun hasPositiveRoot(a: Double, b: Double, c: Double): Boolean =
        calcRoots(a, b, c).any{it > 0}

    private fun calcRoots(a: Double, b: Double, c: Double): List<Double> =
        calcDelta(a, b, c).let { delta ->
            when {
                delta < 0 -> emptyList()
                delta == 0.0 -> listOf(-b + Math.sqrt(delta) / (2 * a))
                else -> listOf(-b + Math.sqrt(delta) / (2 * a), -b - Math.sqrt(delta) / (2 * a))
            }
        }
    private fun calcDelta(a: Double, b: Double, c: Double) = b * b - 4 * a * c
}



fun main() {
    println(Roots4.hasPositiveRoot(1.0, -2.0, 1.0))
    println(Roots4.hasPositiveRoot(2.0, -2.0, -10.0))
    println(Roots4.hasPositiveRoot(-2.0, -2.0, +10.0))
    println(Roots4.hasPositiveRoot(2.0, +16.0, 10.0))
    println(Roots4.hasPositiveRoot(1.0, +1.0, 10.0))
}

