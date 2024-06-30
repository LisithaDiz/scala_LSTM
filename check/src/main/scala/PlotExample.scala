import com.cibo.evilplot.plot._
import com.cibo.evilplot.plot.aesthetics.DefaultTheme._
import com.cibo.evilplot.numeric.Point

object PlotExample {
  def main(args: Array[String]): Unit = {
    val data = Seq.tabulate(100) { i =>
      Point(i.toDouble, scala.util.Random.nextDouble())
    }

    // Create the scatter plot
    val plot = ScatterPlot(data)
      .xAxis()
      .yAxis()
      .frame()
      .xLabel("x")
      .yLabel("y")
      .render()

  }
}
