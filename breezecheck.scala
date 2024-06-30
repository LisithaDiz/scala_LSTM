import com.github.breeze.linalg._
import com.github.breeze.plot._

object BreezeVizExample {
  def main(args: Array[String]): Unit = {
    // Generate some data points
    val x = linspace(0.0, 1.0, 100)
    val y = x.map(xi => math.sin(2.0 * math.Pi * xi))

    // Create a new figure
    val f = Figure()

    // Plot a line chart
    val p = f.subplot(0)
    p += plot(x, y, name = "sin(x)")

    // Customize plot properties
    p.title = "Simple Line Chart"
    p.xlabel = "x"
    p.ylabel = "sin(x)"

    // Display the plot
    f.refresh()
    f.saveas("linechart.png")  // Save plot as PNG file
  }
}
