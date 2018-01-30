require 'algos/reverse'

describe Reverse do
  describe "#solve" do
    it "reverses a word" do
      reverse = Reverse.new
      expect(reverse.solve('')).to eq ''
      expect(reverse.solve('ParkWhiz')).to eq 'ParkWhiz'.reverse
    end
  end
end