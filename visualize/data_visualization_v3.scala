import scala.io.Source
import scala.collection.mutable.ArrayBuffer
import breeze.linalg._
import breeze.plot._

object CSVColumnExtractor {
  def main(args: Array[String]): Unit = {
    val filePath = "seattle-weather.csv"

    val bufferedSource = Source.fromFile(filePath)

    val columnValues_date = ArrayBuffer[String]()
    val columnValues_temp_max = ArrayBuffer[Double]()

    var isFirstLine = true

    for (line <- bufferedSource.getLines) {
      if (isFirstLine) {
        isFirstLine = false
      } else {
        val cols = line.split(",").map(_.trim)
        if (cols.length > 0 && cols.length > 2) {
          columnValues_date += cols(0)
          columnValues_temp_max += cols(2).toDouble
        }
      }
    }

    bufferedSource.close()

    // Create the plot
    val f = Figure()
    val p = f.subplot(0)

    p += plot(columnValues_temp_max.indices.map(_.toDouble).toArray, columnValues_temp_max.toArray, '.')
    p.title = "Date vs Max Temperature"
    p.xlabel = "Date (days since epoch)"
    p.ylabel = "Max Temperature (°C)"

    f.saveas("temperature_plot.png")
  }
}
