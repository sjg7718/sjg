package sjg1;

public class RectangleText {
	public double length=1;
	public double width=1;
	public void setLength(){
		this.length=length;	
	}
	public double getLength(String length){
		return this.length;
	}
	public void setWidth(){
		this.width=width;	
	}
	public double getWidth(String width){
		return this.width;
   }
	public double perimeter{	
		System.out.println("周长是:"+(2*length+2*width));
		
	}
	public void area{
		System.out.println("面积是:"+length*width);
	}
}