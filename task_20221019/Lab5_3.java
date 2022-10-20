//Q3
// Make a record to store information about a car. It should contain fields for: - make -or- brand (String) - model (String) - year (int)
// Create an ArrayList of Car objects.
// Sort the ArrayList of cars by year (Ascending) and print them out.


package Lab5_3;

import java.util.ArrayList;
import java.util.List;

public class Lab5Q3 {

    public static void main(String[] args){
        
      List<String> listOfCars = new ArrayList<>();
      listOfCars.add(new Cars("benz","〇〇",2000));
      listOfCars.add(new Cars("ford","△△",2001));
      listOfCars.add(new Cars("VW","□□",2002));
     
      Collections.sort(listOfCars);

    }
  }

     class Cars impliements List<String>{
       String brand;
       String maker;
       int year:
    
      public Cars(String brand,String model, String year){
       this.brand = brand;
       this.model = model;
       this.year = year;
     }

     @Override
     public int compareTo(listOfCars o) {
         return o.year - this.year;
     }

    }




    


