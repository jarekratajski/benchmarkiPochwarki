package test

object Roots3 {
    fun hasPositiveRoot(a: Double, b: Double, c: Double): Boolean =
        calcRoots(a, b, c)?.let { roots -> roots.any{it > 0 }
        } ?: throw Exception("Polynomial has no real roots")

    private fun calcRoots(a: Double, b: Double, c: Double): Pair<Double, Double>? =
        calcDelta(a, b, c).let { delta ->
            when {
                delta < 0 -> null
                else -> Pair(-b + Math.sqrt(delta) / (2 * a), -b - Math.sqrt(delta) / (2 * a))
            }
        }

    private fun calcDelta(a: Double, b: Double, c: Double) = b * b - 4 * a * c
}

fun <A> Pair<A,A>.any(p: (A)->Boolean) = p(this.first) || p(this.second)

fun main() {
    println(Roots3.hasPositiveRoot(1.0, -2.0, 1.0))
    println(Roots3.hasPositiveRoot(2.0, -2.0, -10.0))
    println(Roots3.hasPositiveRoot(-2.0, -2.0, +10.0))
    println(Roots3.hasPositiveRoot(2.0, +16.0, 10.0))
    println(Roots3.hasPositiveRoot(1.0, +1.0, 10.0))
}

