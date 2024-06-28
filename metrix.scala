package com.matrix

package object DotOp {

  def dot(matrixA: Array[Double], matrixB: Array[Double]): Array[Double] = {
    if (matrixA.length == matrixB.length) {
      val dot_Matrix: Array[Double] = new Array[Double](matrixA.length)
      for (i <- 0 until matrixA.length) {
        dot_Matrix(i) = matrixA(i) * matrixB(i)
      }
      dot_Matrix
    } else {
      throw new IllegalArgumentException("Matrix dimensions must match for dot product.")
    }
  }

  def dotNadd(matrix: Array[Double]): Double = {
    var sum = 0.0
    for (i <- 0 until matrix.length) {
      sum += matrix(i)
    }
    sum
  }
}

package object matrixOp {
  import com.matrix.DotOp._

  def reshape(matrix: Array[Array[Double]]): Array[Array[Double]] = {
    val reshape_Matrix: Array[Array[Double]] = Array.ofDim[Double](matrix(0).length, matrix.length)

    for (j <- 0 until matrix.length) {
      for (i <- 0 until matrix(0).length) {
        reshape_Matrix(i)(j) = matrix(j)(i)
      }
    }
    reshape_Matrix
  }

  def multiply(matrixA: Array[Array[Double]], matrixB: Array[Array[Double]]): Array[Array[Double]] = {
    val reshape_matrixB = reshape(matrixB)
    val new_Matrix: Array[Array[Double]] = Array.ofDim[Double](matrixA.length, reshape_matrixB.length)

    for (i <- 0 until matrixA.length) {
      for (j <- 0 until reshape_matrixB.length) {
        new_Matrix(i)(j) = dotNadd(dot(matrixA(i), reshape_matrixB(j)))
      }
    }
    new_Matrix
  }
}
