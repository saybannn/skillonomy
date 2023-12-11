object Main
{
  def main(args: Array[String]): Unit = {

    // КОЛ-ВО ТОКЕНОВ И ФИАТНЫХ ДЕНЕГ НА БИРЖЕ
    val CurrentExchange = new Exchange(20000, 20000, 0)

    // УЧИТЕЛЬ АНГЛИЙСКОГО
    val EnglishCoach = new Coach("Vitaliy123", 100, 0, "English", 100)
    println(EnglishCoach.infoCoach)

    var engStudent1: Student = null   // ИНИЦИАЛИЗАЦИЯ ГЛОБАЛЬНЫХ ПЕРЕМЕННЫХ СТУДЕНТОВ
    var engStudent2: Student = null
    var engStudent3: Student = null
    var engStudent4: Student = null
    var engStudent5: Student = null

    var scholarshipfor1 = 0.0    // ИНИЦИАЛИЗАЦИЯ ГЛОБАЛЬНЫХ ПЕРЕМЕННЫХ СТИПЕНДИЙ СТУДЕНТОВ
    var scholarshipfor2 = 0.0
    var scholarshipfor3 = 0.0
    var scholarshipfor4 = 0.0
    var scholarshipfor5 = 0.0


    var month = 1  // МЕСЯЦ 1
    do {
        engStudent1 = EngStudentGenerator.generateNewStudentEng()   // ГЕНЕРАЦИЯ ИНФОРМАЦИИ О СТУДЕНТАХ
        engStudent2 = EngStudentGenerator.generateNewStudentEng()
        engStudent3 = EngStudentGenerator.generateNewStudentEng()
        engStudent4 = EngStudentGenerator.generateNewStudentEng()
        engStudent5 = EngStudentGenerator.generateNewStudentEng()

        // ВОЗРАСТАНИЕ ЦЕНЫ ТОКЕНА В ЗАВИСИМОСТИ ОТ КОЛИЧЕСТВА КУПЛЕНЫХ ТОКЕНОВ СТУДЕНТАМИ
        // ПОКУПКА НЕДОСТАЮЩИХ ТОКЕНОВ, ТОЕСТЬ ЕСЛИ КОЛ-ВО ТОКЕНОВ У СТУДЕНТА МЕНЬШЕ ЦЕНЫ КУРСА

        if (engStudent1.tokenAvailable < EnglishCoach.price)
        {
          val needToBuy = (EnglishCoach.price - engStudent1.tokenAvailable)
          engStudent1.buyTokens(needToBuy)
          CurrentExchange.BuyingTokens(needToBuy)
        }

        if (engStudent2.tokenAvailable < EnglishCoach.price)
        {
          val needToBuy = (EnglishCoach.price - engStudent2.tokenAvailable)
          engStudent2.buyTokens(needToBuy)
          CurrentExchange.BuyingTokens(needToBuy)
        }

        if (engStudent3.tokenAvailable < EnglishCoach.price)
        {
          val needToBuy = (EnglishCoach.price - engStudent3.tokenAvailable)
          engStudent3.buyTokens(needToBuy)
          CurrentExchange.BuyingTokens(needToBuy)
        }

        if (engStudent4.tokenAvailable < EnglishCoach.price)
        {
          val needToBuy = (EnglishCoach.price - engStudent4.tokenAvailable)
          engStudent4.buyTokens(needToBuy)
          CurrentExchange.BuyingTokens(needToBuy)
        }

        if (engStudent5.tokenAvailable < EnglishCoach.price)
        {
          val needToBuy = (EnglishCoach.price - engStudent5.tokenAvailable)
          engStudent5.buyTokens(needToBuy)
          CurrentExchange.BuyingTokens(needToBuy)
        }


          engStudent1.releaseTokens()   // ОСВОБОЖДЕНИЕ ЗАЛОЧЕНЫХ ТОКЕНОВ
          engStudent2.releaseTokens()
          engStudent3.releaseTokens()
          engStudent4.releaseTokens()
          engStudent5.releaseTokens()

      month += 1
    } while (month == 1)

    println(engStudent1.infoStudent)  // ИНФА О ПОЛУЧЕННЫХ СТУДЕНТАХ
    println(engStudent2.infoStudent)
    println(engStudent3.infoStudent)
    println(engStudent4.infoStudent)
    println(engStudent5.infoStudent)

    println("================================================")

    do {  // МЕСЯЦ 2

      // ОПЛАТА И ЗАПИСЬ К УЧИТЕЛЮ НА КУРС
      engStudent1.Payment(EnglishCoach.price)
      EnglishCoach.addNewStudent(engStudent1)

      engStudent2.Payment(EnglishCoach.price)
      EnglishCoach.addNewStudent(engStudent2)

      engStudent3.Payment(EnglishCoach.price)
      EnglishCoach.addNewStudent(engStudent3)

      engStudent4.Payment(EnglishCoach.price)
      EnglishCoach.addNewStudent(engStudent4)

      engStudent5.Payment(EnglishCoach.price)
      EnglishCoach.addNewStudent(engStudent5)

      month += 1
    } while (month == 2)

    println(EnglishCoach.displayStudentNames("Vitaliy123"))   // ИНФОРМАЦИЯ О СТУДЕНТАХ УЧИТЕЛЯ

    println("================================================")

    do {  // МЕСЯЦ 3
      engStudent1.addRandomMark()  // РАНДОМНАЯ ОЦЕНКА ЗА КУРС ДЛЯ КАЖДОМУ СТУДЕНТУ
      engStudent2.addRandomMark()
      engStudent3.addRandomMark()
      engStudent4.addRandomMark()
      engStudent5.addRandomMark()

      // НАЧИСЛЕНИЕ СТИПЕНДИИ СТУДЕНТАМ В ЗАВИСИМОСТИ ОТ ИХ ОЦЕНКИ

      if (engStudent1.ListOfMarks.head == 1)
      {
        scholarshipfor1 = 0.7 * EnglishCoach.price
        engStudent1.tokenAvailable += scholarshipfor1
      }

      else if (engStudent1.ListOfMarks.head == 2)
      {
        scholarshipfor1 = 0.8 * EnglishCoach.price
        engStudent1.tokenAvailable += scholarshipfor1
      }

      else if (engStudent1.ListOfMarks.head == 3)
      {
        scholarshipfor1 = 0.9 * EnglishCoach.price
        engStudent1.tokenAvailable += scholarshipfor1
      }

      else if (engStudent1.ListOfMarks.head == 4)
      {
        scholarshipfor1 = 1 * EnglishCoach.price
        engStudent1.tokenAvailable += scholarshipfor1
      }

      else if (engStudent1.ListOfMarks.head == 5)
      {
        scholarshipfor1 = 1.1 * EnglishCoach.price
        engStudent1.tokenAvailable += scholarshipfor1
      }

/////////////////////////////////////////////////////////////////////////////////

      if (engStudent2.ListOfMarks.head == 1) {
        scholarshipfor2 = 0.7 * EnglishCoach.price
        engStudent2.tokenAvailable += scholarshipfor2

      }

      else if (engStudent2.ListOfMarks.head == 2) {
        scholarshipfor2 = 0.8 * EnglishCoach.price
        engStudent2.tokenAvailable += scholarshipfor2
      }

      else if (engStudent2.ListOfMarks.head == 3) {
        scholarshipfor2 = 0.9 * EnglishCoach.price
        engStudent2.tokenAvailable += scholarshipfor2
      }

      else if (engStudent2.ListOfMarks.head == 4) {
        scholarshipfor2 = 1 * EnglishCoach.price
        engStudent2.tokenAvailable += scholarshipfor2
      }

      else if (engStudent2.ListOfMarks.head == 5) {
        scholarshipfor2 = 1.1 * EnglishCoach.price
        engStudent2.tokenAvailable += scholarshipfor2
      }

      /////////////////////////////////////////////////////////////////////////////////

      if (engStudent3.ListOfMarks.head == 1) {
        scholarshipfor3 = 0.7 * EnglishCoach.price
        engStudent3.tokenAvailable += scholarshipfor3

      }

      else if (engStudent3.ListOfMarks.head == 2) {
        scholarshipfor3 = 0.8 * EnglishCoach.price
        engStudent3.tokenAvailable += scholarshipfor3
      }

      else if (engStudent3.ListOfMarks.head == 3) {
        scholarshipfor3 = 0.9 * EnglishCoach.price
        engStudent3.tokenAvailable += scholarshipfor3
      }

      else if (engStudent3.ListOfMarks.head == 4) {
        scholarshipfor3 = 1 * EnglishCoach.price
        engStudent3.tokenAvailable += scholarshipfor3
      }

      else if (engStudent3.ListOfMarks.head == 5) {
        scholarshipfor3 = 1.1 * EnglishCoach.price
        engStudent3.tokenAvailable += scholarshipfor3
      }

      /////////////////////////////////////////////////////////////////////

      if (engStudent4.ListOfMarks.head == 1) {
        scholarshipfor4 = 0.7 * EnglishCoach.price
        engStudent4.tokenAvailable += scholarshipfor4

      }

      else if (engStudent4.ListOfMarks.head == 2) {
        scholarshipfor4 = 0.8 * EnglishCoach.price
        engStudent4.tokenAvailable += scholarshipfor4
      }

      else if (engStudent4.ListOfMarks.head == 3) {
        scholarshipfor4 = 0.9 * EnglishCoach.price
        engStudent4.tokenAvailable += scholarshipfor4
      }

      else if (engStudent4.ListOfMarks.head == 4) {
        scholarshipfor4 = 1 * EnglishCoach.price
        engStudent4.tokenAvailable += scholarshipfor4
      }

      else if (engStudent4.ListOfMarks.head == 5) {
        scholarshipfor4 = 1.1 * EnglishCoach.price
        engStudent1.tokenAvailable += scholarshipfor4
      }

      //////////////////////////////////////////////////////////////

      if (engStudent5.ListOfMarks.head == 1) {
        scholarshipfor5 = 0.7 * EnglishCoach.price
        engStudent5.tokenAvailable += scholarshipfor5

      }

      else if (engStudent5.ListOfMarks.head == 2) {
        scholarshipfor5 = 0.8 * EnglishCoach.price
        engStudent5.tokenAvailable += scholarshipfor5
      }

      else if (engStudent5.ListOfMarks.head == 3) {
        scholarshipfor5 = 0.9 * EnglishCoach.price
        engStudent5.tokenAvailable += scholarshipfor5
      }

      else if (engStudent5.ListOfMarks.head == 4) {
        scholarshipfor5 = 1 * EnglishCoach.price
        engStudent5.tokenAvailable += scholarshipfor5
      }

      else if (engStudent5.ListOfMarks.head == 5) {
        scholarshipfor5 = 1.1 * EnglishCoach.price
        engStudent5.tokenAvailable += scholarshipfor5
      }

      month += 1
    } while (month == 3)

  }
}
