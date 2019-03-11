package dao;

import model.Answer;
import model.Question;
import model.Test;

import java.io.*;

public class TestDAO {

    public static Test getTest() throws FileNotFoundException{
        File testFile = new File("test.txt");
        if(!testFile.exists()){
            throw new FileNotFoundException("Файл теста не найден");
        }

        Test test = new Test();

        try(BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
            String line;
            Question question = null;
            int answerCounter = 0;
            int questionCounter = 0;
            while ((line=reader.readLine())!=null){
                String[] lineParam = line.split(",");

                if(lineParam[0].equals("Q")){
                    String name = lineParam[1];
                    question = new Question(++questionCounter,name);
                    test.getQuestions().add(question);
                    answerCounter = 0;
                }
                if(lineParam[0].equals("A") && question!=null){
                    String name = lineParam[1];
                    boolean isAnswer = Boolean.parseBoolean(lineParam[2]);
                    Answer answer =new Answer(++answerCounter,name,isAnswer);
                    question.getAnswers().add(answer);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return test;
    }
}
