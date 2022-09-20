# Exercises to be solved using TDD

Remember to always write the test scenarios first when solving the exercises below.


## Taxi Fare

Create a method that calculates the taxi fare for one ride.

All rides have a base fare of 2.00.

For rides shorter or equal to 10km the fare per kilometer is 0.80.

For rides longer than 10km the fare per kilometer is 0.90.

The test scenarios are:
- Kati's ride lasted 20 kilometers and the fare was 20.00;
- Agu's ride lasted 5 kilometers and the fare was 6.00;
- Trinu's ride lasted 10 kilometers and the fare was 11.00;
- Ott's ride lasted 8 kilometers and the fare was 8.40.


## WacDonald's Order

Create a method that calculates the final price when ordering at WacDonald's restaurant chain.

The prices per item unit are:

| Item             | Type  | Price |
|------------------|-------|-------|
| Cheeseburger     | Main  | 1.55  |
| Big burger       | Main  | 6.50  | 
| Chicken nuggets  | Side  | 4.20  |
| French fries     | Side  | 1.90  |
| Great-Cola       | Drink | 1.65  |
| Water            | Drink | 2.00  |
| Apple juice      | Drink | 1.85  |


A 30% discount should be applied when a customer chooses a combo: one Main + one Side + one Drink.

The test scenarios are:
- One chicken nuggets + one water = 6.20
- One big burger + one french fries + two apple juices = 12.10
- One cheeseburger + one chicken nuggets + one great-cola = 5.18


## FizzBuzz Game

In this game we should print a sequence of numbers from 1 to `n`, where `n` is provided as a method parameter.

When printing the number we need to pay attention to some rules:
- Numbers divisible by 3 should appear as `Fizz` instead of number;
- Numbers divisible by 5 should appear as `Buzz` instead of number;
- Numbers divisible by 3 and 5 should appear as `FizzBuzz` instead of number.

The test scenarios are:

For numbers between 1 and 15 the game should return:
"1", "2", "Fizz", "4", "Buzz",
"Fizz", "7", "8", "Fizz", "Buzz",
"11", "Fizz", "13", "14", "FizzBuzz"

For number between 1 and 100 the game should return:
"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
"11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
"Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
"31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
"41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
"Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
"61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
"71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
"Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
"91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"


## Collatz Sequence

The [Collatz Sequence](https://en.wikipedia.org/wiki/Collatz_conjecture) is one of the most famous unsolved problems in mathematics.

This sequence always starts with a given number `n`, provided as a method parameter.

Once you receive `n` you need to perform the following operations:
- If the number is even, divide it by two (n = n/2)
- If the number is odd, triple it and add one (n = 3n + 1)

These operations will be executed until `n` becomes 1.

The test scenarios are:
- Given the number 13, the sequence is: 13, 40, 20, 10, 5, 16, 8, 4, 2, 1;
- Given the number 25, the sequence is: 25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1;
- Given the number 9, the sequence is: 9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1.

<b>Hint:</b> Do not use array in this problem, because it is not possible to know the final length of the sequence.


## Sum Square Difference

In this exercise we will calculate the difference between the square of sums and the sum of squares from all numbers between 1 and `n`, where `n` is provided as a method parameter.

The square of sums is given by `(1 + ... + n)^2` and the sum of squares is given by `1^2 + ... + n^2`.

Let's use `n = 10` as an example.

The square of the sum is `(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10)^2 = 55^2 = 3025`.

The sum of the squares is `1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 + 9^2 + 10^2 = 385`.
     
The difference between the square of sums and the sum of squares is `3025 - 385` and final answer is `2640`.

The test scenarios are:
- Given the number 10, the differences are `3025 - 385` and the final answer is `2640`;
- Given the number 20, the differences are `44100 - 2870` and the final answer is `41230`;
- Given the number 30, the differences are `216225 - 9455` and the final answer is `206770`.
