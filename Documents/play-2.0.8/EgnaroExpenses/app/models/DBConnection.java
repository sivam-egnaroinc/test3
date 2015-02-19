package models;
import java.net.UnknownHostException;

import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

public class DBConnection {

	 public static void createConnection() throws UnknownHostException{
			
		  DBObjects.mongo = new Mongo("127.0.0.1",27017);
		  DBObjects.morphia = new Morphia();
		  DBObjects.datastore = DBObjects.morphia.createDatastore(DBObjects.mongo,"EgnaroMorphia");
	  }
}
