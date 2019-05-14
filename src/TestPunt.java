import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static

public class TestPunt {  
	 @Test
    public void TsetX() {
    	 Punt pX = new Punt();
    	 pX.setX(3);
    	 assertEquals(3, pX.getX());
   	 
    }
	 @Test
    public void TsetY() {
    	Punt pY = new Punt();
    	pY.setY(4);
    	 assertEquals(4, pY.getY());
   	 
    }
	 @Test
	 public void testSuma() {
		 Punt p = new Punt(3, 4);
	     assertEquals(3, p.getX());
	     assertEquals(4, p.getY());
	 }
	 

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}
