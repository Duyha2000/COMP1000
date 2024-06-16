Coding in the real world
When will the requirements be as clearly stated as a truth table? Almost never!

We need to code to vague/abstract/hazy requirements and in this section, we'll take a look as such scenarios.

SCENARIO 1
There are students enrolled in degrees and can graduate if they are enrolled in a non-honors undergraduate course and have completed 72 credit points or more, or enrolled in an honors course and have completed 96 credit points or more, or if they are enrolled in a postgraduate program and have completed 48 credit points or more. Write a piece of code that determines if a specific student is eligible to graduate or not. You may assume that the following inputs are available:

Course in which student is enrolled: String. Can be either "UG"/ "UG (Hons)"/ "PG"
Number of credit points completed: int.
Note: you can check if a String s equals another String t using s.equals(t) and NOT s == t. Reasons why will be discussed in COMP1010. Case insensitive comparison is performed using s.equalsIgnoreCase(t).

SCENARIO 2
A website offers discounts based on item categories and quantities. There are four categories - A, B, C, and D. For all categories except D, the following rules exist,

Less than 2 items: no discount
Between 2 and 5 items: 15% discount
Between 6 and 10 items: 25% discount
More than 10 items: 30% discount
For category D, there is a 1% discount for every item purchased, up to a maximum of 50 items (and hence a maximum of 50% discount).

Write a piece of code that outputs the percentage discount for a given category (stored in char cateogry that can be either 'A', 'B', 'C', or 'D') and quantity (stored in int quantity).

SCENARIO 3
The shopping mall charges for parking based on the following rules:

under 3 hours: Free
3 hours to 3 hours 29 minutes: $4
3 hours 30 minutes to 3 hours 59 minutes: $7
4 hours to 4 hours 29 minutes: $11
4 hours 30 minutes to 4 hours 59 minutes: $16
5 hours to 5 hours 29 minutes: $22
5 hours 30 minutes to 5 hours 59 minutes: $30
6 hours or over: $40
Given the number of hours and minutes in two variables, write a piece of code that stores the parking cost in a variable parkingFee.

SCENARIO 4
Write a piece of code to address the same problem as in scenario 3, but an additional rule. Weekend (Sat, Sun) parking incurs a flat rate of $4 per 30 minutes. That is,

0 to 29 minutes: $4
30 to 59 minutes: $8
60 to 89 minutes: $12
and so on...
An additional variable dayOfWeek is available and is 0 for Monday, 1 for Tuesday and so on.