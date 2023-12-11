class Exchange(var exchangeTokens: Double, var fiatMoney: Double, var priceToken: Double) {

  // МЕТОД ВЫЗЫВАЕТСЯ В ТОМ СЛУЧАЕ, КОГДА СТУДЕНТ СОВЕРШАЕТ ПОКУПКУ ТОКЕНОВ, А ТАКЖЕ МЕТОД МЕНЯЕТ ТЕКУЩУЮ ЦЕНУ ТОКЕНА
    def BuyingTokens(value:Double): Unit = {
      exchangeTokens -= value
      fiatMoney += value
      priceToken = fiatMoney / exchangeTokens
    }
}
