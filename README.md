# josephus-scala

**Josephus problem** is a theoretical problem related to a certain counting-out game.
People are standing in a circle waiting to be executed. Counting begins at a specified point in the circle and proceeds around the circle in a specified direction. After a specified number of people are skipped, the next person is executed. The procedure is repeated with the remaining people, starting with the next person, going in the same direction and skipping the same number of people, until only one person remains, and is freed.
(https://en.wikipedia.org/wiki/Josephus_problem)

Application that takes in 2 parameters: the number of people in the circle (n) and the step rate (k).  For example, if k is the step rate, then you skip k-1 people and eliminate the kth person.  The output of the program should be the place you need to stand in the circle to be the last person left.

You should be able to run app using:
```
sbt "run 14 2"
```