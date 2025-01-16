fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    // Correct way to avoid ConcurrentModificationException
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (i in list2) {
        if (i > 2) {
            toRemove.add(i)
        }
    }
    list2.removeAll(toRemove)
    println(list2) // Output: [1, 2]
    
    // Another Correct way using an iterator
    val list3 = mutableListOf<Int>(1,2,3,4,5)
    val iterator = list3.iterator()
    while (iterator.hasNext()){
        val i = iterator.next()
        if(i > 2){
            iterator.remove()
        }
    }
    println(list3) // Output: [1,2]
} 
