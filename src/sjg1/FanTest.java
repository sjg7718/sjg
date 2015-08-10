package sjg1;

public class FanTest {
	public  static void main(String[] args){
		Fan fan=new Fan();
		String stus=fan.control(3, true,1);
		System.out.println(stus);
		String stus1=fan.control(1, true,3);
		System.out.println(stus1);
		String stus2=fan.control(5, true,3);
		System.out.println(stus2);
		
	}

}
