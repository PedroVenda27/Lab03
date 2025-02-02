package com.bmcl.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer  {
    private final GenericListFilterer filter;
    public ListFilterer(GenericListFilterer filter) {
        this.filter = filter;
    }
    public List<Integer> filter(List<Integer> list) {
        List<Integer> filtered = new ArrayList<>();
        for (int i : list)
            if (filter.accept(i)) filtered.add(i);
        return filtered;
    }
}