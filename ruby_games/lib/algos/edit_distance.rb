class EditDistance

  def solve(first_word, second_word)
      m = first_word.length + 1
      n = second_word.length + 1

      paths = Array.new(n) { Array.new(m, 0) }
      puts paths.map { |row| row.join(' ') }

      (1...m).each { |i| paths[0][i] = i }
      (1...n).each { |j| paths[j][0] = j  }

      (1...n).each do |j|
        (1...m).each do|i|
          if first_word[i - 1] == second_word[j - 1]
            paths[j][i] = paths[j - 1][i - 1]
          else
            #  [j - 1][i - 1] | [j][i - 1]
            #      [j - 1][i] | [j][i]
            insertion = paths[j][i - 1] + 1
            deletion = paths[j - 1][i] + 1
            substitution = paths[j - 1][i - 1] + 1

            paths[j][i] = [insertion, deletion, substitution].min
          end
        end
      end

      puts paths.map { |row| row.join(' ') }
      puts

      return paths[n - 1][m - 1]
  end
end