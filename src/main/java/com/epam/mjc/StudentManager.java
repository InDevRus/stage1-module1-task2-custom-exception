package com.epam.mjc;


import java.text.MessageFormat;
import java.util.Objects;

public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) throws StudentMissingException {
        var foundStudent = Student.getValueOf(studentID);
        if (Objects.isNull(foundStudent)) {
            var message = MessageFormat.format("Could not find student with ID {0}", String.valueOf(studentID));
            throw new StudentMissingException(message);
        }
        return foundStudent;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length; i++) {
            Student student = manager.find(IDs[i]);
            System.out.println("Student name " + student.getName());
        }

    }
}