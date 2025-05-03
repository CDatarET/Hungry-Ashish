# Hungry-Ashish
CodeChef Difficulty 1064 Problem.

Hungry Ashish
It's dinner time, and Ashish is very hungry. He has X rupees in his pocket.
Ashish is very picky — he only eats either PIZZA or BURGER, and he prefers PIZZA over BURGER.

Each food item has a cost:

PIZZA costs Y rupees

BURGER costs Z rupees

Ashish can eat at most one item. Find out what Ashish will eat for dinner.

Input Format
The first line contains a single integer T — the number of test cases.

Each of the next T lines contains three integers: X (Ashish's money), Y (cost of PIZZA), and Z (cost of BURGER).

Output Format
For each test case, print:

PIZZA if Ashish can afford a pizza.

BURGER if Ashish can’t afford a pizza but can afford a burger.

NOTHING if Ashish can’t afford either.

The output is case-insensitive — PIZZA, pizza, PiZzA are all accepted.

Constraints
r
Copy
Edit
1 ≤ T ≤ 100  
1 ≤ X, Y, Z ≤ 100
Sample Input
Copy
Edit
3
50 40 60
40 55 39
30 42 37
Sample Output
vbnet
Copy
Edit
PIZZA
BURGER
NOTHING
Explanation
Test case 1: Ashish has 50 rupees, PIZZA costs 40. He buys a PIZZA.

Test case 2: Ashish has 40, can't afford PIZZA (55), but can afford BURGER (39). He eats BURGER.

Test case 3: Ashish has 30, can't afford either item. He eats NOTHING :(.
