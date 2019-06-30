class Alien {
    var skill: String? = null

    fun show() {
        println(this.skill)
    } 
}


fun main(args: Array<String>) {
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

    var a1 = Alien()
    a1.skill = "Java"
    a1.show()

    var a2 = Alien()
    a2.skill = "SQL"
    a2.show()

    //var a3 = a1.plus(a2);
    //var a3 = a1 plus a2 

    var a3 = a1 + a2                     
    a3.show()
}


///// EXTENTION FUNCTION
/* fun Alien.plus(a: Alien): Alien {
    var t = Alien()
    t.skill = this.skill + " " + a.skill
    
    return t
} */


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