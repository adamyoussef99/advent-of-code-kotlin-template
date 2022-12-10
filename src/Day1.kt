fun main() {
    var current = 0

    val calories = mutableListOf<Int>()

    val input = readInput("Day1")

    input.forEach{
        if(it == ""){
            calories.add(current)
            current = 0
        }else {
            current += it.toInt()
        }

    }

    println("Part1: ${calories.max()}")

    val sorted = calories.sortedDescending()
    println("Part2: ${sorted.take(3).sum()}")
}
