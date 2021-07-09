package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NamesUtils.getList(
                "Java",
                "FrontEnd",
                "Backend",
                "FullStack");
        for (String course: courseList) {
            String newCourseName = course.toLowerCase().replace("!","!!");
            System.out.println("Platzi: " + newCourseName);
        }

        Stream<String> courseStream = Stream.of("Java",
                "FrontEnd",
                "Backend",
                "FullStack");

       // Stream<Integer> courseLengthStream = courseStream.map(course -> course.length());
        //Optional<Integer> longest = courseLengthStream.max((x, y)->y-x);

        //Stream can be only use one time, if you try to use, java do  a exception
        Stream<String> emphasisCourses = courseStream.map(course -> course + "!");
        Stream<String> justJavaCourses = emphasisCourses.filter(course ->course.contains("Java"));
        justJavaCourses.forEach(System.out::println);
    }
}
