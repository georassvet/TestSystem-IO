package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    private List<Question> questions;

    public Test() {
        questions = new ArrayList<>();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void startTest(){
        int total=0;
        for (Question question:questions) {
            showQuestion(question);
            String userAnswer = getAnswer();
            total += checkAnswer(question, userAnswer);
        }
        System.out.println("Итоговый результат:" + total);
    }

    private int checkAnswer(Question question, String userAnswer) {
        int result = 0;
        List<Integer> trueAnswers = question.getTrueAnswers();
        String[] answers = userAnswer.split(",");
        for (String answer:answers) {
            int answerId = Integer.parseInt(answer);
            if(trueAnswers.contains(answerId)){
               result++;
            }
            else{
                return 0;
            }
        }
        return result;
    }

    private void showQuestion(Question question){
        System.out.println("Вопрос № " + question.getId() +": " + question.getName());
        for (Answer answer:question.getAnswers()){
            System.out.println(answer.getId()+". " +answer.getName());
        }
    }
    private String getAnswer(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private void getResult(){
        System.out.println();
    }

}
