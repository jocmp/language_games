class ControlFlow
  def upto
    count = 0
    1.upto(20) { count += 1 }
    count
  end

  def positive_times
    count = 0
    20.times { count += 1 }
    count
  end

  def each_times
  end
end