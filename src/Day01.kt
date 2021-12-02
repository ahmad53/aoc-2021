fun main() {
    var count = 0;
    var countChunk = 0;
    val testInput = readInput("Day01_test")
    for (n in testInput.indices){
        if(n>0){
            if(testInput[n] > testInput[n-1]){
                // println("increased")
                count++
            }else{
                //  println("decrease")
            }
        }
    }
    println("Part 1 Answer = $count") //Result of part one

    // -------------------------------------- PART TWO --------------------------------------------------

    val chunkedList = testInput.windowed(3, step = 1, partialWindows = false) { it.sum()}
    for (n in (chunkedList).indices ){
        if(n>0){
            if(chunkedList[n] > chunkedList[n-1]){
                //     println("increased")
                countChunk++
            }else{
                //    println("decrease")
            }
        }
    }
    println("Part 2 Answer = $countChunk") //Result of part two
}
