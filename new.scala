import com.github.tototoshi.csv._

object New {
  def main(args: Array[String]): Unit = {
    val filePath = "./seattle-weather.csv"

    val reader = CSVReader.open(new java.io.File(filePath))

    val rows = reader.all()

    rows.foreach { row =>
      println(row.mkString(", ")) 
    }

    reader.close()
  }
}
