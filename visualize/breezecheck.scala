import breeze.linalg._
import breeze.plot._

object BreezeCheck {
  def visual(): Unit = {
    val f = Figure()
    val p = f.subplot(0)
    val x = linspace(0.0,1.0)
    p += plot(x, x ^:^ 2.0)
    p += plot(x, x ^:^ 3.0, '.')
    p.xlabel = "x axis"
    p.ylabel = "y axis"
    f.saveas("lines1.png") 
  }


  def main(args: Array[String]): Unit = {
    // Generate some data points
    visual()
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
    f.saveas("check2.png")  // Save plot as PNG file
  }
}
