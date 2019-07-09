fun main(args: Array<String>) {
    /// Arrays in Kotlin
   /*  var arr: Array<Int> = Array<Int>(5) { 0 }
                        // IntArray(5)
                        // intArrayOf(1, 2, 3, 4, 5)
                        // arrayOf(1, 2, 4, 5 , 6)

    for (i in 0..arr.size - 1) {
        println("arr[$i] => ${ arr.get(i) }")
    } */

    /// Immutable Maps
   /*  var data = mapOf<Char, Int>(
        'a' to 95,
        'b' to 96,
        'A' to 65
    ) */

    /// Mutable Maps
    /* var data = mutableMapOf<Char, Int>(
        'a' to 95,
        'b' to 96,
        'A' to 65
    ) */

    /* var data: HashMap<Char, Int> = HashMap<Char, Int>()

    data.put('B', 66)
    data.put('b', 1009)
    data.replace('b', 0) */

    //// Kotlin Immutable Set => Read-only, stores unique elements
    //var data = setOf<Int>(1, 2, 4, 5 ,6, 2, 1, 5, 9)

    /// Mutable Sets => order is maintained
    /* var data = mutableSetOf<Int>(1, 2, 4, 9, 7)
    data.add(9)
    data.remove(2) */

    //println(data.size)

    /// HashSet => order is NOT maintained
    var data = hashSetOf<Int>()
    data.add(9)
    data.add(5)
    data.remove(2)
    
    data.forEach {
        println(it * it)
    }



   /*  var str: String? = null
    var res: Int

    /// ?. let {} block
    str?.let {
        res = it.length
        println("length = $res")
    } */

    //var obj = Program()

    // Annonymous inner class
   /*  obj.add(2, 5, object: MyInterface {
        override fun execute(num: Int): Unit {
            println("result = $num")
        }
    }) */

    /* var myLambda: (Int) -> Unit = {s: Int -> println("result = $s")}
    myLambda(23)

    obj.higerOrder(2, 7, myLambda) */

    /// Invoking higer-order function
    //obj.higerOrder(3, 6) {n -> println("result: $n")}
}

class Program {
    fun higerOrder(a: Int, b: Int, f: (Int) -> Unit): Unit {
        var sum = a + b
        f(sum)
    }

    fun add(a: Int, b: Int, action: MyInterface): Unit {
        var sum = a + b
        action.execute(sum)
    }
}

interface MyInterface {
    
    // Abstract function
    fun execute(num: Int): Unit
}