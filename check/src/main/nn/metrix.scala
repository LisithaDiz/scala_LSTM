package com.matrix

package object DotOp {

  def dot(matrixA: Array[Array[Double]], matrixB: Array[Array[Double]]): Array[Array[Double]] = {
    if (matrixA(0).length == matrixB.length) {
      val dot_Matrix: Array[Array[Double]] = Array.ofDim[Double](matrixA.length, matrixB(0).length)
      for (i <- matrixA.indices) {
        for (j <- matrixB(0).indices) {
          for (k <- matrixB.indices) {
            dot_Matrix(i)(j) += matrixA(i)(k) * matrixB(k)(j)
          }
        }
      }
      dot_Matrix
    } else {
      throw new IllegalArgumentException("Matrix dimensions must match for dot product.")
    }
  }

}

package object MatrixOp {
  import com.matrix.DotOp._

  def reshape(matrix: Array[Array[Double]]): Array[Array[Double]] = {
    val reshape_Matrix: Array[Array[Double]] = Array.ofDim[Double](matrix(0).length, matrix.length)

    for (j <- matrix.indices) {
      for (i <- matrix(0).indices) {
        reshape_Matrix(i)(j) = matrix(j)(i)
      }
    }
    reshape_Matrix
  }

  def transpose(matrix: Array[Array[Double]]): Array[Array[Double]] = reshape(matrix)

  def multiply(matrixA: Array[Array[Double]], matrixB: Array[Array[Double]]): Array[Array[Double]] = {
    dot(matrixA, matrixB)
  }

  def add(matrixA: Array[Array[Double]], matrixB: Array[Array[Double]]): Array[Array[Double]] = {
    val new_Matrix: Array[Array[Double]] = Array.ofDim[Double](matrixA.length, matrixA(0).length)

    for (i <- matrixA.indices) {
      for (j <- matrixA(0).indices) {
        new_Matrix(i)(j) = matrixA(i)(j) + matrixB(i)(j)
      }
    }
    new_Matrix
  }

  def sub(matrixA: Array[Array[Double]], matrixB: Array[Array[Double]]): Array[Array[Double]] = {
    val new_Matrix: Array[Array[Double]] = Array.ofDim[Double](matrixA.length, matrixA(0).length)

    for (i <- matrixA.indices) {
      for (j <- matrixA(0).indices) {
        new_Matrix(i)(j) = matrixA(i)(j) - matrixB(i)(j)
      }
    }
    new_Matrix
  }

  def scaleMul(k: Double, matrixA: Array[Array[Double]]): Array[Array[Double]] = {
    for (i <- matrixA.indices) {
      for (j <- matrixA(0).indices) {
        matrixA(i)(j) = k * matrixA(i)(j)
      }
    }
    matrixA
  }

  def addRowByRow(matrixA: Array[Array[Double]], matrixB: Array[Double]): Array[Array[Double]] = {
    val new_Matrix: Array[Array[Double]] = Array.ofDim[Double](matrixA.length, matrixA(0).length)

    for (i <- matrixA.indices) {
      for (j <- matrixA(0).indices) {
        new_Matrix(i)(j) = matrixA(i)(j) + matrixB(j)
      }
    }
    new_Matrix
  }

}

