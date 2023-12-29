package com.code;
import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// Sample arrays of student IDs and marks
        String[] studentIds = {"s1", "s2", "s3", "s4", "s5"};
        int[] studentMarks = {95, 80, 79, 68, 60};

        // Create a HashMap to store student information
        HashMap<String, Integer> studentMap = new HashMap<>();

        // Iterate through the arrays and store information in the HashMap
        for (int i = 0; i < studentIds.length; i++) {
            String studentId = studentIds[i];
            int studentMark = studentMarks[i];

            // Store the information in the HashMap
            studentMap.put(studentId, studentMark);
        }

        // Print student information
        System.out.println("Student Information:");
        for (String id : studentMap.keySet()) {
            int mark = studentMap.get(id);
            System.out.println("Student ID: " + id + ", Marks: " + mark);
        }

        // Print the size of the HashMap
        System.out.println("Size of the HashMap is: " + studentMap.size());
    }
}

