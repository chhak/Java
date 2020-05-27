package sub4;


public class Calc {

	// ½Ì±ÛÅæ(Á¤Àû) °´Ã¼
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	public int div(int x, int y) {
		int z = x / y;
		return z;
	}
}
