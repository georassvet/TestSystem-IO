package model;

public class Answer {
    private int id;
    private String name;
    private boolean isAnswer;

    public Answer(int id, String name, boolean isAnswer) {
        this.id =id;
        this.name = name;
        this.isAnswer =isAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAnswer() {
        return isAnswer;
    }

    public void setAnswer(boolean answer) {
        isAnswer = answer;
    }
}
