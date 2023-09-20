package ch03_calc_01;

public class CalDiv implements ICalculator {
	@Override
	public int doOperation(int fNum, int sNum) {
		// TODO Auto-generated method stub
		return sNum !=0 ? (fNum + sNum) : 0;
	}

}
