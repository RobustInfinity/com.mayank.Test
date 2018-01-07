package items;

public class Result {

	private int quesNo;
	private String question;
	private String rtAns;
	private String urAns;
	private int score = 0;
	
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
	public String getRtAns() {
		return rtAns;
	}
	public void setRtAns(String rtAns) {
		this.rtAns = rtAns;
	}
	public String getUrAns() {
		return urAns;
	}
	public void setUrAns(String urAns) {
		this.urAns = urAns;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
