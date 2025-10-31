package com.fp.lambda;

import java.util.Arrays;
import java.util.List;

public class discountImperative {
    public static void main(String[] args) {
        final List<Integer> prices = Arrays.asList(10, 30, 17, 20, 18, 45, 12);

        // Old style:
        //  double totalOfDiscountedPrices = 0.0;
        //     for(int price : prices) {
        //     if(price > 20) {
        //        totalOfDiscountedPrices += price * 0.9;
        //    }
        //  }

        // Better way:
        final double totalOfDiscountedPrices =
                prices.stream()
                        .filter(price -> price > 20)
                        .mapToDouble(price -> price * 0.9)
                        .sum();

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
