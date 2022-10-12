package inheritance.Grandchild;
import inheritance.parent.child.Reptile;

public class Crocodile extends Reptile{
  public Crocodile(int height,int weight,String animalType,String bloodType,String skinType,String bone,
  String eggType){
    super(weight,animalType,bloodType,skinType,bone,eggType);
  }

  public Crocodile(){
    this.eggType = "Hard-shelled eggs";
   }

  @Override
  public String showInfo() {
    return
    "Crocodile [Height: " + getHeight() +
    "Weight: " + getWeight() +
    "Animal type: " + getAnimalType() +
    "Blood type: " + getBloodType() +
    "Skin Type: " + getSkinType() +
    "Bone: " + getBone() +
    "Egg type: " + getEggType() +
    "]";
  }
}