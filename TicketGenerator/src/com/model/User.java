package com.model;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.constants.Constants;
import com.operationClasses.TicketGenerator;
import com.utility.Utility;

public class User {

	private String name;
	private String pass;
	private List<Integer> inputs;
	private  int accountBalance=100;
	private  int gamesPlayed=0;
	private  int ticketAmount=0;
	private static Logger logger=Logger.getLogger(User.class.getName());
	
	public User(String name,String pass) {
	 this.name=name;
	 this.pass=pass;
	}
	
	public  void calculateWinning(Map<Integer, List<Integer>> matchedInputs) {
		++gamesPlayed;
		int winningPoints=0;
		if (!matchedInputs.isEmpty()) {
			
			for (Integer key : matchedInputs.keySet()) {
				
				List<Integer> matchedNos=matchedInputs.get(key);
				if(key!=3)
					winningPoints=winningPoints+(matchedNos.size()*(Constants.WINNING_MULTIPLE/key));
				else 
					winningPoints=winningPoints+(matchedNos.size()*Constants.WEIGHTAGE);
			}
			
		}
		
		accountBalance+=winningPoints;
		
		System.out.println("Points Won="+winningPoints);
		System.out.println("Account Balance="+accountBalance);
	}
	
	public  void addInput() throws IOException {
		this.inputs=Utility.addInput();
		ticketAmount=(inputs.size()*Constants.WEIGHTAGE);
		accountBalance=accountBalance-ticketAmount;
	}

	public String getName() {
		return name;
	}

	public List<Integer> getInputs() {
		return inputs;
	}

	public  int getAccountBalace() {
		return accountBalance;
	}

	public  int getGamesPlayed() {
		return gamesPlayed;
	}

	public  int getTicketAmount() {
		return ticketAmount;
	}
	
	
}
