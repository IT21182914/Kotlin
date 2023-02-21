fun main() {



    var animal1 = animals("Cat","Brown","Meaw Meaw")
    var animal2 = animals("Dog","Black & Brown","Baw Baw")
    animal1.sayHi()
    println("I am a ${animal1.name},My color is ${animal1.color} & my sound is ${animal1.sound}")

    println("I am a ${animal1.name},My color is ${animal1.color} & my sound is ${animal1.sound}")


}

class animals(var name: String,var color:String,var sound:String){

    init {

        println("Helloo")


    }


    fun sayHi(){

        println("Hey! ")

    }




}