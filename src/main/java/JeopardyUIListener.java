public interface JeopardyUIListener {
    void onOverviewButtonClicked(int x, int y);
    void onQuestionCompletedClicked(JeopardyQuestion jeopardyQuestion, int team);
}
