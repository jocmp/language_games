class MergeSort
  def sort(arr)
    if arr.length < 2
      return arr
    end

    middle_index = arr.length / 2

    left_side = sort(arr.slice(0...middle_index))
    right_side = sort(arr.slice(middle_index..arr.length))

    merge(left_side, right_side)
  end

  private

  def merge(left_side, right_side)
    results = []
    while left_side.any? and right_side.any? do
      if left_side.first <= right_side.first
        results << left_side.first
        left_side = left_side.drop(1)
      else
        results << right_side.first
        right_side = right_side.drop(1)
      end
    end

    while left_side.any?
      puts "rest: #{left_side}"
      results << left_side.first
      left_side = left_side.drop(1)
    end

    while right_side.any?
      puts "rest: #{right_side}"
      results << right_side.first
      right_side = right_side.drop(1)
    end

    results
  end
end