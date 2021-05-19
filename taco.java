interface Taco 
{
   public void test();
}

class TacoTuesday implements Taco 
{
   public void test()
      {
         System.out.println("Taco Tuesday Interface");
      }
      public static void main(String args[])
         {
               Taco t = new TacoTuesday();
               t.test();
         }
         
}