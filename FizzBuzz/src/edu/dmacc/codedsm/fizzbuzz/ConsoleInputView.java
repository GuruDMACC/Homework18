package edu.dmacc.codedsm.fizzbuzz;

public class ConsoleInputView implements Inputview {

	private Result result;
	
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public void render() {
		 
		
		System.out.println(result);
		
		

	}

	public ConsoleInputView(Result result) {
		super();
		this.result = result;
	}

	
}
