class Reverse
  def solve(word)
    reversed_word = ''
    (word.length - 1).downto(0) { |index| reversed_word << word[index] }
    reversed_word
  end
end