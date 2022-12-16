package com.driverClasses;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.constants.Constants;
import com.exceptionClasses.InvalidArgumentsValueException;
import com.model.User;
import com.operationClasses.TicketGenerator;
import com.utility.ShutDownHook;
import com.utility.Utility;


public class DriverClass {

	private static Logger logger=Logger.getLogger(DriverClass.class.getName());
	
	public static void main(String[] args) throws InvalidArgumentsValueException, IOException, InterruptedException {
		 //Adding Shutdownhook for accidental exit
		 Runtime runtime=Runtime.getRuntime();
		 runtime.addShutdownHook(new ShutDownHook());

		  BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in)); 
		  
		  logger.info("Welcome to Juva.");
		  
		  User user=Utility.createNewUser();
		  
		  logger.info("Want to Play?(Y/N)");
		  
		  String playFlag=bufferedReader.readLine();
		  while(playFlag.equalsIgnoreCase("Y")) {
			 
			  	  logger.info("Enter Your Numbers");
				  user.addInput();
			if (user.getAccountBalace()>=(Constants.WEIGHTAGE*user.getInputs().size())) {
						
				  logger.info("Ticket Amt="+user.getTicketAmount());
				  //int myNum=scanner.nextInt();
				  int ticket[][]=TicketGenerator.generateTicket(Constants.ROWS, Constants.COLUMN);
				  TicketGenerator.printTicket(ticket, Constants.ROWS, Constants.COLUMN);
				  Map<Integer, List<Integer>> matchedInputs=Utility.checkInputMatch(ticket, user.getInputs());
				  user.calculateWinning(matchedInputs);
				  System.out.println("Play again? (Y/N)");
				  playFlag=bufferedReader.readLine();
		
			  }else {
				  logger.info("Dear "+user.getName()+"! You don't have sufficient coins to play. Please add coins into your account.");
			  }
	    }
		  
		  
		  
		  System.out.println("Thanks!");
		  
	}

}
