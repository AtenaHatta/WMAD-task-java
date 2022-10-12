package inheritance.child;
import inheritance.parent.Animal;

public class Reptile extends Animal{
  public class Reptile{
    private String skinType;
    private String bone;
    private String eggType;
  }

  public Reptile(){
    this.skinType = "Dry Skin";
    this.bone = "Back bone";
    this.eggType = "Soft-shelled eggs";  
   }

   public Reptile(String skinType,String bone,String eggType){
    this.skinType = skinType;
    this.bone = bone;
    this.eggType = eggType;
   }


   public String getSkinType() {
    return skinType;
   }

   public String getBone() {
    return bone;
   } 

   public String getEggType() {
    return eggType;
   }
}