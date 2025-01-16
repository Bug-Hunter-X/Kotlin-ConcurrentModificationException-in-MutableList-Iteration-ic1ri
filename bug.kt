fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    // ConcurrentModificationException
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    for (i in list2) {
        if (i > 2) {
            list2.remove(i)
        }
    }
    println(list2) // Throws ConcurrentModificationException
}