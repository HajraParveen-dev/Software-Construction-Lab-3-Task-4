# Lab Task 4 — Simple Timer Utility

## Objective

The objective of this lab is to use JUnit to test logic that handles elapsed-time computation and boundary conditions.

The lab focuses on calculating the number of seconds between a start and end time while also handling equal values and invalid input.

## Implementation and Tasks Completed

The `TimerUtil.java` class was implemented with a `secondsBetween()` method.

The method:

* Calculates elapsed time using `end - start`.
* Returns `0` when the start and end values are equal.
* Throws `IllegalArgumentException` when the end value is less than the start value.

The following tasks were completed:

* Tested a normal case using `(10, 25)` → `15` seconds.
* Tested a boundary case using `(0, 0)` → `0` seconds.
* Tested invalid input using `(25, 10)` → `IllegalArgumentException`.
* Used JUnit to verify the expected results.
* All 3 test cases passed successfully.

## How to Run

### Run the Code

1. Open the project in NetBeans IDE.
2. Open `TimerUtil.java`.
3. Run the Java project or class.

### Run the Tests

1. Open `TimerUtilTest.java`.
2. Right-click the test file.
3. Select **Test File** to run the JUnit tests.

If the project is configured with Maven, tests can also be run using:

```bash
mvn test
```

## Test Result

All **3 test cases passed successfully**.

**Overall Result: PASS — 3/3 test cases passed.**
