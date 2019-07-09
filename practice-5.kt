/* class A {
    //// INITIALISE "name" later
    lateinit var name: String
    var age: Int = 7
} */

/* fun show(month: Any) =  when(month) {
        1, "JAN" -> println("January")
        2, "FEB" -> println("February")
        else -> {
            println("invalid")
            println("input")
        }
    }
 */


//// IN-LINE FUNCTIONS
// in-line works best with lambdas
/* inline fun add(a: Int, b: Int, f: (Int) -> Unit): Unit {
    var sum = a + b
    f(sum)
} */


//// PASS FUNCTION REFERENCE AS FUNCTION ARGUMENT

fun printFunction(str: String) = println("Hello, $str")

fun higherOrder(str: String, f: (String) -> Unit) {
    f(str)
}


fun main(args: Array<String>) {
    /// passing function reference
    higherOrder("bob", ::printFunction)

   //add(22, 9, { n -> println(n) })

    /* show(2)
    show("JAN")
    show("bob")
 */

    /// FOE-EACH LOOP
    /* (1..5).forEach{
        //println(it)
        i -> println(i)         // here i is VAL         
    } */

    //var t: String? = null
    //t?.let({ var c = it; println("name: $c") })

    //t?.also({ var c = it; println("name: $c") })


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