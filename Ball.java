
public class Ball {

	double x;
	double y;
	double xv;
	double yv;

	public Ball(int newx, int newy){
		//integers can go to doubles, but not the other way
		x = newx;
		y=newy;
	}
	
	
	public void setPosition(double newx,double newy){
		x = newx;
		y= newy;
	}
	
	public void setVelocity(double newx, double newy){
		xv = newx;
		yv = newy;
	}
	
	public void bounceHorizontally(){
		xv = -1 * xv;
		move();
	}
	
	public void bounceVertically(){
		yv = -1 * yv;
	}
	
	public void move(){
		//will have to convert it into an integer for Zen.java - the x and y place
		x = x + xv;
		if(x+5>=800 || x-5 <= 0 ){
			this.bounceHorizontally();
		}
		if(y+5>=500 || y-5 <= 0 ){
			this.bounceVertically();
		}
		y = y + yv;
	}
	                                                                                                                                                   
	public void draw(){
		Zen.setColor(0,200,0);
		//loses the precision, because converting x first to an integer
		Zen.fillOval((int) x-5,(int) y-5 ,20,20);
	}
	
}
