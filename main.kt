fun main() {

    var vehicle1 = vehicle()
    var vehicle2 = vehicle()


    vehicle1.model="BMW"
    vehicle1.year = 2000


    println("This ${vehicle1.model} has created in ${vehicle1.year}")
    vehicle1.discount()
}


class vehicle(){


    var model:String = ""
    var year:Int = 0
    var price:Int = 0


    fun discount(){
        println("This vehicle has a discount")



    }



}