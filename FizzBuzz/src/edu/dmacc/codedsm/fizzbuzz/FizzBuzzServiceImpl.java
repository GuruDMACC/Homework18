package edu.dmacc.codedsm.fizzbuzz;

public class FizzBuzzServiceImpl implements FizzBuzzService {

private MapRepository repo; 
	
	public FizzBuzzServiceImpl(MapRepository repo) {
		 this.repo = repo;
		 
	}
	
	public Result performFizzBuzzLogic(Submission submission) {
		 
		String message=" ";
		
		if (submission.getInputNumber() % 3 == 0 && submission.getInputNumber() % 5 ==0) { 
			message = "fizzbuzz";
		}
		else
			if (submission.getInputNumber() % 3 == 0 ) { 
				message = "fizz";
			}
			else
				if (submission.getInputNumber() % 5 == 0 ) { 
					message = "buzz";
				}
				else
					message ="not fizzBuzz";       
					
		
		
		Result result = new Result();
		result.setMessage(message);
		result.setSubmission(submission);
		FizzBuzzMapRepository repo = new FizzBuzzMapRepository();
		repo.save(result);
		
		return result;
		
		
	}

}
