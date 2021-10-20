
fun main(args: Array<String>) {
    val poolCapacity = 1200
    val boy = HomeTask3.Boy()
    val pool = HomeTask3.Pool()

    pool.capacity = poolCapacity
    boy.name = "Ахмад"
    boy.surname = "Ахмадов"
    boy.age = 12

    boy.boyPersonalData()
    boy.fillingPool(pool.capacity!!)

}