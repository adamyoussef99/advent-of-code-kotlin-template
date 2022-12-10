fun main(){
    val input = readInput("Day10")

    val circuit = Circuit()

    input.forEach{
        if(it == "noop"){
            circuit.increment()

        }else {
            val a = it.split(" ")[1]
            circuit.signaling(a.toInt())

        }
    }

    println("total =  ${circuit.total}")
}

class Circuit {
    var cycles = 0
    var signal = 1
    var total = 0

    fun increment(){
        print(if (cycles % 40 in (signal - 1..signal + 1)) '#' else ' ')
        cycles += 1
        if(cycles % 40 == 20){
            total += signal * cycles
        }
        else if(cycles % 40 == 0){
            println()
        }
    }

    fun signaling(amount: Int){
        repeat(2){ increment() }
        signal += amount
    }
}
