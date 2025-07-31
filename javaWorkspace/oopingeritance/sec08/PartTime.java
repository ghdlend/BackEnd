package oopingeritance.sec08;

public class PartTime extends Worker{
	private int hours;
	private int unitPrice;
	
	//파트타임 직원 한 명의 정보들(주민번호,이름,근무시간,시급)
	public PartTime(String joominNo,String name,int hours,int unitPrice) {
		super(joominNo,name);
		this.hours = hours;
		this.unitPrice = unitPrice;
	}
	
	public int calculatePay() {
		return hours * unitPrice;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\n시급 : " + unitPrice + "원" +
				"\n근무시간 : " + hours+ "시간"+
				"\n총 지불액 : "+calculatePay()+"원";
	}
}
