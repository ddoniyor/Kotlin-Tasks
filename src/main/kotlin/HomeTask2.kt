class HomeTask2 {

    fun multiplyNumbers(n: Int): Float {
        var i = 1
        var constValue = 0.1f
        var result = 1f
        var number = 1.1f
        while (i <= n) {
            result *= number
            number += constValue
            i++
        }
        if (n <= 0) {
            result = 0f
            return result
        }
        return result
    }


    fun pyramid(cubeCount: Int): Pair<Int, Int> {
        var _cubeCount = cubeCount
        var rowCount = 0
        var cube = 1
        var i = 1

        if (_cubeCount <= 0) {
            return Pair(0, 0)
        }
        while (i != 0) {
            if (_cubeCount - cube >= 0) {
                _cubeCount -= cube
                rowCount += 1
                cube += 1
            } else {
                i = 0
            }
        }
        return Pair(rowCount, _cubeCount)
    }
}