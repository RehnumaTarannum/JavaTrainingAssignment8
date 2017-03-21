/**
 * 
 */
package pacMVC;

/**
 * @author rehnumatarannum
 * 
 * This is the Controller class incharge of the integration
 * and delegation of request from user retrival of data from model
 * etc.
 *
 */
public class TraineeController {
	
	private Trainee model;
	   private TraineeView view;

	   public TraineeController(Trainee model, TraineeView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setTraineeName(String name){
	      model.setName(name);		
	   }

	   public String getTraineeName(){
	      return model.getName();		
	   }

	   public void setTraineeEmail(String email){
	      model.setEmail(email);		
	   }

	   public String getTraineeEmail(){
	      return model.getEmail();		
	   }

	   public void updateView(){				
	      view.printTraineeDetails(model.getName(), model.getEmail());
	   }

}
