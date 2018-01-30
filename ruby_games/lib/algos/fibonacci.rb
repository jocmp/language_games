class Fibonacci
  def solve(num)
    if num < 2
      1
    end

    previous_fibonacci = 0
    current_fibonacci = 1
    (num - 1).times do
      new_fibonacci = current_fibonacci + previous_fibonacci
      previous_fibonacci = current_fibonacci
      current_fibonacci = new_fibonacci
    end
    current_fibonacci
  end

  def solve_recursive(num)
    if num < 2
      num
    else
      solve_recursive(num - 2) + solve_recursive(num - 1)
    end
  end
end