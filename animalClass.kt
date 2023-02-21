fun main() {

  var animal1 = animals()

  animal1.name = "Cat"
  animal1.color = "Brown"
  animal1.sound = "Meaw Meaw"

  println("I am a ${animal1.name},My color is ${animal1.color} & my sound is ${animal1.sound}")
}

class animals() {

  var name: String = ""
  var color: String = ""
  var sound: String = ""

  fun sayHi() {

    println("Hey! ")
  }
}
