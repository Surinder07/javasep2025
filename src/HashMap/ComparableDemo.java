package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {


    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Audi", "White", 28000.45));
        vehicleList.add(new Vehicle("Mercedes", "Green", 32000.34));
        vehicleList.add(new Vehicle("Hyundai", "Orange", 234324.324));
        vehicleList.add(new Vehicle("Honda", "Yellow", 35000.334));
        vehicleList.add(new Vehicle("Tesla", "Blue", 25000.5));

       // Collections.sort(vehicleList, new BrandCompartor());
        // compare based on color
      //  Collections.sort(vehicleList, new ColorComparator());
        // compare based on price
       Collections.sort(vehicleList,new PriceComparator());







        System.out.println(vehicleList);


    }
}
