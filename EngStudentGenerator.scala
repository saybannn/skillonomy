import scala.util.Random

object EngStudentGenerator
{
  def generateNewStudentEng(): Student =   // ГЕНЕРАЦИЯ СТУДЕНТА АНГЛИЙСКОГО
  {
    val username = randomUsername()
    val tokenLocked = 0
    val tokenAvailable = Random.nextInt(50)
    val currentCourse = "English"
    val ListOfMarks = List()

    new Student(username, tokenLocked, tokenAvailable, currentCourse, ListOfMarks)
  }

  def randomUsername(): String =   // ГЕНЕРАЦИЯ ЮЗЕРНЕЙМА СТУДЕНТА
  {
    val allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val usernameLength = 8
    val username = (1 to usernameLength).map(_ => allowedChars(Random.nextInt(allowedChars.length))).mkString
    username
  }
}
