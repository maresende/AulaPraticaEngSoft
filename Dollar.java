package AulaPratica;
import junit.framework.*;



public class Dollar extends TestCase{
   int amount;
   Dollar(int amount) {
      this.amount= amount;
   }
    Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
   }

public void testMultiplication() {
   Money five = Money.dollar(5);
   assertEquals(Money.dollar(10), five.times(2));
   assertEquals(Money.dollar(15), five.times(3));
}
 
   public void testEquality() {
   	assertTrue(new Dollar(5).equals(new Dollar(5)));
   	assertFalse(new Dollar(5).equals(new Dollar(6)));
}


