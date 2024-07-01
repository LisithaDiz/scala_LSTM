import scala.io.Source
import scala.collection.mutable.ArrayBuffer

object CSVColumnExtractor {
  def main(args: Array[String]): Unit = {
    val filePath = "seattle-weather.csv"
    
    val bufferedSource = Source.fromFile(filePath)
    
    val columnValues_date = ArrayBuffer[String]()
    val columnValues_temp_max = ArrayBuffer[String]()

    for (line <- bufferedSource.getLines) {
      val cols = line.split(",").map(_.trim)
      if (cols.length > 0 && cols.length > 2) {
        columnValues_date += cols(0)      // val columnIndex_date = 0
        columnValues_temp_max += cols(2)    // val columnIndex_temp_max = 2
      }
    }

    bufferedSource.close()
    
    val columnArray_date: Array[String] = columnValues_date.toArray
    val columnArray__temp_max: Array[String] = columnValues_temp_max.toArray

    println("Date Column:")
    columnArray_date.foreach(println)

    println("Temp Max Column:")
    columnArray__temp_max.foreach(println)

  }
}
