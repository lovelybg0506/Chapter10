package part01.sec01.exam06;

class AA{
	int i;
	int j;
//	private int j;
	
	void setij(int x, int y) {
		this.i=x;
		this.j=y;
	}
	
}

class BB extends AA{
	int total;
	
	void sum() {
		setij(10,20);
		total = i+j;
		System.out.println(total);
	}
}
	

public class InheritanceTest_05 {

	public static void main(String[] args) {
		BB subOb = new BB();
		subOb.sum();
		
		
	}

}
