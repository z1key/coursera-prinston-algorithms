See the Assessment Guide for information on how to interpret this report.

ASSESSMENT SUMMARY

Compilation:  PASSED
API:          PASSED

Findbugs:     PASSED
PMD:          PASSED
Checkstyle:   PASSED

Correctness:  43/43 tests passed
Memory:       48/53 tests passed
Timing:       126/136 tests passed

Aggregate score: 97.59%
[Compilation: 5%, API: 5%, Findbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
3.6K Aug  6 19:49 Deque.java
 703 Aug  6 19:49 Permutation.java
1.7K Aug  6 19:49 RandomizedQueue.java


********************************************************************************
*  COMPILING
********************************************************************************


% javac Deque.java
*-----------------------------------------------------------

% javac RandomizedQueue.java
*-----------------------------------------------------------

% javac Permutation.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
Deque:

RandomizedQueue:

Permutation:

================================================================


********************************************************************************
*  CHECKING STYLE AND COMMON BUG PATTERNS
********************************************************************************


% findbugs *.class
*-----------------------------------------------------------


================================================================


% pmd *.java
*-----------------------------------------------------------


================================================================


% checkstyle *.java
*-----------------------------------------------------------

% custom checkstyle checks for Deque.java
*-----------------------------------------------------------

% custom checkstyle checks for RandomizedQueue.java
*-----------------------------------------------------------

% custom checkstyle checks for Permutation.java
*-----------------------------------------------------------


================================================================


********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of Deque
*-----------------------------------------------------------
Running 16 total tests.

Tests 1-6 make random calls to addFirst(), addLast(), removeFirst(),
removeLast(), isEmpty(), and size(). The probabilities of each
operation are (p1, p2, p3, p4, p5, p6), respectively.

Test 1: Check random calls to addFirst(), addLast(), and size()
  *    5 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
  *   50 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
  *  500 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
  * 1000 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
==> passed

Test 2: Check random calls to addFirst(), removeFirst(), and isEmpty()
  *    5 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
  *   50 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
  *  500 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
  * 1000 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
  *    5 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
  *   50 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
  *  500 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
  * 1000 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
==> passed

Test 3: Check random calls to addFirst(), removeLast(), and isEmpty()
  *    5 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
  *   50 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
  *  500 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
  * 1000 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
  *    5 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
  *   50 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
  *  500 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
  * 1000 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
==> passed

Test 4: Check random calls to addLast(), removeLast(), and isEmpty()
  *    5 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
  *   50 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
  *  500 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
  * 1000 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
  *    5 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
  *   50 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
  *  500 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
  * 1000 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
==> passed

Test 5: Check random calls to addLast(), removeFirst(), and isEmpty()
  *    5 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
  *   50 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
  *  500 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
  * 1000 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
  *    5 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
  *   50 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
  *  500 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
  * 1000 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
==> passed

Test 6: Check random calls to addFirst(), addLast(), removeFirst(),
        removeLast(), isEmpty(), and size()
  *    5 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
  *   50 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
  *  500 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
  * 1000 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
  *    5 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
  *   50 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
  *  500 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
  * 1000 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
==> passed

Test 7: Check removeFirst() and removeLast() from an empty deque
  * removeFirst()
  * removeLast()
==> passed

Test 8: Check where two Deque objects can be created at the same time
==> passed

Test 9: Check iterator() after calls only to addFirst()
==> passed

Test 10: Check iterator() after intermixed calls to addFirst(), addLast(),
         removeFirst(), and removeLast()
==> passed

Test 11: Create two nested iterators to same deque
  * n = 10
  * n = 1000
==> passed

Test 12: Create two parallel iterators to same deque
  * n = 10
  * n = 1000
==> passed

Test 13: Create Deque objects of different parameterized types
==> passed

Test 14: Call addFirst() and addLast() with null argument
==> passed

Test 15: Check that remove() and next() throw the specified exceptions in iterator()
==> passed

Test 16: Check iterator() when Deque is empty
==> passed


Total: 16/16 tests passed!


================================================================
Testing correctness of RandomizedQueue
*-----------------------------------------------------------
Running 18 total tests.

Tests 1-4 make random calls to enqueue(), dequeue(), sample(),
isEmpty(), and size(). The probabilities of each operation are
(p1, p2, p3, p4, p5), respectively.

Test 1: Check random calls to enqueue() and size()
  *    5 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
  *   50 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
  *  500 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
  * 1000 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
==> passed

Test 2: Check random calls to enqueue() and dequeue()
  *    5 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
  *   50 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
  *  500 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
  * 1000 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
  *    5 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
  *   50 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
  *  500 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
  * 1000 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
==> passed

Test 3: Check random calls to enqueue(), sample(), and size()
  *    5 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
  *   50 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
  *  500 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
  * 1000 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
  *    5 random calls (0.1, 0.0, 0.8, 0.0, 0.1)
  *   50 random calls (0.1, 0.0, 0.8, 0.0, 0.1)
  *  500 random calls (0.1, 0.0, 0.8, 0.0, 0.1)
  * 1000 random calls (0.1, 0.0, 0.8, 0.0, 0.1)
==> passed

Test 4: Check random calls to enqueue(), dequeue(), sample(), isEmpty(), and size()
  *    5 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
  *   50 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
  *  500 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
  * 1000 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
  *    5 random calls (0.1, 0.1, 0.6, 0.1, 0.1)
  *   50 random calls (0.1, 0.1, 0.6, 0.1, 0.1)
  *  500 random calls (0.1, 0.1, 0.6, 0.1, 0.1)
  * 1000 random calls (0.1, 0.1, 0.6, 0.1, 0.1)
==> passed

Test 5: Call dequeue() and sample() from an empty randomized queue
  * dequeue()
  * sample()
==> passed

Test 6: Create multiple randomized queue objects at the same time
==> passed

Test 7: Check that iterator() returns correct items after a sequence of
        enqueue() operations
==> passed

Test 8: Check that iterator() returns correct items after sequence of enqueue()
        and dequeue() operations
==> passed

Test 9: Create two nested iterators over the same randomized queue
  * n = 10
  * n = 1000
==> passed

Test 10: Create two parallel iterators over the same randomized queue
  * n = 10
  * n = 1000
==> passed

Test 11: Create two iterators over different randomized queues
==> passed

Test 12: Create RandomizedQueue objects of different parameterized types
==> passed

Test 13: Check randomness of sample() by enqueueing n items, repeatedly calling
         sample(), and counting the frequency of each item
  * n = 3, trials = 12000
  * n = 5, trials = 12000
  * n = 8, trials = 12000
  * n = 10, trials = 12000
==> passed

Test 14: Check randomness of dequeue() by enqueueing n items, dequeueing n items,
         and seeing whether each of the n! permutations is equally likely
  * n = 2, trials = 12000
  * n = 3, trials = 12000
  * n = 4, trials = 12000
  * n = 5, trials = 12000
==> passed

Test 15: Check randomness of iterator() by enqueueing n items, iterating over those
         n items, and seeing whether each of the n! permutations is equally likely
  * n = 2, trials = 12000
  * n = 3, trials = 12000
  * n = 4, trials = 12000
  * n = 5, trials = 12000
==> passed

Test 16: Call enqueue() with a null argument
==> passed

Test 17: Check that remove() and next() throw the specified exceptions in iterator()
==> passed

Test 18: Check iterator() when RandomizedQueue is empty
==> passed


Total: 18/18 tests passed!


================================================================
********************************************************************************
*  TESTING CORRECTNESS (substituting reference RandomizedQueue and Deque)
********************************************************************************

Testing correctness of Permutation
*-----------------------------------------------------------
Tests 1-5 call the main() function directly, resetting standard input
before each call.

Running 9 total tests.

Test 1a: Check formatting for sample inputs from assignment specification
  % java Permutation 3 < distinct.txt
  F
  G
  I

  % java Permutation 3 < distinct.txt
  C
  A
  I

  % java Permutation 8 < duplicates.txt
  CC
  BB
  BB
  BB
  BB
  CC
  BB
  AA

==> passed

Test 1b: Check formatting for other inputs
  % java Permutation 8 < mediumTale.txt
  times
  it
  was
  of
  foolishness
  it
  wisdom
  the

  % java Permutation 0 < distinct.txt
  [no output]

==> passed

Test 2: Check that main() reads all data from standard input
  * filename = distinct.txt, k = 3
  * filename = distinct.txt, k = 3
  * filename = duplicates.txt, k = 8
  * filename = mediumTale.txt, k = 8
==> passed

Test 3a: Check that main() prints each item from the sequence at most once
         (for inputs with no duplicate strings)
  * filename = distinct.txt, k = 3
  * filename = distinct.txt, k = 1
  * filename = distinct.txt, k = 9
  * filename = permutation6.txt, k = 6
  * filename = permutation10.txt, k = 10
==> passed

Test 3b: Check that main() prints each item from the sequence at most once
         (for inputs with duplicate strings)
  * filename = duplicates.txt, k = 8
  * filename = duplicates.txt, k = 3
  * filename = permutation8.txt, k = 6
  * filename = permutation8.txt, k = 2
  * filename = tinyTale.txt, k = 10
==> passed

Test 3c: Check that main() prints each item from the sequence at most once
         (for inputs with newlines)
  * filename = mediumTale.txt, k = 10
  * filename = mediumTale.txt, k = 20
  * filename = tale.txt, k = 10
  * filename = tale.txt, k = 50
==> passed

Test 4: Check main() when k = 0
  * filename = distinct.txt, k = 0
  * filename = distinct.txt, k = 0
==> passed

Test 5a: Check that permutations are uniformly random
         (for inputs with no duplicate strings)
  * filename = permutation4.txt, k = 1
  * filename = permutation4.txt, k = 2
  * filename = permutation4.txt, k = 3
  * filename = permutation4.txt, k = 4
  * filename = permutation6.txt, k = 2
==> passed

Test 5b: Check that permutations are uniformly random
         (for inputs with duplicate strings)
  * filename = permutation5.txt, k = 1
  * filename = permutation5.txt, k = 2
  * filename = permutation5.txt, k = 3
  * filename = duplicates.txt, k = 3
  * filename = permutation8.txt, k = 2
==> passed

Total: 9/9 tests passed!


================================================================
********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Permutation
*-----------------------------------------------------------
Running 2 total tests.

Test 1: Check that only one Deque or RandomizedQueue object is created
  * filename = distinct.txt, n = 9, k = 1
  * filename = distinct.txt, n = 9, k = 2
  * filename = distinct.txt, n = 9, k = 4
  * filename = tinyTale.txt, n = 12, k = 10
  * filename = tale.txt, n = 138653, k = 50
==> passed

Test 2: Check that the maximum size of any Deque or RandomizedQueue object
        created is between k and n
  * filename = distinct.txt, n = 9, k = 1
  * filename = distinct.txt, n = 9, k = 2
  * filename = distinct.txt, n = 9, k = 4
  * filename = tinyTale.txt, n = 12, k = 10
  * filename = tale.txt, n = 138653, k = 5
  * filename = tale.txt, n = 138653, k = 50
  * filename = tale.txt, n = 138653, k = 500
  * filename = tale.txt, n = 138653, k = 5000
  * filename = tale.txt, n = 138653, k = 50000
==> passed

Test 3 (bonus): Check that maximum size of any or Deque or RandomizedQueue object
                created is equal to k
  * filename = tale.txt, n = 138653, k = 5
    - max size of RandomizedQueue object = 138653

  * filename = tale.txt, n = 138653, k = 50
    - max size of RandomizedQueue object = 138653

  * filename = tale.txt, n = 138653, k = 500
    - max size of RandomizedQueue object = 138653

  * filename = tale.txt, n = 138653, k = 5000
    - max size of RandomizedQueue object = 138653

  * filename = tale.txt, n = 138653, k = 50000
    - max size of RandomizedQueue object = 138653

==> FAILED

Total: 2/2 tests passed!

================================================================



********************************************************************************
*  TESTING CORRECTNESS (substituting reference RandomizedQueue and Deque)
********************************************************************************

Timing Permutation
*-----------------------------------------------------------
Running 23 total tests.

Test 1: Count calls to methods in StdIn
  * java Permutation 5 < distinct.txt
    - do not call readLine(), hasNextLine(), or readAll()
    - number of calls to StdIn.readLine()    = 0
    - number of calls to StdIn.hasNextLine() = 0
    - number of calls to StdIn.readAll()     = 2

  * java Permutation 10 < permutation10.txt
    - do not call readLine(), hasNextLine(), or readAll()
    - number of calls to StdIn.readLine()    = 0
    - number of calls to StdIn.hasNextLine() = 0
    - number of calls to StdIn.readAll()     = 2

  * java Permutation 1 < mediumTale.txt
    - do not call readLine(), hasNextLine(), or readAll()
    - number of calls to StdIn.readLine()    = 0
    - number of calls to StdIn.hasNextLine() = 0
    - number of calls to StdIn.readAll()     = 2

  * java Permutation 20 < tale.txt
    - do not call readLine(), hasNextLine(), or readAll()
    - number of calls to StdIn.readLine()    = 0
    - number of calls to StdIn.hasNextLine() = 0
    - number of calls to StdIn.readAll()     = 2

  * java Permutation 100 < tale.txt
    - do not call readLine(), hasNextLine(), or readAll()
    - number of calls to StdIn.readLine()    = 0
    - number of calls to StdIn.hasNextLine() = 0
    - number of calls to StdIn.readAll()     = 2

  * java Permutation 16412 < tale.txt
    - do not call readLine(), hasNextLine(), or readAll()
    - number of calls to StdIn.readLine()    = 0
    - number of calls to StdIn.hasNextLine() = 0
    - number of calls to StdIn.readAll()     = 2

==> FAILED

Test 2: Count calls to methods in Deque and RandomizedQueue
  * java Permutation 5 < distinct.txt
  * java Permutation 10 < permutation10.txt
  * java Permutation 1 < mediumTale.txt
  * java Permutation 20 < tale.txt
  * java Permutation 100 < tale.txt
  * java Permutation 16412 < tale.txt
==> passed

Test 3: Count calls to methods in StdRandom
  * java Permutation 5 < distinct.txt
  * java Permutation 10 < permutation10.txt
  * java Permutation 1 < mediumTale.txt
  * java Permutation 20 < tale.txt
  * java Permutation 100 < tale.txt
  * java Permutation 16412 < tale.txt
==> passed

Test 4: Time main() with k = 5, for inputs containing n random strings

                    n  seconds
------------------------------
=> passed        1000     0.00
=> passed        2000     0.00
=> passed        4000     0.01
=> passed        8000     0.01
=> passed       16000     0.01
=> passed       32000     0.02
=> passed       64000     0.05
=> passed      128000     0.09
=> passed      256000     0.19
=> passed      512000     0.36
==> 10/10 tests passed


Test 5: Time main() with k = 1000, for inputs containing n random strings

                    n  seconds
------------------------------
=> passed        1000     0.00
=> passed        2000     0.00
=> passed        4000     0.00
=> passed        8000     0.01
=> passed       16000     0.01
=> passed       32000     0.02
=> passed       64000     0.04
=> passed      128000     0.09
=> passed      256000     0.18
=> passed      512000     0.35
==> 10/10 tests passed


Total: 22/23 tests passed!


================================================================



********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Deque
*-----------------------------------------------------------
For tests 1-4, the maximum amount of memory allowed for a Deque
containing n items is 48n + 192.

Running 28 total tests.

Test 1a-1e: Total memory usage after inserting n items,
            where n is a power of 2.

                 n        bytes
----------------------------------------------------------
=> passed        8          424
=> passed       64         3112
=> passed      256        12328
=> passed     1024        49192
=> passed     4096       196648
==> 5/5 tests passed

Memory: 48.00 n + 40.00   (R^2 = 1.000)



Test 2a-2e: Total memory usage after inserting n+1 items,
            where n is a power of 2.

                 n        bytes
----------------------------------------------------------
=> passed        8          472
=> passed       64         3160
=> passed      256        12376
=> passed     1024        49240
=> passed     4096       196696
==> 5/5 tests passed

Memory after adding n = 2^i + 1 items: 48.00 n + 40.00   (R^2 = 1.000)



Test 3a-3e: Total memory usage after inserting 2n+1 items
            and deleting n items, where n is a power of 2.

                 n        bytes
----------------------------------------------------------
=> passed        8          472
=> passed       64         3160
=> passed      256        12376
=> passed     1024        49240
=> passed     4096       196696
==> 5/5 tests passed

Memory: 48.00 n + 40.00   (R^2 = 1.000)



Test 4a-4e: Total memory usage after inserting n items and then
            deleting all but one item, where n is a power of 2.
            (should not grow with n or be too large of a constant)

                 n        bytes
----------------------------------------------------------
=> passed        8           88
=> passed       64           88
=> passed      256           88
=> passed     1024           88
=> passed     4096           88
==> 5/5 tests passed

Memory after adding n = 2^i items: 88.00   (R^2 = 1.000)



Test 5a-5e: Total memory usage of iterator after inserting n items.
            (should not grow with n or be too large of a constant)

                 n        bytes
----------------------------------------------------------
=> FAILED        8           80   (1.3x)
=> FAILED       64           80   (1.3x)
=> FAILED      256           80   (1.3x)
=> FAILED     1024           80   (1.3x)
=> FAILED     4096           80   (1.3x)
==> 0/5 tests passed

Memory of iterator after adding n = 2^i items: 80.00   (R^2 = 1.000)



Test 6a: Insert n strings; delete them one at a time, checking for
         loitering after each deletion. The probabilities of addFirst()
         and addLast() are (p1, p2), respectively. The probabilities of
         removeFirst() and removeLast() are (q1, q2), respectively
  * 100 random insertions (1.0, 0.0) and 100 random deletions (1.0, 0.0)
  * 100 random insertions (1.0, 0.0) and 100 random deletions (0.0, 1.0)
  * 100 random insertions (0.0, 1.0) and 100 random deletions (1.0, 0.0)
  * 100 random insertions (0.0, 1.0) and 100 random deletions (0.0, 1.0)
  * 100 random insertions (0.5, 0.5) and 100 random deletions (0.5, 0.5)
==> passed

Test 6b: Perform random operations, checking for loitering after
         each operation. The probabilities of addFirst(), addLast(),
         removeFirst(), and removeLast() are (p1, p2, p3, p4),
         respectively.
  * 100 random operations (0.8, 0.0, 0.2, 0.0)
  * 100 random operations (0.8, 0.0, 0.0, 0.2)
  * 100 random operations (0.0, 0.8, 0.2, 0.0)
  * 100 random operations (0.0, 0.8, 0.0, 0.2)
  * 100 random operations (0.4, 0.4, 0.1, 0.1)
  * 100 random operations (0.2, 0.2, 0.3, 0.3)
==> passed

Test 7: Worst-case constant memory allocated or deallocated
        per deque operation?
  * 128 random operations
  * 256 random operations
  * 512 random operations
==> passed

Total: 23/28 tests passed!

================================================================



Analyzing memory of RandomizedQueue
*-----------------------------------------------------------
For tests 1-4, the maximum amount of memory allowed for
a RandomizedQueue containing n items is 48n + 192.

Running 23 total tests.

Test 1a-1d: Total memory usage after inserting n integers.

                 n        bytes
----------------------------------------------------------
=> passed       64         2632
=> passed      256        10312
=> passed     1024        41032
=> passed     4096       163912
==> 4/4 tests passed


Memory: 40.00 n + 72.00   (R^2 = 1.000)



Test 2a-2d: Total memory usage after inserting n+1 items.

                 n        bytes
----------------------------------------------------------
=> passed       64         2672
=> passed      256        10352
=> passed     1024        41072
=> passed     4096       163952
==> 4/4 tests passed


Memory: 40.00 n + 112.00   (R^2 = 1.000)



Test 3a-3d: Total memory usage after inserting 2n+1 items, and
            then deleting n items.

                 n        bytes
----------------------------------------------------------
=> passed       64         2672
=> passed      256        10352
=> passed     1024        41072
=> passed     4096       163952
==> 4/4 tests passed


Memory: 40.00 n + 112.00   (R^2 = 1.000)



Test 4a-4d: Total memory usage after inserting n items, and
            then deleting all but one item.

                 n        bytes
----------------------------------------------------------
=> passed       64          112
=> passed      256          112
=> passed     1024          112
=> passed     4096          112
==> 4/4 tests passed


Memory: 112.00   (R^2 = 1.000)



Test 5a-5d: Total memory usage of iterator after inserting n items.

                 n        bytes
----------------------------------------------------------
=> passed       64          608
=> passed      256         2144
=> passed     1024         8288
=> passed     4096        32864
==> 4/4 tests passed


Memory: 8.00 n + 96.00   (R^2 = 1.000)



Test 6a: Insert 100 strings; delete them one at a time, checking
         for loitering after each deletion.
==> passed

Test 6b: Perform random operations, checking for loitering after
         each operation. The probabilities of enqueue(), dequeue(),
         and sample() are (p1, p2, p3), respectively.
  * 200 random operations (0.8, 0.2, 0.0)
  * 200 random operations (0.2, 0.8, 0.0)
  * 200 random operations (0.6, 0.2, 0.2)
  * 200 random operations (0.2, 0.4, 0.4)
==> passed

Test 7: Insert T items into queue; then iterate over queue and check
        that worst-case constant memory is allocated or deallocated
        per iterator operation.
  * T = 64
  * T = 128
  * T = 256
==> passed

Total: 23/23 tests passed!

================================================================



********************************************************************************
*  TIMING
********************************************************************************

Timing Deque
*-----------------------------------------------------------
Running 55 total tests.

Test 1a-1g: Make n random calls to addFirst(), removeFirst(), isEmpty(), and size()
            with probabilities (0.7, 0.1, 0.1, 0.1)

                    n  seconds
------------------------------
=> passed        1024     0.00
=> passed        2048     0.00
=> passed        4096     0.00
=> passed        8192     0.00
=> passed       16384     0.00
=> passed       32768     0.00
=> passed       65536     0.01
=> passed      128000     0.01
=> passed      256000     0.02
=> passed      512000     0.04
=> passed     1024000     0.09
=> passed     2048000     0.12
==> 12/12 tests passed


Test 2a-2g: Make n random calls to addFirst(), removeFirst(), isEmpty(), and size(),
            with probabilities (0.7, 0.1, 0.1, 0.1)

                    n  seconds
------------------------------
=> passed        1024     0.00
=> passed        2048     0.00
=> passed        4096     0.00
=> passed        8192     0.00
=> passed       16384     0.00
=> passed       32768     0.00
=> passed       65536     0.00
=> passed      128000     0.00
=> passed      256000     0.01
=> passed      512000     0.02
=> passed     1024000     0.03
=> passed     2048000     0.07
==> 12/12 tests passed


Test 3a-3g: Make n random calls to addFirst(), addLast(), removeFirst(), removeLast(),
            isEmpty(), and size() with probabilities (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)

                    n  seconds
------------------------------
=> passed        1024     0.00
=> passed        2048     0.00
=> passed        4096     0.00
=> passed        8192     0.00
=> passed       16384     0.00
=> passed       32768     0.00
=> passed       65536     0.00
=> passed      128000     0.01
=> passed      256000     0.01
=> passed      512000     0.02
=> passed     1024000     0.04
=> passed     2048000     0.14
==> 12/12 tests passed


Test 4a-4g: Create a deque of n objects, then iterate over the n objects
            by calling next() and hasNext().

                    n  seconds
------------------------------
=> passed        1024     0.00
=> passed        2048     0.00
=> passed        4096     0.00
=> passed        8192     0.00
=> passed       16384     0.00
=> passed       32768     0.00
=> passed       65536     0.01
=> passed      128000     0.01
=> passed      256000     0.02
=> passed      512000     0.03
=> passed     1024000     0.03
=> passed     2048000     0.03
==> 12/12 tests passed


Test 5a-5g: Create a deque of n objects, then interleave n calls each to
            removeFirst()/removeLast() and addFirst()/addLast().

                    n  seconds
----------------------------------
=> passed        1025     0.00
=> passed        2049     0.00
=> passed        4097     0.00
=> passed       16385     0.00
=> passed       32767     0.00
=> passed       32768     0.00
=> passed       32769     0.00
==> 7/7 tests passed

Total: 55/55 tests passed!


================================================================



Timing RandomizedQueue
*-----------------------------------------------------------
Running 58 total tests.

Test 1: Call enqueue() and dequeue() n times each; count calls to StdRandom
  * n = 10
  * n = 100
  * n = 1000
==> passed

Test 2: Call sample() n times and count calls to StdRandom
  * n = 10
  * n = 100
  * n = 1000
==> passed

Test 3: Iterate over queue of size n and count calls to StdRandom
  * n = 10
  * n = 100
  * n = 1000
==> passed

Test 4a-g: Make n random calls to enqueue(), sample(), dequeue(), isEmpty(),
           and size() with probabilities (0.2, 0.2, 0.2, 0.2, 0.2)

                    n  seconds
----------------------------------
=> passed        1024     0.00
=> passed        2048     0.00
=> passed        4096     0.00
=> passed        8192     0.00
=> passed       16384     0.00
=> passed       32768     0.00
=> passed       65536     0.01
=> passed      128000     0.01
=> passed      256000     0.02
=> passed      512000     0.03
=> passed     1024000     0.10
=> passed     2048000     0.22
==> 12/12 tests passed


Test 5a-g: Make n random calls to enqueue(), sample(), dequeue(), isEmpty(),
           and size() with probabilities (0.6, 0.1, 0.1, 0.1, 0.1)

                    n  seconds
----------------------------------
=> passed        1024     0.00
=> passed        2048     0.00
=> passed        4096     0.00
=> passed        8192     0.00
=> passed       16384     0.01
=> passed       32768     0.04
=> passed       65536     0.15
=> FAILED      128000     0.56
   [ Most likely one of your operations is not constant time. ]
==> 7/12 tests passed


Test 6a-g: Make n random calls to enqueue(), sample(), dequeue(), isEmpty(),
            and size() with probabilities (0.1, 0.1, 0.6, 0.1, 0.1)

                    n  seconds
----------------------------------
=> passed        1024     0.00
=> passed        2048     0.00
=> passed        4096     0.00
=> passed        8192     0.00
=> passed       16384     0.00
=> passed       32768     0.00
=> passed       65536     0.00
=> passed      128000     0.01
=> passed      256000     0.02
=> passed      512000     0.04
=> passed     1024000     0.09
=> passed     2048000     0.44
==> 12/12 tests passed


Test 7a-g: Create randomized queue of n objects, then iterate
           over the n objects by calling next() and hasNext().

                    n  seconds
----------------------------------
=> passed        1024     0.00
=> passed        2048     0.00
=> passed        4096     0.00
=> passed        8192     0.00
=> passed       16384     0.02
=> passed       32768     0.04
=> passed       65536     0.17
=> passed      128000     0.72
=> FAILED      256000     3.32
   [ Most likely one of your operations is not constant time. ]
==> 8/12 tests passed


Test 8a-g: Create randomized queue of n objects, then interleave
           n calls each to dequeue() and enqueue().

                    n  seconds
----------------------------------
=> passed        1025     0.00
=> passed        2049     0.00
=> passed        4097     0.01
=> passed       16385     0.21
=> passed       32767     0.82
=> passed       32768     0.81
=> passed       32769     0.82
==> 7/7 tests passed

Total: 49/58 tests passed!


================================================================