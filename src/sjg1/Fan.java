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
				stue="高速运行中";
						
			}else if(speed>=2){
				stue="中速运行中";
			}else{
				stue="低速运行中";
			}
		}else{
			stue="风扇已经关闭";
		}
		return stue;
	  }

}
