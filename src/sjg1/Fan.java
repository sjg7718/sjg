package sjg1;

public class Fan {
	private int speed;
	private boolean on=true;
	private int r;
	public Fan(){
		
	}
	public Fan(int speed,boolean on,int r){
		this.speed=speed;
		this.on=on;
		this.r=r;
	}
	
	public String control(int speed,boolean on,int r){
		String stue="";
		if(on){
			if(speed>=4){
				stue="����������";
						
			}else if(speed>=2){
				stue="����������";
			}else{
				stue="����������";
			}
		}else{
			stue="�����Ѿ��ر�";
		}
		return stue;
	  }

}
