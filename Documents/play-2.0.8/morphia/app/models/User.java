package models;

import java.io.File;
import java.io.IOException;

import com.google.code.morphia.annotations.Entity;
import com.mongodb.DB;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

import play.db.ebean.Model;
//import play.modules.morphia.Blob;
//import play.modules.morphia.MorphiaPlugin;
@Entity
public class User extends Model {
    public String firstName;
    public String lastName;
    public String photo;
    /*public void setPhoto(File file) {
    	
        String type = "image/" + S.fileExtension(file.getName());
        photo = new Blob(file, type);
        save();
    }*/
    public static void saveImageIntoMongoDB() throws IOException {
        DB db =null ;
    	String dbFileName = "DemoImage";
        File imageFile = new File("/home/egnarodev/Desktop/images.jpg");
        GridFS gfsPhoto = new GridFS(db, "photo");
        GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
        gfsFile.setFilename(dbFileName);
        gfsFile.save();
    }
}