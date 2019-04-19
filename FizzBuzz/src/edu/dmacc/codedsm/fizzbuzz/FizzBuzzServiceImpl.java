package edu.dmacc.codedsm.fizzbuzz;

public class FizzBuzzServiceImpl implements FizzBuzzService {

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
		
		
		Result result = new Result();
		result.setMessage(message);
		
		FizzBuzzMapRepository repo = new FizzBuzzMapRepository();
		repo.setResult(result);
		
		return result;
		
		
	}

}
