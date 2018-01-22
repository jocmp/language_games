require 'algos/binary_search'

RSpec.describe BinarySearch do

  it "locates an index of an integer in O(log(n)) time" do
    expect(BinarySearch.new.index_of([0, 2, 20, 50, 69], 50)).to eq 3
    expect(BinarySearch.new.index_of([0, 2, 22, 35, 49, 50], 50)).to eq 5
    expect(BinarySearch.new.index_of([50, 60, 200, 1000, 1000000, 2500000], 50)).to eq 0
    expect(BinarySearch.new.index_of([0, 1, 20, 2000, 5000, 40000, 130200200], 99)).to eq -1
  end
end