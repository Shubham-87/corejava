package com.exceptionClasses;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InvalidArgumentsValueException extends Exception {

private static final long serialVersionUID = 1L;
private String msg; 
public InvalidArgumentsValueException(String msg) {
	this.msg=msg;
	Logger.getLogger(InvalidArgumentsValueException.class.getName()).log(Level.SEVERE,this.msg);
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}

}
