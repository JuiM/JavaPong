


public class Paddle {
	double x;
	double y;
	Player me;
	Ball b;

	public Paddle(Player p, Ball b){
		// NEED to put this because named both x, need to differentiate
		me = p;
		this.b = b;
		this.x = p.x;
		this.y = p.y;
	}

	public void setPosition(double newx, double newy){
		x = newx;
		y = newy;
	}



	public void draw(){
		//create different color for each player

		Zen.setColor(me.red,me.green,me.blue);
		Zen.fillRect((int)x-3,(int) y-50, 6, 100);
	}

	public void move() {
		if(Zen.isKeyPressed(me.up) && y>=0){
			y = y - 9;
		}

		if(Zen.isKeyPressed(me.down)&& y<=500){
			y = y + 9;
		}
		//if I'm touching a ball, tell it to move horizontally
		if( Math.abs(x-b.x) <= 7 && Math.abs(y-b.y) <=50) {
			b.bounceHorizontally();
			b.xv = b.xv *1.1;
			b.move();
			b.yv += (b.y - y)/10;
		}
	}
}
