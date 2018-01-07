package items;

import java.util.ArrayList;

public class TestOperations {
	 
	private TestOperations() {}
	private static TestOperations testOperations;
	ArrayList<Test> questionList = new ArrayList<>();
	ArrayList<Test> newQuestionList = new ArrayList<Test>();

	
	
	public void prepareQuestions() {
		
		String options1[] = {"A. JAVA VIRTUAL MACHINE", "B. JAVA VIRTUAL MEMEORY", "C. BOTH", "D. NONE OF THE ABOVE"};
		Test test1 = new Test(1, " JVM stands for", options1);
		test1.setRtAns("A");
		addQuestions(test1);
		
		String options2[] = {"A. JAVA REAL ENGINE", "B. JAVA REALTIME MACHINE", "C. JAVA RUNTIME ENVIRONMENT", "D. NONE OF THE ABOVE"};
		Test test2 = new Test(2, " JRE stands for", options2);
		test2.setRtAns("C");
		addQuestions(test2);
		
		String options3[] = {"A. JAVA DESIGINING KIT", "B. JAVA DEVELOPMENT KIT", "C. BOTH", "D. NONE OF THE ABOVE"};
		Test test3 = new Test(3, " JDK stands for", options3);
		test3.setRtAns("B");
		addQuestions(test3);
		
		                                                              //adding same questions in the list
		
		addQuestions(test3);
		addQuestions(test2);
		addQuestions(test1);
		
		addQuestions(test3);
		addQuestions(test2);
		addQuestions(test1);
		
	}
	
	
	public void addQuestions(Test test) {
		this.questionList.add(test);
	}
	                                                             //creating new ArrayList with unique questions
	
	public void refineDuplicate(ArrayList<Test> questionList) {
		for(Test question : questionList) {
			if(newQuestionList.indexOf(question) > -1)
				continue;
			else 
				this.newQuestionList.add(question);
	    }
	}
	
    public ArrayList<Test> getQuestionList() {
    	
    	prepareQuestions();
    	refineDuplicate(questionList);
		return newQuestionList;
	}
	
	public static TestOperations getInstance() {                                            //SINGLETON
		/*if(testOperations == null)
			return testOperations = new TestOperations();
		else 
			return testOperations;*/
		return testOperations == null ? testOperations = new TestOperations() : testOperations;
	}
}
