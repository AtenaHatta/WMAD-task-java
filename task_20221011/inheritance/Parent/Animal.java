package inheritance.parent;

public class Animal {
    private int height;
    private int weight;
    private String AnimalType;
    private String BloodType;

      public Animal(int height, int weight, String AnimalType,String BloodType){
        this.height = height;
        this.weight = weight;
        this.AbimalType = AnimalType;
        this. BloodType =  BloodType;
      }
  
      public int getHeight(){
        return height;
      }
  
      public int getWeight(){
        return weight;
      }
  
      public String getAnimalType(){
        return AnimalType;
      }
      
      public String getBloodType(){
        return BloodType;
      }
  

}