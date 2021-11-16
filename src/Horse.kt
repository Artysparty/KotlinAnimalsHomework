
class Horse(location: String, food: String, val noise: String) : Animal(location, food) {

    override fun makeNoise() {
        print("Horse says " + noise)
    }

    override fun eat() {
        println("A horse is eating oats")
    }

    override fun sleep() {
        println("A horse is sleeping")
    }
}