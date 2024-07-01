import scala.io.Source
import scala.collection.mutable.ArrayBuffer
import breeze.linalg._
import breeze.plot._
import java.text.SimpleDateFormat
import java.util.Date

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

    // Convert date strings to a numerical format
    val dateFormat = new SimpleDateFormat("M/d/yyyy")
    val dates = columnValues_date.map(dateFormat.parse(_).getTime.toDouble / (1000 * 60 * 60 * 24)).toArray
    val tempMax = columnValues_temp_max.toArray

    // Create the plot
    val fig = Figure()
    val plt = fig.subplot(0)

    plt += plot(DenseVector(dates), DenseVector(tempMax), '.')
    plt.xlabel = "Date (days since epoch)"
    plt.ylabel = "Max Temperature (°C)"
    plt.title = "Date vs Max Temperature"

    fig.refresh()
  }
}
