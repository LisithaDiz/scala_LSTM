import com.matrix.DotOp._

object NN2 {
  var input = Array(1.0, 2.0, 3.0, 2.5)
  var weight = Array(
    Array(0.2, 0.8, -0.5, 1.0),
    Array(0.5, -0.91, 0.26, -0.5),
    Array(-0.26, -0.27, 0.17, 0.87)
  )

  var bias = Array(2.0, 3.0, 0.5)

  var layer_output: Array[Double] = new Array[Double](3)

  def main(args: Array[String]): Unit = {
    for (i <- 0 until 3){
      var sum = dot(input, weight(i)).sum + bias(i)
      layer_output(i) = sum
    }

    for (value <- 0 until 3){
      printf(s"${layer_output(value)}, ")
    }
  }
}