This project involved implementing, testing, and comparing three sorting algorithms, Gnome Sort, Cocktail Shaker Sort, and Shell Sort. Turning the pseudocode into working code was not too hard. Using the same variable names as the pseudocode made it much easier to check the code and figure out whether it matched the assignment. Writing the methods using <T extends Comparable<T>> also reinforced how to use generics correctly and rely on compareTo() so the algorithms work with different types like Integer and String.



Gnome Sort showed how a really simple algorithm can still work well when the list is already almost sorted. Its “step forward, step backward” idea was easy to understand and directly followed from the pseudocode. Cocktail Shaker Sort was more complicated since it sorts in both directions. This helps in cases with “turtles” (values that move slowly), but for random data the extra control steps sometimes make it slower than expected. Shell Sort was the most interesting because using the Ciura gap sequence made it much faster than the other two. By moving items long distances early on, it ends up doing far less work overall.



The performance testing showed the biggest differences. Sorting 10,000 random integers made it clear that Shell Sort is much faster, it finished in just a few milliseconds, while Gnome Sort and Cocktail Shaker Sort took over 100 ms. This made the importance of algorithm complexity very obvious in practice. One surprising result was that Gnome Sort actually beat Cocktail Shaker Sort on random data, probably because its simple logic uses fewer instructions and works better with the CPU’s memory.


It was interesting working with AI on this project, especially since it could really dive deep on the performance aspects. I had no issues the whole time working with it and it was able to get everything I needed done with no hiccups. I have found that giving it as much context as possible is key. I had it make a project completion summary when I was all done to check everything against the readme and make sure that everything was in order before I went through to write the reflection. I put emphasis on making sure I could learn from the things the AI wrote so I was knowing what was going on.
