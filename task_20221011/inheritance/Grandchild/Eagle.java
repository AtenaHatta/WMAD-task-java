package inheritance.Grandchild;
import inheritance.parent.child.Birds;

public class Eagle extends Birds{
  public Eagle(int height,int weight,String animalType,String bloodType,String feathers, String pros){
    super(height,weight,animalType,bloodType,feathers,pros);
  }

  @Override
  public String showInfo() {
    return
    "Eagle [Height: " + getHeight() +
    "Weight: " + getWeight() +
    "Animal type: " + getAnimalType() +
    "Blood type: " + getBloodType() +
    "feathers: " + getFeathers() +
    "Pros: " + getPros() +
    "]";
  }
}