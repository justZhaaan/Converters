
object Converters {
    val usd = USD()
    val eur = EUR()
    val krw = KRW()

    fun get(currencyCode: String): CurrencyConverter {
        when (currencyCode) {
            "USD" -> {
                println(usd.convertToRub(100))
            }
            "EUR" -> {
                println(eur.convertToRub(100))
            }
            "KRW" -> {
                println(krw.convertToRub(100))
            }
            else -> {
                return object : CurrencyConverter {
                    override val currencyCode: String = currencyCode
                    override fun convertToRub(number: Int){
                        println(" Enter the exchange rate of  $currencyCode to rubles  ")
                        val rateToRub = readLine()?.toInt()
                        println("$number $currencyCode is ${number * rateToRub!!} RUB")
                    }
                }
            }
        }
        return get(" ")

    }
}
