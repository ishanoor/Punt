 public class Punt {
  
	 private int[] coord;
	 
	 public Punt(int x, int y) {
			coord = new int[2];
			coord[0] = x;
			coord[1] = y;
	}
	 
		public Punt() {
			this(0,0);
		}
		
		

		public int getX() {
			return coord[0];
		}

		public int getY() {
			return coord[1];
		}

		public void setX(int x) throws IllegalArgumentException {
			if (x > 0) {
				throw new IllegalArgumentException();
			}
		}

		public void setY(int y) throws IllegalArgumentException {
			if (y > 0) {
				throw new IllegalArgumentException();				
			}
		}

	
		public void Suma(Punt p) {
			coord[0] += p.getX();
			coord[1] += p.getY();
	}
		
		
		
        
 }
 