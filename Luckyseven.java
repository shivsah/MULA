import java.util.*;
public class Luckyseven
{
    
private int die1,die2, dollars, average, count, sum,roll;
Random generator = new Random();

  public Luckyseven()
    {
  die1=0;
  die2=0;
  dollars=0;
  average=0;
  sum=0;
  roll = 0;
}
 public Luckyseven(int maxDollars){
  maxDollars=dollars;
}
public void setDollars(int d){
  dollars +=d;
}

public int getDollars(){
 return dollars;
}

public void roll(){
 for (roll =1; roll <=100; roll++){ 
 	die1=generator.nextInt(6) + 1;
 	die2=generator.nextInt(6)+1;
	 }
 while(dollars > 0){
 count ++;
 sum = die1 + die2;
 System.out.println ("amount" + sum);
 if (sum ==7)
  dollars +=4;
 else 
  dollars -=1;
 

}
}
public int getSeven(){
  return sum;
}


public int getAverage(){
  average = sum/100;
  return average;
}

public String toString()
	{
		String str;
		str = "Money " + dollars + "\n" + "sum" + sum + "\n" + "avg" + average ;
		
		return str;
	}




}


