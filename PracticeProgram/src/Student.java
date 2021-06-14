public class Student 
{
	private int rollno,math,phy,chem;
	private String name;
	
		
	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public int getMath() {
		return math;
	}



	public void setMath(int math) {
		this.math = math;
	}



	public int getPhy() {
		return phy;
	}



	public void setPhy(int phy) {
		this.phy = phy;
	}



	public int getChem() {
		return chem;
	}



	public void setChem(int chem) {
		this.chem = chem;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public void info()
	{
		System.out.println(rollno + " : "+name+" -> "+math+", "+phy+", "+chem);
	}
}


