import com.matrix.DotOp._
import com.matrix.MatrixOp._

object NN4 {
  var input = Array(
    Array(1.0, 2.0, 3.0, 2.5),
    Array(2.0, 5.0, -1.0, 2.0), 
    Array(-1.5, 2.7, 3.3, -0.8)
  )

  var weights = Array(
    Array(0.2, 0.8, -0.5, 1.0), 
    Array(0.5, -0.91, 0.26, -0.5), 
    Array(-0.26, -0.27, 0.17, 0.87)
  )

  var biases = Array(2, 3, 0.5)

  var weights2 = Array(
    Array(0.1, -0.14, 0.5), 
    Array(-0.5, 0.12, -0.33),
    Array(-0.44, 0.73, -0.13)
  )

  var biases2 = Array(-1.0, 2.0, -0.5)

  def main(args: Array[String]): Unit = {
    var layer1_output = addRowByRow(dot(input, transpose(weights)), biases)
    var layer2_output = addRowByRow(dot(layer1_output, transpose(weights2)), biases2)

    layer2_output.foreach(row => println(s"[${row.mkString(", ")}]"))
  }
}