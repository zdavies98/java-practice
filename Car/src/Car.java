public class Car
{//3 private members
   private String make;
   private String model;
   private int year;
   
   public Car(String make, String model, int year)
   {
      this.make = make;
      this.model = model;
      this.year = year;
   }
   //Initialize the members
   public Car()
   {
      make = "--";
      model = "--";
      year = 0;
   }
   //Getters and Setters
   public String getMake()
   {
      return make;
   }
   
   public void setMake(String make)
   {
      this.make = make;
   }
   
   public String getModel()
   {
      return model;
   }
   
   public void setModel(String model)
   {
      this.model = model;
   }
   
   public int getYear()
   {
      return year;
   }
   
   public void setYear(int year)
   {
      this.year = year;
   }
   //toSttring method
   public String toString()
   {
      return year + "\t" + make + "\t" + model;
   }
}