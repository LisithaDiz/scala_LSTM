import com.matrix.DotOp._
import com.matrix.matrixOp._

object check {
  val A = Array(
    Array(1.0),
    Array(2.0),
    Array(3.0),
    Array(2.5)
  )

  val B = Array(
    Array(0.2, 0.8, -0.5),
    Array(0.5, -0.91, 0.26),
    Array(-0.26, -0.27, 0.17)
  )
  val C = Array(
    Array(0.2, 0.8, -0.5, 1.0),
    Array(0.5, -0.91, 0.26, -0.5),
    Array(-0.26, -0.27, 0.17, 0.87)
  )


  def main(args: Array[String]): Unit = {
    val result = multiply(B, B)
    println("Result of multiplication:")
    result.foreach(row => println(row.mkString(" ")))
  }
}
