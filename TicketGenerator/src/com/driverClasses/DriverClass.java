package com.driverClasses;
import java.util.Scanner;
import java.util.logging.Logger;
import com.exceptionClasses.InvalidArgumentsValueException;
import com.operationClasses.TicketGenerator;
import com.operationInterfaces.TicketGeneratorInterface;

public class DriverClass {
private static Logger logger=Logger.getLogger(DriverClass.class.getName());
private static Scanner scanner;
	public static void main(String[] args) throws InvalidArgumentsValueException {
		  scanner = new Scanner(System.in);
		  
		  //logger.info("Enter number of Rows");
		  int row=3;//scanner.nextInt();
		  
		  //logger.info("Enter number of Columns");
		  int column=9;//scanner.nextInt();
		  
		  logger.info("Enter Your Number");
		  int myNum=scanner.nextInt();
		  
		  
		  TicketGeneratorInterface.printTicket(new TicketGenerator().generateTicket(row, column), row, column);
	}

}
