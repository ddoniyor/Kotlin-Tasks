class HomeTask3 {
    class Pool {
        var capacity: Int ?=null

        fun poolIsFull() {
            println("Бассейн заполнен!")
        }
    }

    class Boy {
        var name: String? = null
        var surname:String?=null
        var age: Int? = null

        fun boyPersonalData(){
            println("имя - $name, фамилия - $surname, возраст - $age ")
        }
        fun fillingPool(capacity:Int) {
            var counter = 0
            var fiveLiters = 5
            var eightLiters = 8
            var poolFilling = 0

            while (poolFilling <= capacity) {
                poolFilling += if (poolFilling <= 500) {
                    fiveLiters
                } else {
                    eightLiters
                }
                counter++
            }
            Pool().poolIsFull()
            println("итерации по заполнению бассейна $counter")
        }

    }

}

