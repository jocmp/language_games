require 'algos/control_flow'

describe ControlFlow do
  context 'incrementors' do
    describe '#upto' do
      it 'increments a counter to 20' do
        expect(ControlFlow.new.upto).to eq 20
      end
    end


    describe '#times' do
      it 'increments a count to 20' do
        expect(ControlFlow.new.positive_times).to eq 20
      end
    end

    describe '#each' do

  end
  end
end