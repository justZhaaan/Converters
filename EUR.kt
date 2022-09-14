
class EUR() : CurrencyConverter {
    override val currencyCode = "EUR"
    override fun convertToRub(number: Int){
        println("$number $currencyCode in rubles will be ${number * 71}")
    }
}