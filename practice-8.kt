fun add(a: Int, b: Int): Int = a + b 

fun returnMeFunction(): ((Int, Int) -> Int) {
    return ::add
}


fun main(args: Array<String>) {
    
    /// Higher Order function returning lambda
    var test: (Int, Int) -> Int = returnMeFunction()
    println("res = ${test(2, 3)}")


    /// Kotlin Scope Functions 

    //var p1 = Person("bob", 23, "programmer")
    //var p2 = Person("john", 30, "driver")

    /// apply {}
    /* p1.apply {
        this.age = 50
        job = "sue chef"
    }.printPerson() */

    /// also {}
   /*  p1.also { n -> 
        n.name = "Dwight"
        n.age = 38
    }.printPerson()
 */

    /// let {}
   /*  p1.let {
        it.job = "blockchain engineere"
        "job: ${it.job}; age: ${it.age}"          // returns it
    }.println() */

    // var obj = if(p1.age >= p2.age) p1 else p2
    // obj.printPerson()

    /// run {}
    // run {
    //     if(p1.age >= p2.age) p1 else p2
    // }.printPerson()

    /* p1.run {
        this.job = "jr. android developer"
        age += 2
        "job: $job; age: $age"          // returns it
    }.println() */

    /// with {}
    /* with(p2) {
        this.job = "uber driver"
        age -= 2
        "job: $job; age: $age"          // returns it
    }.println() */

}

data class Person(var name: String,
                  var age: Int,
                  var job: String) {
    
    fun printPerson() = println(this.toString())
}

fun String.println() = println(this)