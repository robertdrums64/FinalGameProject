public class MyMain {

	public static void main(String[] args) {

		// TASK 1: CREATE A CANVAS FOR ANIMATION
		Canvas canvas = new Canvas();
		canvas.requestFocus();
		
		//TASK 2:  ADD A USER GAME OBJECT
		Type_D_GameObject userD = new Type_D_GameObject(200, 200);
		userD.setVelocity(10);
		canvas.addKeyListener(userD);
		canvas.addGameObject(userD);
		
		Type_A_GameObject userA = new Type_A_GameObject(400, 400);
		userA.setVelocity(10);
		canvas.addKeyListener(userA);
		canvas.addGameObject(userA);
		
		Type_C_GameObject userC = new Type_C_GameObject(300, 300);
		userC.setVelocity(10);
		canvas.addKeyListener(userC);
		canvas.addGameObject(userC);

	}
	
	//Submitting to GitHub.
	
}