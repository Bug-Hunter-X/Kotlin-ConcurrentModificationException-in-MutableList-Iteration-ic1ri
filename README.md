# Kotlin ConcurrentModificationException Example
This example demonstrates a common error when modifying mutable collections (like `MutableList` or `MutableSet`) while iterating over them in Kotlin.  Directly removing elements from a collection you're iterating through causes a `ConcurrentModificationException`. 

The `bug.kt` file shows the incorrect way, leading to the exception.  `bugSolution.kt` illustrates safer alternatives.

## How to reproduce
1.  Save the code in `bug.kt`.
2. Compile and run the code. You'll see a `ConcurrentModificationException`.
3. Examine `bugSolution.kt` to learn how to correctly modify collections during iteration.