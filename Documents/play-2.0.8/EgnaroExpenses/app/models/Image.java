package models;

import java.io.File;

import com.google.code.morphia.annotations.Entity;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

@Entity
public class Image {
	
	public  void saveImage(String BPhotopath) throws Exception  {
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
		
		
		}

}
