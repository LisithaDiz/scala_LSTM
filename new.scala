import com.github.tototoshi.csv._

object New {
  def main(args: Array[String]): Unit = {
    // Define the path to your CSV file
    val filePath = "./submission_key.csv"

    // Create a CSV reader
    val reader = CSVReader.open(new java.io.File(filePath))

    // Read all rows as a list of Seq[String]
    val rows = reader.all()

    // Process each row
    rows.foreach { row =>
      // Access each field in the row as needed
      println(row.mkString(", ")) // Example: print each row
    }

    // Close the reader when done
    reader.close()
  }
}
