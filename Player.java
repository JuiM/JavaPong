
public class Player {
	char up;
	char down;

	int red;
	int green;
	int blue;

	int x;
	int y;

	int score = 0;

	public Player(int number){
		if(number ==1){
			x = 25;
			y = 250;
			up = 'q';
			down = 'a';
			red = 255;
			green = 0;
			blue = 0;
		}
		else {
			x = 775;
			y = 250;
			up = 'o';
			down = 'l';
			red = 0;
			green = 0;
			blue = 0;
		}

	}

}
