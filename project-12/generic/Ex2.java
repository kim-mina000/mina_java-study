package generic;

public class Ex2 {
	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder();
		
		printer.setMaterial(p1); // 매개변수가 자동으로 형변환됨
		
		// 재료를 꺼낼 때는 직접 형변환을 해야함
		Powder p2 = (Powder)printer.getMaterial();
		
		p2.doPrinting();
		
	}

}

class ThreeDPrinter3 {
	private Object material;
	
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		
		return material;
	}
}