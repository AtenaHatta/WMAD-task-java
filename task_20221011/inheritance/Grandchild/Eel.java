package inheritance.Grandchild;
import inheritance.parent.child.Fish;

public class Eel extends Reptile{
  public Eel(int height,int weight,String animalType,String bloodType,String skinType,String bone,
  String eggType){
    super(weight,animalType,bloodType,skinType,bone,eggType);
  }

  public Eel(){
    this.skill = "Release electric charge";
   }

  @Override
  public String showInfo() {
    return
    "Eel [Height: " + getHeight() +
    "Weight: " + getWeight() +
    "Animal type: " + getAnimalType() +
    "Blood type: " + getBloodType() +
    "skill: " + getskillType() +
    "features: " + getFeatures() +
    "]";
  }
}
