object NN {
    var input = Array(1, 2, 3, 2.5)
    var weight = Array(
                Array(0.2, 0.8, -0.5, 1),
                Array(0.5, -0.91, 0.26, -0.5), 
                Array(-0.26, -0.27, 0.17, 0.87), 
            )

    var bias = Array(2, 3, 0.5)

    var layer_output : Array[Double] = new Array[Double](3)

    def main(args : Array[String]) : Unit = {
        for (i <- 0 until 3){
            var sum = 0.0
            for (j <- 0 until 4){
                sum += input(j)*weight(i)(j) 
            }
            sum = sum + bias(i)
            layer_output(i) = sum
        }

        for (value <- 0 until 3){
            printf(s"${layer_output(value)}, ")
        }
    }

}

// 1*(0.2) + 2*(0.8) + 3*(-0.5) + 2.5*(1) + 2
// 1*(0.5) + 2*(-0.91) + 3*(0.26) + 0.2*(-0.5) + 3
// 1*(-0.26) + 2*(-0.27) + 3*(0.17) + 0.2*(0.87) + 0.5
// [4.8, 1.21, 2.385]