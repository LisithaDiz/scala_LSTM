package matrix

package object Matrix {

  def dot(matrixA: Array[Double], matrixB: Array[Double]): Array[Double] = {
    if (matrixA.length == matrixB.length){
      var dot_Matrix: Array[Double] = new Array[Double](matrixA.length)
      for (i <- 0 until matrixA.length){
        dot_Matrix(i) = matrixA(i) * matrixB(i)
      }
      dot_Matrix
    } else {
      throw new IllegalArgumentException("Matrix dimensions must match for dot product.")
    }
  }
}
