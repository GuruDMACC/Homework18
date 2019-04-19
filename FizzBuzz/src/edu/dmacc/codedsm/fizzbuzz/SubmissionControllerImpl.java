package edu.dmacc.codedsm.fizzbuzz;

public class SubmissionControllerImpl implements SubmissionController {

	private FizzBuzzService service;

	public SubmissionControllerImpl(FizzBuzzService service) {

		this.service = service;
	}

	public void submit(String userName, int inputNumber) {

		Submission submission = new Submission();
		submission.setInputNumber(inputNumber);
		submission.setUserName(userName);
		
		service.performFizzBuzzLogic(submission);
	}

}
