class Coach(val usernameC: String, var tokenLocked: Int, var tokenAvailable: Int, val course: String, val price: Int) {
    var student_names: List[String] = List() // список студентов у учителя

  // ИНФА ПО УЧИТЕЛЮ
    def infoCoach: String = s"Username: $usernameC, Tokens Locked: $tokenLocked," +
      s"Tokens Available: $tokenAvailable," + s"Course: $course, Price for course: $price"

    def displayStudentNames(usernameC: String): Unit = // метод ВЫВОДА ИМЕН СТУДЕНТОВ
    {
      val studentNamesString = student_names.mkString(", ")
      println(s"Students of Coach $usernameC: $studentNamesString")
    }

    def addNewStudent(student: Student): Unit = { // метод для ДОБАВЛЕНИЯ нового студента В КОЛЛЕКЦИЮ
      student_names = student.usernameS :: student_names
    }

    def updateTokenAvailable(tokens: Int): Unit = {   // ПОКУПКА ТОКЕНОВ
      tokenAvailable += tokens
    }
  }
