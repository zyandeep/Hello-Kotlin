///// INHERITANCE
/// BY DEFAULT EVERY CLASS AND METHODS ARE FINAL
/* open class Human(private var name: String) {
    open fun think() {
        println("Human => $name is thinking...")
    }
}


///// METHOD OVERRIDING
class Alien(var name: String) : Human(name) {
    override fun think() {
        println("Alien => $name is thinking...")
    }
}
 */


///// ABSTRACT CLASS, METHODS
/* abstract class Human {
    abstract fun think()

    fun talk() {
        println("human talking...")
    }
}


class Alien : Human() {
    override fun think() {
        println("virtual thinking...")
    }
}
 */

/* interface A {
    fun a()
}

interface B {
    fun b()
}

class C : A, B {
    override fun a() {
        println("A implemented...")
    }

    override fun b() {
        println("B implemented...")
    }
}

///// EXTENTION FUNCTION
fun C.show(): Unit {
    println("Hello Kotlin")
}
 */


///// (VERY POWERFULL)DATA CLASS
//data class Laptop(val brand: String, val price: Int) {
    /// BY DEFAULT WE GET:
    /* 
        1. GETTER AND SETTER
        2. toString()
        3. equals() and hashCode()
        4. copy()
    */

//    fun show() = println("brand: $brand, price: $price")
//}


/* data class Book(var name: String, var price: Int) 

///// SINGETON CLASS
object BookSelf {
    var books = arrayListOf<Book>()

    fun show() {
        for (i in books) 
            println(i)
    }
}
 
interface Human {
    fun think()
}
*/

///// KOTLIN STATIC METHODS => COMPANION OBJECT
class Human(var name: String, var age: Int) {

    companion object {
        fun think(): Unit = println("Human is thinking...")

        //// FACTORY DESIGN PATTERN
        fun create(name: String, age: Int): Human = Human(name, age)
    }

    fun show() = println("name: ${this.name}, age: ${this.age}")
}


fun main(args: Array<String>) {

    Human.create("Bob", 23).show()

    //Human.think()

   /*  BookSelf.books.add(Book("Java", 200))
    BookSelf.books.add(Book("SQL", 100))
    BookSelf.books.add(Book("Kotlin", 500))
    BookSelf.books.add(Book("Python", 150))

    BookSelf.show() */


    //var o = Laptop("Dell", 2000)
    //var p = Laptop("Apple", 2500)

    // println(o)
    // println(o.brand)
    // println(o.price)
    // println(o.equals(p))

    //var q = o.copy()
    // var q = o.copy(price = 1800)
    // println(q)
    // println(q.equals(o))
}