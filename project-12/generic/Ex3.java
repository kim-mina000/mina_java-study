package generic;

public class Ex3 {

	public static void main(String[] args) {
		
		// 파우더를 사용하는 프린터기 생성
		ThreeDPrinter4<Powder> printer1 = new ThreeDPrinter4<>();
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial();
		powder.doPrinting();
		
		// 플라스틱을 사용하는 프린터기 생성
		ThreeDPrinter4<Plastic> printer2 = new ThreeDPrinter4<>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();

		
		
	}

}

class ThreeDPrinter4<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		
		return material;
	}
}
