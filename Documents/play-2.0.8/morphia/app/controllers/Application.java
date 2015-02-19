package controllers;

import java.io.IOException;

import models.Customer;
import models.User;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
  
  public static Result index() throws IOException {
	  Customer ctr=new Customer();
	  User use=new User();
	  use.saveImageIntoMongoDB();
	  
	  
	  
    return ok(index.render("Your new application is ready."));
  }
  
}