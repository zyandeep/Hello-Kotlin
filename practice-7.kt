class Person(var age: Int, var name: String) {}

fun main(args: Array<String>) {
    // var data = listOf<Int>(1, 2, 4, 57, 9, 55, 44)

    /// Applying filter() and map() togather
    // var newData = data.filter { it < 10 }
    //                   .map { n -> n * n}

    var people = listOf<Person>( Person(10, "bob"), Person(20, "ram"), Person(14, "Shreya") )

    //people.forEach { println(it.name) }
    //people.map { println(it.name) }

    people.filter { it.age > 10 }
          .map { it.name }
          .forEach { println(it) }



    /// Filter function
  /*   var newData = data.filter{
        // takes a pradicate => a conditon returning Boolean
        //n -> n < 10
        it < 10
    } */

    /// Map function => transform
    /* var newData = data.map { it * it }     // data.map({ it * it })
     */

   
}