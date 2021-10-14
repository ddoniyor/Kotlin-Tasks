fun main(args: Array<String>) {
    var firstArray = arrayOf(1,2,3,4,5,6,7)
    var secondArray = arrayOf(3,0,3,42,12,4,1)


    var min = MinMaxAndCompare().findMinInArray(firstArray)
    var max = MinMaxAndCompare().findMaxInArray(firstArray)
    var resultArray = MinMaxAndCompare().compareArrays(firstArray,secondArray)

    println("min = $min max = $max")

    for (i in resultArray){
        println(i)
    }

}