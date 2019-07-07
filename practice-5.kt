class A {
    //// INITIALISE "name" later
    lateinit var name: String
    var age: Int = 7
} 

fun main(args: Array<String>) {
    var t: String? = null
    //t?.let({ var c = it; println("name: $c") })

    t?.also({ var c = it; println("name: $c") })


   /*  val obj: A = A()
    
    obj.name = "bob"
    println("name: ${obj.name}")
    obj.age = 12
    println("age: ${obj.age}") */

    /// TERNERY OPERATOR DOESN'T WORK IN KOTLIN
    //println((12 > 5) ? "yes" : "no") 

   /*  var rawString: String = """ Hello bob,
        I'm as good as he is.
            Testing 1,2,3...
        Hi John!!
    """

    println(rawString)  */

    /// ELVIS OPERATOR
    // var n: String? = null

    // println(n?.length ?: -1)
}