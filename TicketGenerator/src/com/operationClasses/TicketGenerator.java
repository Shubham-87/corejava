package com.operationClasses;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;

import com.exceptionClasses.InvalidArgumentsValueException;
import com.operationInterfaces.TicketGeneratorInterface;

public class TicketGenerator implements TicketGeneratorInterface {

@Override
public int[][] generateTicket(int row, int column) throws InvalidArgumentsValueException {
	if((row>3||row<3)||(column>9||column<9)) {
		throw new InvalidArgumentsValueException("Entered "+row+" Rows and "+column+" Columns. Expected 3 Rows and 9 Columns");
		
	}
	 int[][] tickit = new int[row][column];
	 int numberOfElementsWritten=0;
	 Map<Integer,Integer> rowMap=new HashMap<Integer, Integer>();
	 Map<Integer,Integer> columnMap=new HashMap<Integer, Integer>();
	 Map<Integer, Integer> elementsInTickit=new HashMap<>();
	 boolean b=true;
	
	 while (b) {
		
		int rowIndex=new Random().nextInt(row);
		int columnIndex=new Random().nextInt(column);
		int noOfElementsInRow=0;
		int noOfElemenentsInColumn=0;
		try {
			noOfElementsInRow=rowMap.get(rowIndex);
		}catch (NullPointerException e) {
			rowMap.put(rowIndex, 0);
			continue;
		}
		try {
		     noOfElemenentsInColumn=columnMap.get(columnIndex);
		}catch (NullPointerException e) {
			columnMap.put(columnIndex, 0);
			continue;
		}
		
			if((noOfElementsInRow<=4)&&(noOfElemenentsInColumn<=1&&tickit[rowIndex][columnIndex]==0)) {
				//tickit[rowIndex][columnIndex]=generateRandomNumber(columnIndex*10+1, columnIndex*10+10);
				int randomNo=generateRandomNumber(columnIndex*10+1, columnIndex*10+10);
				while(elementsInTickit.containsKey(randomNo)) {
					randomNo=generateRandomNumber(columnIndex*10+1, columnIndex*10+10);
				}
				tickit[rowIndex][columnIndex]= randomNo;         //columnIndex*10+1+rowIndex;
				elementsInTickit.put(randomNo, randomNo);
				rowMap.put(rowIndex,rowMap.get(rowIndex).intValue()+1);
				columnMap.put(columnIndex, columnMap.get(columnIndex).intValue()+1);
				numberOfElementsWritten=numberOfElementsWritten+1;
			  b=numberOfElementsWritten==15?false:true;
			}
		}
	//System.out.println(numberOfElementsWritten+"\n"+rowMap+"\n"+columnMap);
	return tickit;
}
 public static int generateRandomNumber(int max ,int min) {
	   return (int) (Math.random() * (max - min + 1) + min);
   }
  

}