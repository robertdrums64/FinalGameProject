public class MyMain {

	public static void main(String[] args) {

		// TASK 1: CREATE A CANVAS FOR ANIMATION
		Canvas canvas = new Canvas();
		canvas.requestFocus();
		
		//TASK 2:  ADD USER GAME OBJECTS
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
		
		//TASK 3: CREATE GAME OBJECT B THAT IMPLEMENTED AN ADAPTER
		Type_B_GameObject userB = new Type_B_GameObject(300, 300);
		userB.setVelocity(10);
		canvas.addKeyListener(userB);
		canvas.addGameObject(userB);
		
		

	}
	
	//Submitting to GitHub.
	
}