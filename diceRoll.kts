fun main() {
   val myFirstDice = Dice(6, "red")
   println("Your ${myFirstDice.numSides} sided, ${myFirstDice.color} dice rolled ${myFirstDice.roll()}!")
   
   val mySecondDice = Dice(20, "green")
   println("Your ${mySecondDice.numSides} sided, ${mySecondDice.color} dice rolled ${mySecondDice.roll()}!")
}

  class Dice(val numSides: Int, var color: String) {
        
      fun roll(): Int {
          return (1..numSides).random()
      }
    }