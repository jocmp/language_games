require 'algos/fibonacci'

describe Fibonacci do
  describe "#solve" do
    it "expects the fibonacci results of 'n'" do
      fibonacci = Fibonacci.new

      expect(fibonacci.solve(1)).to eq 1
      expect(fibonacci.solve(2)).to eq 1
      expect(fibonacci.solve(3)).to eq 2
      expect(fibonacci.solve(9)).to eq 34
    end
  end

  describe "#solve_recursive" do
    it 'solves the problem recursively' do
      fibonacci = Fibonacci.new
      expect(fibonacci.solve_recursive(1)).to eq 1
      expect(fibonacci.solve_recursive(2)).to eq 1
      expect(fibonacci.solve_recursive(3)).to eq 2
      expect(fibonacci.solve_recursive(9)).to eq 34
    end
  end
end