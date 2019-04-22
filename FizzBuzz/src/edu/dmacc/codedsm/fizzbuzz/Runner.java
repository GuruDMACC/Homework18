package edu.dmacc.codedsm.fizzbuzz;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter User Name");
		String userName = in.next();
		
		System.out.println("Enter Number");
		int inputNumber = in.nextInt();
		
		MapRepository  repo = new FizzBuzzMapRepository();
		FizzBuzzService service = new FizzBuzzServiceImpl(repo);
		SubmissionController control = new SubmissionControllerImpl(service);
		
		Inputview view = control.submit(userName, inputNumber);
		view.render();
		 
		
		};
		 

	}


