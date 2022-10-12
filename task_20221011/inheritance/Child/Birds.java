package inheritance.child;
import inheritance.parent.Animal;

public class Birds extends Animal{
  public class Birds{
    private String feathers;
    private String pros;
  }

  public Birds(){
    this.feathers = "Animal with feathers";
    this.pros = "Can fly";
   }

   public Birds(String feathers,String pros){
    this.feathers = feathers;
    this.pros = pros;
   }

   public String getFeathers() {
    return feathers;
   }

   public String getPros() {
    return pros;
   } 
}