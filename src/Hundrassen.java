public enum Hundrassen {
    DACKEL("Dackel",0.5),
    COLLIE("Collie",1.0),
    DOGGE("Dogge",1.5);

   private double maxGroesse;
   private String hundName;

   Hundrassen(String hundName, double maxGroesse){
       this.maxGroesse=maxGroesse;
       this.hundName=hundName;
   }
   public double getMaxGroesse(){
       return maxGroesse;
   }
   public String getHundName(){
       return hundName;
   }
   @Override
    public String toString(){

       return this.name().substring(0,1).toUpperCase() + this.name().substring(1).toLowerCase() + ", max. Größe: "+ this.maxGroesse ;
   }
}
