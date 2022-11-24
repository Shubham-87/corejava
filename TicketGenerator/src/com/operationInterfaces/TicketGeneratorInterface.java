package com.operationInterfaces;

import java.util.logging.Logger;

import com.exceptionClasses.InvalidArgumentsValueException;

@FunctionalInterface
public interface TicketGeneratorInterface {
public int[][] generateTicket(int row,int column) throws InvalidArgumentsValueException;


public static void printTicket(int[][] ticket,int row ,int column) {
	  Logger.getLogger(TicketGeneratorInterface.class.getName()).info("Ouput :");
	  for (int i = 0; i < row; i++) {
		 for(int j=0;j<column;j++) {
			 System.out.print(ticket[i][j]+"\t");
		 }
		 System.out.print("\n");
	}
}


}
