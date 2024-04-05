package object;

public class quiz_coffe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Costumer costumer = new Costumer("kim", 1500);
		Cafe cafe = new Cafe("별다방");
		

		costumer.showInfo(cafe);
		costumer.takeCoffe(cafe.cherryCoke, cafe);
		costumer.showInfo(cafe);
		cafe.showInfo();
		

	}

}
class Costumer {
	private String name;
	private int money;
	private String menu;
	
	
	
	public Costumer(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	public void takeCoffe(Coffee coffee, Cafe cafe) {
		if ( this.money < coffee.getPrice() ) {
			System.out.println("소지금이 부족하여 커피를 구매하실 수 없습니다 . . .");
			return;
		} else {
			this.money -=coffee.getPrice();
			this.menu = coffee.getCoffeName();
			cafe.sell(coffee.getPrice());
		}
	}
	
	public void showInfo(Cafe cafe) {
		System.out.println( name + "님은 "+ cafe.getCafeName() +"에서 "+ menu+"를 구입하셨고, 남은 소지금은 "+money+"입니다.");
	}
	
}
class Cafe {
	private int money;
	private int visitor;
	private String cafeName;

	Coffee americano = new Coffee("아메리카노",4000);
	Coffee latte = new Coffee("라떼",4500);
	Coffee lemonAde = new Coffee("레몬에이드",3000);
	Coffee cherryCoke = new Coffee("체리콕",3000);
	
	public Cafe(String cafeName) {
		super();
		this.cafeName = cafeName;
	}
	
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getVisitor() {
		return visitor;
	}
	public void setVisitor(int visitor) {
		this.visitor = visitor;
	}
	
	public void sell(int money) {
		this.money += money;
		this.visitor++;
	}
	
	public void showInfo() {
		System.out.println("손님수는 "+this.visitor+"명이고, 판매금액은 "+this.money+"입니다.");
		
	}
	
}

class Coffee {
	private String coffeName;
	private int price;
	
	public Coffee(String coffeName, int price) {
		super();
		this.coffeName = coffeName;
		this.price = price;
	}

	public void status() {
		System.out.println("ⅽ[ː̠̈ː̠̈ː̠̈] ͌");
	}

	public String getCoffeName() {
		return coffeName;
	}
	public void setCoffeName(String coffeName) {
		this.coffeName = coffeName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	
	
}
