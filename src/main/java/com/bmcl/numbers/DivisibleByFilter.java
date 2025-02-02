package com.bmcl.numbers;

public class DivisibleByFilter implements GenericListFilterer{
    private int divider;
    public DivisibleByFilter(int divider) {
        this.divider = divider;
    }
    @Override
    public boolean accept(Integer number) {
        return number % divider == 0;
    }
}
