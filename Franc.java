package AulaPratica;
import junit.framework.*;


class Franc extends TestCase{   
   private int amount;					
   Franc(int amount) {      
      this.amount= amount;
    }					
   Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
   }						
    public boolean equals(Object object) {					
       Franc franc = (Franc) object;      
       return amount == franc.amount;					
     }
    public void testMultiplication() {
      Money five = Money.dollar(5);
     assertEquals(Money.dollar(10), five.times(2));
     assertEquals(Money.dollar(15), five.times(3));
   }    

}
