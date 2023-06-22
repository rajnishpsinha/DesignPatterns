package mvcDesignPattern;

public class UniversityMainMethod {
	public static UniversityModel populateView(){
		UniversityModel model= new UniversityModel("Mewar University","Chittor");
		return model;
	}
	
	public static void main(String[]args){
		
		UniversityView view=  new UniversityView();
		UniversityController controller= new UniversityController(populateView(), view);
		controller.updateView();	
	}

}
