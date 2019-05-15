import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TestSegment {
	
	@Test
	public void testSegment() {
		Punt p1 = new Punt(2, 4);
		Punt p2 = new Punt(4, 6);
		Segment seg = new Segment(p1, p2);
		long longitud = (long)seg.Longitud();
		assertEquals(2, longitud);
	}
		
	public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestSegmentJava");
    }
}