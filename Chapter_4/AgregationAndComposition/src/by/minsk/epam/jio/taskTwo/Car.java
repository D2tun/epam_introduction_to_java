package by.minsk.epam.jio.taskTwo;

public class Car {

	private Wheels w = new Wheels();
	private Engine e = new Engine();
	private String brand;
	private boolean fueled = true;
	private int crashedCarPart = 0;

	public Car(String brand) {
		this.brand = brand;
	}

	public void drive() {
		int crashChance;
		if (!this.w.getForwardLeftWheelState() 
				& !this.w.getForwardRightWheelState() 
				& !this.w.getBackwardLeftWheelState() 
				& !this.w.getBackwardRightWheelState() 
				& !this.e.getEngineState()
				& this.fueled) {
			crashChance = (int) StrictMath.round(StrictMath.random() * 100) + 1;
			if (crashChance == 15) {
				this.crashedCarPart = (int) StrictMath.round(StrictMath.random()
									   * 5) + 1;
				switch (this.crashedCarPart) {
				case 1: 
					this.w.changeForwardLeftWheelState(true);
					System.out.println("Поломка переднего левого колеса.");
					break;
				
				case 2: 
					this.w.changeForwardRightWheelState(true);
					System.out.println("Поломка переднего правого колеса.");
					break;
				
				case 3: 
					this.w.changeBackwardRightWheelState(true);
					System.out.println("Поломка заднего правого колеса.");
					break;
				
				case 4: 
					this.w.changeBackwardLeftWheelState(true);
					System.out.println("Поломка заднего левого колеса.");
					break;
				
				case 5: 
					this.e.changeEngineState(true);
					System.out.println("Поломка двигателя.");
					break;
				}
			} else {
				System.out.println("Поездка окончена успешно.");
			}
			this.fueled = false;
		} else if (this.fueled == false) {
			System.out.println("Требуется заправка.");
		} else {
			System.out.println("Требуется устранить поломку.");
		}	
	}

	public void fuelTheCar() {
		if (this.fueled == false) {
			this.fueled = true;
			System.out.println("Машина заправлена.");
		} else {
			System.out.println("Машина не нуждатся в заправке.");
		}
	}

	public void fixTheCar() {
		switch (this.crashedCarPart) {
		case 1: 
			this.w.changeForwardLeftWheelState(false);
			System.out.println("Переднее левое колесо заменено.");
			break;
		
		case 2: 
			this.w.changeForwardRightWheelState(false);
			System.out.println("Переднее правое колесо заменено.");
			break;
		
		case 3: 
			this.w.changeBackwardRightWheelState(false);
			System.out.println("Заднее правое колесо заменено.");
			break;
		
		case 4: 
			this.w.changeBackwardLeftWheelState(false);
			System.out.println("Заднее левое колесо заменено.");
			break;
		
		case 5: 
			this.e.changeEngineState(false);
			System.out.println("Двигатель заменён.");
			break;
		
		default: 
			System.out.println("Машина не нуждается в ремонте.");
			break;
		}
	}
	
	public void showCarBrand() {
		System.out.println("Машина марки " + this.brand);
	}
}
