package il.ac.tau.cs.software1.pacman;



public abstract class PacmanBonus extends PacmanGameObject {

	protected int bonusScore = 0;
	
	public PacmanBonus(PacmanGridComponent initialPosition) {
		super(initialPosition);
	}
}
