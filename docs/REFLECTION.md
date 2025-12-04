This project involved implementing, testing, and comparing three sorting algorithms: Gnome Sort, Cocktail Shaker Sort, and Shell Sort. Turning the pseudocode into working code helped show how important it is to follow the instructions exactly. Using the same variable names as the pseudocode made it much easier to check the code and figure out whether it matched the assignment. Writing the methods using <T extends Comparable<T>> also taught me how to use generics correctly and rely on compareTo() so the algorithms work with different types like Integer and String.



Gnome Sort showed how a really simple algorithm can still work well when the list is already almost sorted. Its “step forward, step backward” idea was easy to understand and directly followed from the pseudocode. Cocktail Shaker Sort was more complicated since it sorts in both directions. This helps in cases with “turtles” (values that move slowly), but for random data the extra control steps sometimes make it slower than expected. Shell Sort was the most interesting because using the Ciura gap sequence made it much faster than the other two. By moving items long distances early on, it ends up doing far less work overall.



Testing was a huge part of making sure everything worked. I created 35 tests covering empty arrays, single-element arrays, sorted and reverse-sorted arrays, duplicates, “turtle” patterns, and different data types. These tests found several easy-to-miss mistakes like off-by-one errors, wrong comparisons, and incorrect gap loops. The specific turtle test for Cocktail Shaker Sort and a big-array test for Shell Sort were helpful because they showed how each algorithm behaved in special cases.



The performance testing showed the biggest differences. Sorting 10,000 random integers made it clear that Shell Sort is much faster—it finished in just a few milliseconds—while Gnome Sort and Cocktail Shaker Sort took over 100 ms. This made the importance of algorithm complexity very obvious in practice. One surprising result was that Gnome Sort actually beat Cocktail Shaker Sort on random data, probably because its simple logic uses fewer instructions and works better with the CPU’s memory.



Overall, I learned that following the pseudocode closely helps avoid mistakes, that generics require careful attention to comparisons, that thorough testing catches subtle bugs, and that real-world performance usually matches what the theory predicts. I also learned that a more complicated algorithm isn’t always a faster one.
