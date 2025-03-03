package com.jspiders.map;
import java.util.*;
public class OnlineQuizSystem {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // Questions and Answers stored in a HashMap
	        Map<String, String> questions = new LinkedHashMap<>();
	        questions.put("What is the capital of France?\nA) London  B) Paris  C) Rome  D) Berlin", "B");
	        questions.put("Which language is used for Android development?\nA) Python  B) Swift  C) Java  D) C++", "C");
	        questions.put("Which data structure uses LIFO principle?\nA) Queue  B) Stack  C) LinkedList  D) Tree", "B");
	        questions.put("Who developed Java?\nA) Microsoft  B) Sun Microsystems  C) Google  D) Apple", "B");
	        questions.put("Which keyword is used to define a class in Java?\nA) struct  B) define  C) class  D) object", "C");

	        List<String> questionList = new ArrayList<>(questions.keySet());
	        Collections.shuffle(questionList);  // Shuffle questions

	        int score = 0;
	        System.out.println("🎯 Welcome to the Online Quiz! 🎯\n");

	        for (String question : questionList) {
	            System.out.println(question);
	            System.out.print("Your answer: ");
	            String answer = sc.next().toUpperCase();

	            if (answer.equals(questions.get(question))) {
	                System.out.println("✅ Correct!\n");
	                score++;
	            } else {
	                System.out.println("❌ Wrong! The correct answer is: " + questions.get(question) + "\n");
	            }
	        }

	        System.out.println("🎉 Quiz Over! Your Score: " + score + "/" + questions.size());
	        sc.close();
	    }
	}


