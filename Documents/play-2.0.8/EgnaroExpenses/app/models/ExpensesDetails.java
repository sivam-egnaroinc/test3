package models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;


@ Entity
public class ExpensesDetails {
	@Id
	Object id;
	String BNO;
	String BName;
	String BDate;
	String BAmt;
	
	String BPhotopath;

	public String getBNO() {
		return BNO;
	}

	public void setBNO(String bNO) {
		BNO = bNO;
	}

	public String getBName() {
		return BName;
	}

	public void setBName(String bName) {
		BName = bName;
	}

	public String getBDate() {
		return BDate;
	}

	public void setBDate(String bDate) {
		BDate = bDate;
	}

	public String getBAmt() {
		return BAmt;
	}

	public void setBAmt(String bAmt) {
		BAmt = bAmt;
	}

	public String getBPhotopath() {
		return BPhotopath;
	}

	public void setBPhotopath(String bPhotopath) {
		BPhotopath = bPhotopath;
	}
	/*public void save() throws UnknownHostException
	{
		  DBConnection.createConnection();
		  ExpensesDetails emp1=new ExpensesDetails();
		    DBObjects.datastore.save(emp1);

	}*/
	
	/*public  void saveImage(String BPhotopath) throws Exception  {
		//BasicDBObject doc = new BasicDBObject(Details.expensesDetailsPhotopath, BPhotopath);
		System.out.println("This save Image method"+BPhotopath);
		MongoClient mongo = new MongoClient("localhost", 27017);
		  DB db = mongo.getDB("Imagedb24");
		  String dbFileName = "Image";
		  System.out.println("This save Image method"+BPhotopath);
			    File imageFile = new File(BPhotopath);
			    GridFS gfsPhoto = new GridFS(db, "photo");
		 	    GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
			    gfsFile.setFilename(dbFileName);
			    gfsFile.save();
		
		
		}*/
}