public class Main{
   public static void singRootBeerSong(int numOfBottles, int bottlesTaken){
   
   String bottlesTook="";
   String amount ="";
   if (bottlesTaken>1)
   amount="them";
   else
   amount="it";
   if (bottlesTaken==1)
      bottlesTook="one";
   if (bottlesTaken==2)
      bottlesTook="two";
   if (bottlesTaken==3)
      bottlesTook="three";
   if (bottlesTaken==4)
      bottlesTook="four";
   if (bottlesTaken==5)
      bottlesTook="five";
   if (bottlesTaken==6)
      bottlesTook="six";
   if (bottlesTaken==7)
      bottlesTook="seven";
   if (bottlesTaken==8)
      bottlesTook="eight";
   if (bottlesTaken==9)
      bottlesTook="nine";
   if (bottlesTaken==10)
      bottlesTook="ten";
   while (numOfBottles > 0){
      System.out.println(numOfBottles+" bottles of root beer on the wall");
      System.out.println(numOfBottles+" bottles of root beer");
      System.out.println("Take "+bottlesTook+" down, pass "+amount+" around");
      numOfBottles-=bottlesTaken;
      System.out.println(numOfBottles+" bottles of root beer on the wall");
      }
      
   }
   public static void main(String[]args){
      singRootBeerSong(10,1);
   }
}