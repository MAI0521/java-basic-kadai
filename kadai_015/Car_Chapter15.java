package kadai.kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void gearChange(int afterGear) {
		System.out.println("ギア" + gear + "から" + afterGear + "に変更しました");
		gear = afterGear;
	}
	
	public void run() {
		speed = switch(gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
		System.out.println("速度は時速" + speed + "kmです");
	}
}
