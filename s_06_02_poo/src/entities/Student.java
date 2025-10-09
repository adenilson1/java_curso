package entities;

public class Student {
	public String name;
	public double n1, n2, n3, missing;
	 
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	
	public String passFailed() {
		if(finalGrade() >= 60) {
			return "PASS";
		}else {
			missing = 60 - finalGrade();
			return "FAILED";
			
			
		}
		
	}
	
	public String toString() {
		if(finalGrade() >= 60) {
			return   String.format("FINAL GRADE = %.2f%n", finalGrade())
				   + passFailed();
		}else {
			return    String.format("FINAL GRADE = %.2f%n", finalGrade())
					+ passFailed()
					+ "\n"
					+ String.format("MISSING %.2f POINTS",missing);
		}
		
	}

}