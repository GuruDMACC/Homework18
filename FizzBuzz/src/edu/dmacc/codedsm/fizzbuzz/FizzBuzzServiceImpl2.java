package edu.dmacc.codedsm.fizzbuzz;

public class FizzBuzzServiceImpl2 implements FizzBuzzService {

	private MapRepository repo; 
	
	public FizzBuzzServiceImpl2(MapRepository repo) {
		 this.repo = repo;
		 
	}

	public Result performFizzBuzzLogic(Submission submission) {
		 
		String message=" ";
		
		if (submission.getInputNumber() % 4 == 0 && submission.getInputNumber() % 7 ==0) { 
			message = "fizzbuzz";
		}
		else
			if (submission.getInputNumber() % 4 == 0 ) { 
				message = "fizz";
			}
			else
				if (submission.getInputNumber() % 7 == 0 ) { 
					message = "buzz";
				}
				else
					message ="not fizzBuzz";       
					
		
		
		Result result = new Result();
		result.setMessage(message);
		result.setSubmission(submission);
		//FizzBuzzMapRepository repo = new FizzBuzzMapRepository();
		repo.save(result);
		
		return result;
		
		
	}

}
