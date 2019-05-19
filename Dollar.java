package AulaPratica;
import junit.framework.*;



public class Dollar extends TestCase{
   int amount;
   Dollar(int amount) {
      this.amount= amount;
   }
   Dollar times(int multiplier) {
      amount= amount * multiplier;
      return this;
   }

   public void testMultiplication() {
   	Dollar five = new Dollar(5);
   	assertEquals(new Dollar(10), five.times(2));
  	assertEquals(new Dollar(15), five.times(3));
   }    
 
   public void testEquality() {
   	assertTrue(new Dollar(5).equals(new Dollar(5)));
   	assertFalse(new Dollar(5).equals(new Dollar(6)));
}


