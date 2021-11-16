
class Dog(location: String, food: String, val noise: String) : Animal(location, food) {

    override fun makeNoise() {
        print("Dog says " + noise)
    }

    override fun eat() {
        println("A dog is eating meat")
    }

    override fun sleep() {
        println("A dog is sleeping")
    }
}