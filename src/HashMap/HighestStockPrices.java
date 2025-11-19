package HashMap;

import java.util.*;


public class HighestStockPrices {

    public static void main(String[] args) {

        HashMap<String, Integer> stockMap = new HashMap<>();

        stockMap.put("Tesla", 450);
        stockMap.put("Google", 499);
        stockMap.put("Facebook", 460);
        stockMap.put("Amazon", 398);
        stockMap.put("Apple", 589);

        System.out.println("/n The list of companies with stock prices are : " + stockMap);

        String topCompany = null;
        Integer highestPrice = Integer.MIN_VALUE;

        for (String company : stockMap.keySet()) {
            Integer price = stockMap.get(company);
            if (price > highestPrice) {
                highestPrice = price;
                topCompany = company;

                System.out.println("The highest stock price company is :");
                System.out.println(topCompany + "  " + highestPrice);
            }
        }
    }
}
