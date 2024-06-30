// import com.matrix.DotOp._
// import com.matrix.MatrixOp._

// object check {
//   val A = Array(
//     Array(1.0),
//     Array(2.0),
//     Array(3.0),
//     Array(2.5)
//   )

//   val B = Array(
//     Array(0.2, 0.8, -0.5),
//     Array(0.5, -0.91, 0.26),
//     Array(-0.26, -0.27, 0.17)
//   )
//   val C = Array(
//     Array(0.2, 0.8, -0.5, 1.0),
//     Array(0.5, -0.91, 0.26, -0.5),
//     Array(-0.26, -0.27, 0.17, 0.87)
//   )

//   val D = Array(
//     Array(1.0, 2.0, 3.0, 2.5), 
//     Array(2.0, 5.0, -1.0, 2.0), 
//     Array(-1.5, 2.7, 3.3, -0.8)
//   )

//   val E = Array(
//     Array(0.2, 0.5, -0.26), 
//     Array(0.8, -0.91, -0.27), 
//     Array(-0.5, 0.26, 0.17), 
//     Array(1.0, -0.5, 0.87), 
//   )

//   val F = Array(0.8, -0.91, -0.27)


//   def main(args: Array[String]): Unit = {
//     val result = addRowByRow(E, F)
//     println("Result of multiplication:")
//     result.foreach(row => println(s"[${row.mkString(", ")}]"))

//   }
// }
