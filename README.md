# MakeChangeProject

## Overview
The cash register I built uses a scanner to take user input for cost of an item and the amount tendered.
It then subtracts the amount tendered from the item price to get the remaining value.
Then the remaining value is rounded to two decimals.
The cash register then uses an "IF" statement to decide if the customer gave the exact change, not enough or
needs change.  If the  customer gave the correct amount of change a statement  is displayed stating that.  
If they did not give enough then a different statement is sent saying that.
If the customer needs change the program uses a while loop to decrement the remaining balance and an"IF"
statement nested inside to waterfall the highest amount of currency first to the smallest until the balance is 0.
Once the remaining balance is zero the while loop ends.
Another "IF" statement is used to print out only currency with a the counter above zero.

## Technologies Used
 - Java
 - Eclipse
 - Git
 
 ## Lessons Learned
 I was struggling with nested loops this week.  Being under the gun forced me to build that bridge in my brain.
 I was having trouble with the double having so many decimals and not counting the change.  Once i rounded it
 and added a few thousands it fixed that.
 Finally was comparing the double.  It took me awhile to figure this out.  The internet seemed to have some more advanced ways of 
 doing it.  I took a break overnight and was able to find a solution using a modulus and it worked.