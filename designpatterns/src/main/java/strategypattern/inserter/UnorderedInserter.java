package strategypattern.inserter;

import java.util.List;

public class UnorderedInserter implements Inserter{
    @Override
    public void inserter(Integer num, List<Integer> nums) {
        System.out.println("inside UnorderedInserter");
        nums.add(num);
    }
}
