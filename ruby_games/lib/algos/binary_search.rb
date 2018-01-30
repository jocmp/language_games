class BinarySearch
  def index_of(numbers, item)
    low = 0
    high = numbers.length - 1
    while low <= high do
      mid = (low + high) / 2
      if numbers[mid] == item
        return mid
      elsif numbers[mid] < item
        low += 1
      else
        high -= 1
      end
    end
    return -1
  end
end