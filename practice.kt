//import java.math.BigInteger; 

/* class Alien {
    var skill: String? = null

    fun show() {
        println(this.skill)
    } 
} */

///// PRIMARY CONSTRUCTOR AND SECONDARY CONSTRUCTOR
/* class Human(name: String, age: Int) {
    var name: String = ""
    var age: Int = 0

    //// BODY OF PRIMAEY CONSTRUCTOR
    init {
        this.name = name
        this.age = age
        println("Human created")
    }


    fun think(): Unit {
        println("Human is $name, age $age")
    }
} */


/* class Human(private var name: String, private var age: Int) {
    //// BODY OF PRIMAEY CONSTRUCTOR
    init {
        this.name = name
        this.age = age
        println("Human created")
    }


    fun think(): Unit {
        println("Human is $name, age $age")
    }
} */

class Human(private var name: String, private var age: Int) {
    //// BODY OF PRIMAEY CONSTRUCTOR
    init {
        println("Human created")
    }

    ///// EVERY 2NDAY CONSTRUCTOR MUST CALL PRIMARY CONSTRUCTOR
    constructor(name: String): this(name, 23) {
        println("2nd-ery constructor called")
    }


    fun think(): Unit = println("Human is $name, age $age")
}





fun main(args: Array<String>) {

    var h = Human("Bob")                /// calling 2nd-ery constructor
    h.think()

    //var res = calcAmount(50, 0.05)
    /* var res = calcAmount(amt = 23)
    println("amount = $res") */

    // for (i in 'A'..'z') {
    //     println(i)
    // }

   /*  var str: String = "4aa"
    var res: Int = try {
        str.toInt()
    }
    catch(e: Exception) {
        0
    }

    println(res) */

    /* var a1 = Alien()
    a1.skill = "Java"
    a1.show()

    var a2 = Alien()
    a2.skill = "SQL"
    a2.show()

    //var a3 = a1.plus(a2);
    //var a3 = a1 plus a2 

    var a3 = a1 + a2                     
    a3.show() */

    /* var num: Int = 5
    var res: Int = 1

    for (i in 1..num) {
        res *= i
    } */

    //println(fact(700))
}

/* tailrec fun fact(num: Int, res: BigInteger = BigInteger.ONE): BigInteger {
    if(BigInteger.valueOf(num.toLong()) == BigInteger.ZERO) {
        return res
    }
    else {
        return fact(num - 1, res * BigInteger.valueOf(num.toLong()))
    }
} */


/*
fun fact(num: Int): Int = 
if(num <= 1) 
    1
else
    num * fact(num - 1)
        
//EXTENTION FUNCTION
 fun Alien.plus(a: Alien): Alien {
    var t = Alien()
    t.skill = this.skill + " " + a.skill
    
    return t
} 


///// INFIX FUNCTION 
///// OPERATOR OVERLOADING
operator infix fun Alien.plus(a: Alien): Alien {
    var t = Alien()
    t.skill = this.skill + " " + a.skill
    return t
}


// FUNCTION EXPRESSION
//fun calcAmount(amt: Int) = (amt + amt * 0.04)

//// DEFAULT PARAMETER
//fun calcAmount(amt: Int, interest: Double = 0.04) = (amt + amt * interest)
*/