package ch03_calc_01;

public class CalAssembler {
	
	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;
	
	public CalAssembler(MyCalculator calculator, CalAdd calAdd, CalSub calSub, CalMul calMul, CalDiv calDiv) {
		this.calculator = calculator;
		this.calAdd = calAdd;
		this.calSub = calSub;
		this.calMul = calMul;
		this.calDiv = calDiv;
	}
	
	public void assembler() {
		calculator.calculate(10,5,calAdd);
		calculator.calculate(10,5,calSub);
		calculator.calculate(10,5,calMul);
		calculator.calculate(10,5,calDiv);
	}
}
