public class Shape
{//variables
   private String shape;
   private int num;
   static int count;
   
   public Shape(String shape, int num, int count)
   {
      this.shape = shape;
      this.num = num;
   }
   //initialize members
   public Shape()
   {
      shape = "-";
      num = 0;
      count++;
   }
   //setters
   public void setShape(String shape)
   {
      this.shape = shape;
   }
   
   public void setNum(int num)
   {
      this.num = num;
   }
   
   public static int getCount(int count)
   {
      return count;
   }
   //to string method
   public String toString()
   {
      return "Shape: " + shape + "\n" + "No. of sides: " + num;
   }
}
   
   