package strategypattern.store;

import strategypattern.inserter.Inserter;
import strategypattern.searcher.Searcher;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {
    private final List<Integer> nums;
    private final Inserter inserter;
    private final Searcher searcher;


    public NumberStore(Inserter inserter, Searcher searcher) {
        this.inserter = inserter;
        this.searcher = searcher;
        nums = new ArrayList<>();
    }

    public void insert(Integer num) {
        this.inserter.inserter(num, this.nums);
    }

    public Integer search(Integer key) {
        return this.searcher.search(key, this.nums);
    }
}
