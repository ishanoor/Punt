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
    

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}
