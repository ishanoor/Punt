import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static

public class TestPunt {  	 
	 @Test
	 public void testSuma() {
		 Punt p = new Punt(3, 4);
	     assertEquals(3, p.getX());
	     assertEquals(4, p.getY());
	 }
	 
	  @Test(expected = IllegalArgumentException.class)
	    public void testX() {
	    	Punt p = new Punt(-8,2);
	    }
	    
	    @Test(expected = IllegalArgumentException.class)
	    public void testY() {
	    	Punt p = new Punt(1,-1);
	}
	 
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}
