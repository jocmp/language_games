`dynamic programming = recursion + memoization + careful guessing`

#### String subproblems

* suffixes x[i:] i range(n) forall i O(n)
* prefixes x[:i] i range(n) forall i O(n)
* substrings x[i:j] i range(n - 1) forall i <= j, O(n^2)


### DP Steps
1) define subproblems
2) guess (small part of solution)
3) recurrence (time/subproblem)
4) Recurse + memoize OR bottom-up
- Check that acyclic
5) solve original problem
   - time = # subproblems * time/subproblems
