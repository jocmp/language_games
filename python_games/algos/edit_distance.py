
class EditDistance(object):
    '''
    1) Subproblem on x[i:] & y[j:] forall i o j
        - # subprobs = O(|x|*|y|)
    2) Guess
        - insert OR delete OR replace
        - replace x[i] -> y[j]
        - insert y[i]
        - delete x[i]
    '''

    def solve(self, first_word, second_word):
        m = len(first_word) + 1
        n = len(second_word) + 1
        paths = [[0 for column_index in range(m)] for row_index in range(n)]

        for j in range(1, n):
            paths[j][0] = j + 1

        for i in range(1, m):
            paths[0][i] = i + 1

        for j in range(1, n):
            for i in range(1, m):
                if second_word[j - 1] == first_word[i - 1]:
                    substitution_cost = 0
                else:
                    substitution_cost = 1
                deletion = paths[j][i - 1] + 1
                insertion = paths[j - 1][i] + 1
                substitution = paths[j - 1][i - 1] + substitution_cost
                paths[j][i] = min(deletion, insertion, substitution)

        print_paths = ""
        for i in range(m):
            for j in range(n):
                print_paths += str(paths[j][i]) + "  "
            print_paths += "\n"
        print(print_paths)
        return paths[n - 1][m - 1]


def test_edit_distance():
    assert EditDistance().solve("kitten", "sitting") == 3
    assert EditDistance().solve("saturday", "sunday") == 3
    assert EditDistance().solve("bach", "back") == 1
    assert EditDistance().solve("benson", "campbell") == 8
