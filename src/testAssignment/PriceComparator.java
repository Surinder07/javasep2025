package testAssignment;

import java.util.Comparator;

public class PriceComparator implements Comparator<Products> {
    @Override
    public int compare(Products p1, Products p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
