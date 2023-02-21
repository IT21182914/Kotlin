fun main() {

  var animal1 = animals("cat", "brown", "Meaw Meaw")

  animal1.sayHi()
  println("I am a ${animal1.name},My color is ${animal1.color} & my sound is ${animal1.sound}")

  var parrot1 = animals("parrot", "Green", "No sound")
}

open class animals(var name: String, var color: String, var sound: String) {

  fun sayHi() {

    println("Hey! ")
  }
}

class Parrot(name: String, color: String, sound: String) : animals(name, color, sound) {

  var isParrot = true

  fun bird() {

    if (isParrot) {

      println("$name is parrot")
    }
  }
}
