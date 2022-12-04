public class JeopardyQuestion {
    private final String question;
    private final int questionScore;

    JeopardyQuestion(String question, int questionScore) {
        this.question = question;
        this.questionScore = questionScore;
    }

    public String getQuestion() {
        return question;
    }

    public int getQuestionScore() {
        return questionScore;
    }
}
