class Exp17_2 {
	
	public static void main(String[] args) {
		
		int d = 0;
		int d1 = 3;
		int d2 = 2;
		int p1 = 5;
		int p2 = 3;
		d = p1 + p2;
		d = d - ((d1+d2) / 2);
		if( d < 0 ){
			d = 0;
		}
	}
}