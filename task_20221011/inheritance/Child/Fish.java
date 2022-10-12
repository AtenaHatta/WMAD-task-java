package inheritance.child;
import inheritance.parent.Animal;

public class Fish extends Animal{
  public class Fish{
    private String skill;
    private String features;
  }

  public Fish(){
    this.skill= "Live in water";
    this.features = "Has gills";
   }

   public Fish(String skill,String features){
    this.skill = skill;
    this.features = features;
   }


   public String getSkillType() {
    return skill;
   }

   public String getFeatures() {
    return features;
   } 
}