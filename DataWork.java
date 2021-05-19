/*******************
Name:Brendan McCullagh
Date:14 April
Week 2
Notes Tacos are yummy

*******************/
public class DataWork
{

   String food = "tacos";  //1 create 4 variables of different data types
   int numberTacos = 5;  
   double pantSize = 34;
   boolean guac = true;
   

public void compare()
{
   if (food == "tacos")
   {
      System.out.println ("lets eat tacos!!");
      }
      
   if (food != "tacos")
   {
      System.out.println ("why not eat tacos?");
      }
      
   if (numberTacos > 5)
   {
      System.out.println ("slow down on the tacos!");
      }
      
   if (pantSize < 34)
   {
      System.out.println ("keep eating homie");
      }
      
   if (guac = true)
   {
      System.out.println ("of course I want guac!");
      }
}

public static void main (String args [])
{
DataWork dw = new DataWork();
dw.compare();
}
}