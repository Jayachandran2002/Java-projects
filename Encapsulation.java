package exercisePackage;

class Book{
	private int pages;
	
	public void setData(int x) {
		if(x > 0) {
			pages= x;
		}
	}
	int getData() {
		return pages;
	}
}


public class Encapsulation {
	public static void main(String[] args) {
		Book b = new Book();
		b.setData(3);
		
		System.out.println(b.getData());
	}
}
