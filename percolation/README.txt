See the Assessment Guide for information on how to interpret this report.

ASSESSMENT SUMMARY

Compilation:  PASSED
API:          PASSED

Findbugs:     PASSED
PMD:          PASSED
Checkstyle:   PASSED

Correctness:  27/27 tests passed
Memory:       6/8 tests passed
Timing:       6/20 tests passed

Aggregate score: 83.50%
[Compilation: 5%, API: 5%, Findbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
3.2K Aug  6 21:09 Percolation.java
2.2K Aug  6 21:09 PercolationStats.java


********************************************************************************
*  COMPILING
********************************************************************************


% javac Percolation.java
*-----------------------------------------------------------

% javac PercolationStats.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
Percolation:

PercolationStats:

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

% custom checkstyle checks for Percolation.java
*-----------------------------------------------------------

% custom checkstyle checks for PercolationStats.java
*-----------------------------------------------------------


================================================================


********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of Percolation
*-----------------------------------------------------------
Running 15 total tests.

Tests 1 through 8 create a Percolation object using your code, then repeatedly
open sites by calling open(). After each call to open(), it checks the return
values of isOpen(), percolates(), numberOfOpenSites(), and isFull() in that order.
Except as noted, a site is opened at most once.

Test 1: Open predetermined list of sites using file inputs
  * filename = input6.txt
  * filename = input8.txt
  * filename = input8-no.txt
  * filename = input10-no.txt
  * filename = greeting57.txt
  * filename = heart25.txt
==> passed

Test 2: Open random sites until just before system percolates
  * n = 3
  * n = 5
  * n = 10
  * n = 10
  * n = 20
  * n = 20
  * n = 50
  * n = 50
==> passed

Test 3: Open predetermined sites for n = 1 and n = 2
  * filename = input1.txt
  * filename = input1-no.txt
  * filename = input2.txt
  * filename = input2-no.txt
==> passed

Test 4: Check for backwash with predetermined sites
  * filename = input20.txt
  * filename = input10.txt
  * filename = input50.txt
  * filename = jerry47.txt
==> passed

Test 5: Check for backwash with predetermined sites that have
        multiple percolating paths
  * filename = input3.txt
  * filename = input4.txt
  * filename = input7.txt
==> passed

Test 6: Open predetermined sites with long percolating path
  * filename = snake13.txt
  * filename = snake101.txt
==> passed

Test 7: Open every site
  * filename = input5.txt
==> passed

Test 8: Open random sites until just before system percolates,
        allowing open() to be called on a site more than once
  * n = 3
  * n = 5
  * n = 10
  * n = 10
  * n = 20
  * n = 20
  * n = 50
  * n = 50
==> passed

Test 9: Call methods with invalid arguments
  * n = 10, (row, col) = (0, 6)
  * n = 10, (row, col) = (12, 6)
  * n = 10, (row, col) = (11, 6)
  * n = 10, (row, col) = (6, 0)
  * n = 10, (row, col) = (6, 12)
  * n = 10, (row, col) = (6, 11)
  * n = 10, (row, col) = (-2147483648, -2147483648)
  * n = 10, (row, col) = (1000, 1000)
==> passed

Test 10: Call constructor with invalid argument
  * n = -10
  * n = -1
  * n = 0
  * n = -2147483648
==> passed

Test 11: Create multiple Percolation objects at the same time
         (to make sure you didn't store data in static variables)
==> passed

Test 12: Open predetermined list of sites using file inputs,
         but permute the order in which methods are called
  * filename = input8.txt;  order =     isFull(),     isOpen(), percolates()
  * filename = input8.txt;  order =     isFull(), percolates(),     isOpen()
  * filename = input8.txt;  order =     isOpen(),     isFull(), percolates()
  * filename = input8.txt;  order =     isOpen(), percolates(),     isFull()
  * filename = input8.txt;  order = percolates(),     isOpen(),     isFull()
  * filename = input8.txt;  order = percolates(),     isFull(),     isOpen()
==> passed

Test 13: Call all methods in random order until just before system percolates
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed

Test 14: Call all methods in random order until almost all sites are open,
         but with inputs not prone to backwash
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed

Test 15: Call all methods in random order until all sites are open,
         allowing open() to be called on a site more than once
         (these inputs are prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed


Total: 15/15 tests passed!


================================================================
********************************************************************************
*  TESTING CORRECTNESS (substituting reference Percolation)
********************************************************************************

Testing correctness of PercolationStats
*-----------------------------------------------------------
Running 12 total tests.

Test 1: Check that PercolationStats creates trials Percolation objects, each of size n-by-n
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 2: Check that PercolationStats calls open() until system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 3: Check that PercolationStats does not call open() after system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 4: Check that mean() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 5: Check that stddev() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 6: Check that confidenceLo() and confidenceHigh() are consistent with mean() and stddev()
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 7: Check whether exception is thrown if either n or trials is out of bounds
  * n = -23, trials =  42
  * n =  23, trials =   0
  * n = -42, trials =   0
  * n =  42, trials =  -1
  * n = -2147483648, trials = -2147483648
==> passed

Test 8: Create two PercolationStats objects at the same time and check mean()
        (to make sure you didn't store data in static variables)
  * n1 =  50, trials1 =  10, n2 =  50, trials2 =   5
  * n1 =  50, trials1 =   5, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  25, trials2 =  10
  * n1 =  25, trials1 =  10, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  15, trials2 = 100
  * n1 =  15, trials1 = 100, n2 =  50, trials2 =  10
==> passed

Test 9: Check that the methods return the same value, regardless of
        the order in which they are called
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 10: Check that no calls to StdRandom.setSeed()
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
==> passed

Test 11: Check distribution of number of sites opened until percolation
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
==> passed

Test 12: Check that each site is opened the expected number of times
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
==> passed


Total: 12/12 tests passed!


================================================================
********************************************************************************
*  MEMORY (substituting reference Percolation)
********************************************************************************

Analyzing memory of PercolationStats
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: Memory usage as a function of trials for n = 100
            (max allowed: 8*trials + 128 bytes)

            trials        bytes
--------------------------------------------
=> passed       16          192
=> passed       32          320
=> passed       64          576
=> passed      128         1088
==> 4/4 tests passed


Estimated student memory = 8.00 T + 64.00   (R^2 = 1.000)

Total: 4/4 tests passed!

================================================================



********************************************************************************
*  TIMING (substituting reference Percolation)
********************************************************************************

Timing PercolationStats
*-----------------------------------------------------------
Running 4 total tests.

Test 1: Count calls to StdStats.mean() and StdStats.stddev()
  * n =  20, trials =  10
    - calls StdStats.mean() the wrong number of times
    - number of student   calls to StdStats.mean() = 2
    - number of reference calls to StdStats.mean() = 1

    - calls StdStats.stddev() the wrong number of times
    - number of student   calls to StdStats.stddev() = 2
    - number of reference calls to StdStats.stddev() = 1

  * n =  50, trials =  20
    - calls StdStats.mean() the wrong number of times
    - number of student   calls to StdStats.mean() = 2
    - number of reference calls to StdStats.mean() = 1

    - calls StdStats.stddev() the wrong number of times
    - number of student   calls to StdStats.stddev() = 2
    - number of reference calls to StdStats.stddev() = 1

  * n = 100, trials =  50
    - calls StdStats.mean() the wrong number of times
    - number of student   calls to StdStats.mean() = 2
    - number of reference calls to StdStats.mean() = 1

    - calls StdStats.stddev() the wrong number of times
    - number of student   calls to StdStats.stddev() = 2
    - number of reference calls to StdStats.stddev() = 1

  * n =  64, trials = 150
    - calls StdStats.mean() the wrong number of times
    - number of student   calls to StdStats.mean() = 2
    - number of reference calls to StdStats.mean() = 1

    - calls StdStats.stddev() the wrong number of times
    - number of student   calls to StdStats.stddev() = 2
    - number of reference calls to StdStats.stddev() = 1

==> FAILED

Test 2: Count calls to methods in StdRandom
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
==> passed

Test 3: Count calls to methods in Percolation
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 4: Call PercolationStats methods with trials = 3 and values of n that go up
        by a factor of sqrt(2). The test passes when n reaches 2,896.

     The approximate order-of-growth is n ^ (log ratio)

         n  seconds log ratio
     ------------------------
       724     0.18       2.3
      1024     0.39       2.2
      1448     1.14       3.1
      2048     3.00       2.8
      2896     7.27       2.6
==> passed


Total: 3/4 tests passed!


================================================================



********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Percolation
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: Check that total memory <= 17 n^2 + 128 n + 1024 bytes

                 n        bytes
--------------------------------------------
=> passed       64        37552
=> passed      256       592048

        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        OperationCountLimitExceededException
        Number of calls to methods in WeightedQuickUnionUF exceeds limit: 100000000
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


Total: 2/4 tests passed!

================================================================



********************************************************************************
*  TIMING
********************************************************************************

Timing Percolation
*-----------------------------------------------------------
Running 16 total tests.

Test 1a-1e: Creates an n-by-n percolation system; open sites at random until
            the system percolates, interleaving calls to percolates() and open().
            Count calls to connected(), union() and find() in WeightedQuickUnionUF.

                                       2 * connected()
                 n       union()              + find()        constructor
-----------------------------------------------------------------------------------
=> passed       16          235                  1752                   1
=> FAILED       32          732                 10776   (1.5x)          1
=> FAILED       64         2531                102908   (3.5x)          1
=> FAILED      128        11376                749644   (6.4x)          1
=> FAILED      256        45822               5970700  (12.7x)          1
=> FAILED      512       185563              42216312  (22.4x)          1

        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        OperationCountLimitExceededException
        Number of calls to methods in WeightedQuickUnionUF exceeds limit: 100000000
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

==> 1/7 tests passed


If one of the values in the table violates the performance limits
the factor by which you failed the test appears in parentheses.
For example, (9.6x) in the union() column indicates that it uses
9.6x too many calls.


Tests 2a-2f: Checks whether the number of calls to union(), connected(), and find()
             is a constant per call to open(), isOpen(), isFull(), and percolates().
             The table shows the maximum number of union(), connected(), and
             find() calls made during a single call to open(), isOpen(), isFull(),
             and percolates().

                 n     per open()      per isOpen()    per isFull()    per percolates()
---------------------------------------------------------------------------------------------
=> passed       16        4               0               1               8
=> passed       32        4               0               1              20
=> FAILED       64        4               0               1              36   (1.5x)
=> FAILED      128        4               0               1              80   (3.3x)
=> FAILED      256        4               0               1             146   (6.1x)
=> FAILED      512        4               0               1             303  (12.6x)
=> FAILED     1024        4               0               1             608  (25.3x)
==> 2/7 tests passed



Running time (in seconds) depends on the machine on which the script runs.


Test 3: Create an n-by-n percolation system; interleave calls to percolates()
        and open() until the system percolates. The values of n go up by a
        factor of sqrt(2). The test is passed if n >= 4096 in under 10 seconds.

     The approximate order-of-growth is n ^ (log ratio)

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
       362     0.10     3.1     18332200     3.3
       512     0.28     2.8     49689458     2.9
       724     0.76     2.9    131647440     2.8

        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        OperationCountLimitExceededException
        Number of calls to methods in WeightedQuickUnionUF exceeds limit: 100000000
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

==> FAILED



Test 4: Create an n-by-n percolation system; interleave calls to open(),
        percolates(), isOpen(), isFull(), and numberOfOpenSites() until.
        the system percolates. The values of n go up by a factor of sqrt(2).
        The test is passed if n >= 4096 in under 10 seconds.

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
       512     0.26     2.8     43443718     3.0
       724     0.76     3.1    136142562     3.3

        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        OperationCountLimitExceededException
        Number of calls to methods in WeightedQuickUnionUF exceeds limit: 100000000
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

==> FAILED


Total: 3/16 tests passed!


================================================================
