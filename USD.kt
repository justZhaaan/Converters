
 class USD() : CurrencyConverter {
     override val currencyCode = "USD"
     override fun convertToRub(number: Int){
        println("$number $currencyCode in rubles will be ${number * 67}")
     }
}