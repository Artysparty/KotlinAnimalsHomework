import Animal

class Cat(location: String, food: String, val noise: String) : Animal(location, food) {

    override fun makeNoise() {
        print("Cat says " + noise)
    }

    override fun eat() {
        println("A cat is eating rats")
    }

    override fun sleep() {
        println("A cat is sleeping")
    }
}