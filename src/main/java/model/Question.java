package model;

import java.util.ArrayList;
import java.util.List;

public class Question{
    private int id;
    private  String name;

    private List<Answer> answers;

    public Question() {
    }

    public Question(int id , String name){
        this.id = id;
        this.name=name;
        answers = new ArrayList<>();
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

    public List<Answer> getAnswers() {
        return answers;
    }

    List<Integer> getTrueAnswers(){
        List<Integer> trueAnswers = new ArrayList<>();
        for (Answer answer : answers) {
            if(answer.isAnswer()){
                trueAnswers.add(answer.getId());
            }
        }
        return trueAnswers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}