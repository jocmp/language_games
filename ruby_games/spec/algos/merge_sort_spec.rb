require 'algos/merge_sort'

describe MergeSort do
  describe '#sort' do
    it 'sorts the list' do
      expect(MergeSort.new.sort([2, 3, 1])).to eq [1, 2, 3]
      expect(MergeSort.new.sort([6, 5, 3, 1, 8, 7, 2, 4])).to eq [1, 2, 3, 4, 5, 6, 7, 8]
    end
  end
end