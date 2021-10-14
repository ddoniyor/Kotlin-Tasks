class MinMaxAndCompare {
    fun findMinInArray(array:Array<Int>):Int{
        var min = array[0]
        for (i in array){
            if (i<min){
                min = i
            }
        }
        return min
    }
    fun findMaxInArray(array:Array<Int>):Int{
        var max = array[0]
        for (i in array){
            if (i>max){
                max=i
            }
        }
        return max
    }
    fun compareArrays(firstArray: Array<Int>,secondArray: Array<Int>):MutableList<String>{
        var result  = mutableListOf<String>()

        if (firstArray.size!=secondArray.size){
            result.add("Разная длина массивов")
            return result
        }
        for (i in firstArray.indices){
                when{
                    firstArray[i]>secondArray[i]->{
                        result.add("${firstArray[i]} > ${secondArray[i]}")
                    }
                    firstArray[i]<secondArray[i]->{
                        result.add("${firstArray[i]} < ${secondArray[i]}")
                    }
                    firstArray[i]==secondArray[i]->{
                        result.add("${firstArray[i]} == ${secondArray[i]}")
                    }
                }
        }
        return result
    }
}