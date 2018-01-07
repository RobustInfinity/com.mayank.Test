 package items;

import java.util.Random;

public class Test implements Comparable<Object>{
	
	boolean status = false;
	private int quesNo;
	private String question;
	private String options[];
	private String rtAns;
	private String urAns;
	private int score = 0;
	
	public Test() {}
	public Test(int quesNo, String question, String options[]) {
		this.quesNo = quesNo;
		this.question = question;
		this.options = options;
	}

	public int getQuesNo() {
		return quesNo;
	}

	public void setQuesNo(int quesNo) {
		this.quesNo = quesNo;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String getRtAns() {
		return rtAns;
	}

	public void setRtAns(String rtAns) {
		this.rtAns = rtAns;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean flag) {
		this.status = flag;
	}
	
	@Override
	public int compareTo(Object second) {
		// TODO Auto-generated method stub
		//if(second instanceof Test)
			//this.isStatus()
		return 0;
	}
	
	@Override
	public boolean equals(Object second) {
		
		if(second instanceof Test)
			return this.getQuesNo() == ((Test)second).getQuesNo() ? true : false;
		else 
			return false;
	}
	
	public static int getRandom() {
				
		int range = TestOperations.getInstance().getQuestionList().size();
		Random random = new Random();
		int index = random.nextInt(range);
		System.out.println(index);
		return index;
	}
	public String getUrAns() {
		return urAns;
	}
	public void setUrAns(String urAns) {
		this.urAns = urAns;
	}
	
}
