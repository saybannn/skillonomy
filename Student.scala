import scala.util.Random

  class Student(var usernameS: String, var tokenLocked: Int, var tokenAvailable: Double,
                var currentCourse: String = "", var ListOfMarks: List[Int] = List()) {

    // ИНФА ПО СТУДЕНТУ
    def infoStudent: String = s"Username: $usernameS, Tokens Locked: $tokenLocked," +
      s"Tokens Available: $tokenAvailable," + s"ListOfMarks: ${ListOfMarks}," + s"Current course: $currentCourse"

    def Payment(Minus: Int): Unit =   // МЕТОД ПЛАТЕЖА
    {
      tokenAvailable -= Minus
    }

    def releaseTokens(): Unit = {    // ОСВОБОЖДЕНИЕ ЗАЛОЧЕНЫХ ТОКЕНОВ
      tokenAvailable += tokenLocked
      tokenLocked = 0
    }

    def addRandomMark(): Unit = {   // ГЕНЕРАЦИЯ РАНДОМНОЙ ОЦЕНКИ
      val randomMark = Random.nextInt(5) + 1
      ListOfMarks = ListOfMarks :+ randomMark
    }

    def buyTokens(value: Double): Unit = {    // ПОКУПКА ТОКЕНОВ НА БИРЖЕ
      tokenAvailable += value
    }
  }
