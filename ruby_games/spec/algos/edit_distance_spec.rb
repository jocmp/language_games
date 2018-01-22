require 'algos/edit_distance'

RSpec.describe EditDistance do
  describe "#solve" do
    it 'returns a number' do
      expect(EditDistance.new.solve("kitten", "sitting")).to eq 3
      expect(EditDistance.new.solve("saturday", "sunday")).to eq 3
      expect(EditDistance.new.solve("bach", "back")).to eq 1
      expect(EditDistance.new.solve("", "")).to eq 0
      expect(EditDistance.new.solve("benson", "campbell")).to eq 8
    end
  end
end