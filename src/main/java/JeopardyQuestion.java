public class JeopardyQuestion {
    private final String question;
    private final int questionScore;

    JeopardyQuestion(String question, int questionScore) {
        this.question = question;
        this.questionScore = questionScore;
    }

    public String getQuestion() {
        //return question;
        return ("<html><body>"+question+"</body></html>");
    }

    public int getQuestionScore() {
        return questionScore;
    }

//    public void setQuestionScore(int score) {
//        this.questionScore = score;
//    }
}
