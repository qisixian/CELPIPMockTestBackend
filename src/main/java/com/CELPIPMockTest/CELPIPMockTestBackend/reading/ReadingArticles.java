package com.CELPIPMockTest.CELPIPMockTestBackend.reading;


public class ReadingArticles {
    private int testSuiteId;
    private String testSuiteName;
    private int practiceNumber;
    private int articleNumber;
    private int articleUid;
    private String articleTitle;
    private String articleInstruction;
    private String articleContent1;
    private int articleImageId;
    private String questionInstruction1;
    private int articleContent2Index;
    private String articleContent2;
    private String questionInstruction2;

    // getters and setters
    public int getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(int testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public String getTestSuiteName() {
        return testSuiteName;
    }

    public void setTestSuiteName(String testSuiteName) {
        this.testSuiteName = testSuiteName;
    }

    public int getPracticeNumber() {
        return practiceNumber;
    }

    public void setPracticeNumber(int practiceNumber) {
        this.practiceNumber = practiceNumber;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public int getArticleUid() {
        return articleUid;
    }

    public void setArticleUid(int articleUid) {
        this.articleUid = articleUid;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleInstruction() {
        return articleInstruction;
    }

    public void setArticleInstruction(String articleInstruction) {
        this.articleInstruction = articleInstruction;
    }

    public String getArticleContent1() {
        return articleContent1;
    }

    public void setArticleContent1(String articleContent1) {
        this.articleContent1 = articleContent1;
    }

    public int getArticleImageId() {
        return articleImageId;
    }

    public void setArticleImageId(int articleImageId) {
        this.articleImageId = articleImageId;
    }

    public String getQuestionInstruction1() {
        return questionInstruction1;
    }

    public void setQuestionInstruction1(String questionInstruction1) {
        this.questionInstruction1 = questionInstruction1;
    }

    public int getArticleContent2Index() {
        return articleContent2Index;
    }

    public void setArticleContent2Index(int articleContent2Index) {
        this.articleContent2Index = articleContent2Index;
    }

    public String getArticleContent2() {
        return articleContent2;
    }

    public void setArticleContent2(String articleContent2) {
        this.articleContent2 = articleContent2;
    }

    public String getQuestionInstruction2() {
        return questionInstruction2;
    }

    public void setQuestionInstruction2(String questionInstruction2) {
        this.questionInstruction2 = questionInstruction2;
    }

    // constructors
    public ReadingArticles() {
    }

    public ReadingArticles(int testSuiteId, String testSuiteName, int practiceNumber, int articleNumber, int articleUid, String articleTitle, String articleInstruction, String articleContent1, int articleImageId, String questionInstruction1, int articleContent2Index, String articleContent2, String questionInstruction2) {
        this.testSuiteId = testSuiteId;
        this.testSuiteName = testSuiteName;
        this.practiceNumber = practiceNumber;
        this.articleNumber = articleNumber;
        this.articleUid = articleUid;
        this.articleTitle = articleTitle;
        this.articleInstruction = articleInstruction;
        this.articleContent1 = articleContent1;
        this.articleImageId = articleImageId;
        this.questionInstruction1 = questionInstruction1;
        this.articleContent2Index = articleContent2Index;
        this.articleContent2 = articleContent2;
        this.questionInstruction2 = questionInstruction2;
    }

    // toString
    @Override
    public String toString() {
        return "ReadingArticles{" +
                "testSuiteId=" + testSuiteId +
                ", testSuiteName='" + testSuiteName + '\'' +
                ", practiceNumber=" + practiceNumber +
                ", articleNumber=" + articleNumber +
                ", articleUid=" + articleUid +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleInstruction='" + articleInstruction + '\'' +
                ", articleContent1='" + articleContent1 + '\'' +
                ", articleImage=" + articleImageId +
                ", questionInstruction1='" + questionInstruction1 + '\'' +
                ", articleContent2Index=" + articleContent2Index +
                ", articleContent2='" + articleContent2 + '\'' +
                ", questionInstruction2='" + questionInstruction2 + '\'' +
                '}';
    }

}
