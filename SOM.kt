
class KRW() :CurrencyConverter {
    override val currencyCode = "KRW"
    override fun convertToRub(number: Int){
        println("$number $currencyCode in rubles will be ${number * 0.5}")
    }
}