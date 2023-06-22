package mvcDesignPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class UniversityController {
	private UniversityModel  model;
	private UniversityView view;
	
public void updateView(){
	view.displayUniversityInfo(model.getName(), model.getAddress());
}
}
