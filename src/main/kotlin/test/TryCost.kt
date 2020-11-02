package test

object TryCost {

    fun trivialSum(a: Long, b: Long) =
        (a..b).sum().also {
            if ( it > 200000000) {
                -1
            } else {
                it
            }
        }

    fun tryCatchSum(a: Long, b: Long) =
        (a..b).sum().also {
            try {
                if ( it > 200000000) {
                    throw Exception("should not happen")
                } else {
                    it
                }
            } finally{

            }

        }
}
