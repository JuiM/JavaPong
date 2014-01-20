//try and make some cheats - add additional balls, maybe more paddles, etc.

public class pong {
	static Ball ball;
	static Paddle p1;
	static Paddle p2;
	static Player player1;
	static Player player2;
	
	
	public static void main(String[]args){
		ball =new Ball(400,250);
		player1 = new Player(1);
		player2 = new Player(2);
		
		p1 = new Paddle(player1, ball);
		p2 = new Paddle(player2, ball);
		
		Zen.create(800,500);
		ball.setVelocity(9, Math.random()*10 -9);
		while(true){
			draw();
			ball.move();
			//check if the ball is out of bounds
			p1.move();
			p2.move();
			Zen.flipBuffer();
			Zen.sleep(33);
		}
	}
	
	public static void draw(){
		//draw the background
		Zen.setColor(107,66,242);
		Zen.fillRect(0,0,800,500);
		//create a line down the middle
		Zen.setColor(255,255,255);
		Zen.fillRect(399, 0, 4, 500);
		
		Zen.setFont("Helvetica - 30");
		Zen.drawText(Integer.toString(player1.score), 350, 20);
		//draw the ball
		ball.draw();
		p1.draw();
		p2.draw();

	}
}
