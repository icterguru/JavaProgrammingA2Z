package chapter11;
/**
 * @author HossaiM
 * <br>
 * Source: http://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */

abstract class IGame {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();

	// This is the template method
	final void play(){
		initialize();  //initializes the game
		startPlay();  //starts game
		endPlay(); //ends game
	} // End of the template method
}

class Cricket extends IGame {

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}
}

class BaseBall extends IGame {

	@Override
	void endPlay() {
		System.out.println("BaseBall Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("BaseBall Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("BaseBall Game Started. Enjoy the game!");
	}
}
class FootBall extends IGame {

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}
}

public class TemplateMethodPatternEx1Main {

	public static void main(String[] args) {
		IGame game = new Cricket();
		game.play();
		System.out.println();
		game = new FootBall();
		game.play();
		game = new BaseBall();
		game.play();
	}

}
