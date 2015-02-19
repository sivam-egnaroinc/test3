package controllers;

import java.io.IOException;

import models.DBObjects;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import models.Image;
import models.ExpensesDetails;
import play.data.DynamicForm;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
  
  public static Result index()  throws JsonGenerationException, JsonMappingException, IOException {
	  // DBConnection.createConnection();
    return ok(index.render("Your new application is ready."));
  }
  public static Result insertRecord() throws Exception {
	  
	    DynamicForm bindedForm = form().bindFromRequest();
	    String billNo = bindedForm.get("billNo");
	    String billName = bindedForm.get("billName");
	    String billDate = bindedForm.get("billDate");
	    String billAmt = bindedForm.get("billAmt");
	    String Photopath=bindedForm.get("Photopath");
	    ExpensesDetails emp=new ExpensesDetails();
	    
	    emp.setBNO(billNo);
	    emp.setBName(billName);
	    emp.setBDate(billDate);
	    emp.setBAmt(billAmt);
	    emp.setBPhotopath(Photopath);
	 
	    DBObjects.datastore.save(emp);
	    Image img=new Image();
	    img.saveImage(Photopath);
	    return ok(); 
}

}