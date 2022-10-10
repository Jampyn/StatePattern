
public class SoldOutState implements State {
	
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out ");
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
		// TODO Auto-generated method stub

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
		// TODO Auto-generated method stub

	}

}
