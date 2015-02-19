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
	
}