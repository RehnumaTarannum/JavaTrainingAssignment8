/**
 * 
 */
package pacMVC;

/**
 * @author rehnumatarannum
 * This class initiates the whole program creates MODEL, VIEW, CONTROLLER 
 * objects and basically gets things going !
 */
public class PatternDemo {

	/**
	 * @param args
	 * Below we will be creating the respective MVC hierchy class objects
	 */
	public static void main(String[] args) {
		//fetch Trainee record based on his email from the database
	      Trainee model  = retrieveTrainee();

	      //Create a view : to write trainee details on console
	      TraineeView view = new TraineeView();

	      TraineeController controller = new TraineeController(model, view);

	      controller.updateView();

	      //update model data
	      controller.setTraineeName("John");
	      controller.setTraineeEmail("johnDoe@gmail.com");
	      controller.updateView();

	}
	
	private static Trainee retrieveTrainee(){
	      Trainee stu = new Trainee();
	      stu.setName("Robert");
	      stu.setEmail("rbrown@gmail.com");
	      return stu;
	   }

}
