fun main() {
    val vet = Vet()
    val animals: List<Animal> = listOf(
        Dog("Home", "meat", "woof"),
        Cat("Outside", "rats", "MEOOOOOOOOOOW"),
        Horse("Country", "Oats", "FRRRR")
    )
    animals.forEach{animal -> vet.treatAnimal(animal)}
}