package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//	collect(Collector<? super T,A,R> collector) 구현
public class StreamTest2 {
    public static void main(String[] args) {
        Student[] stuAr={
                new Student("이자바",3,300),
                new Student("김자바",1,200),
                new Student("안자바",2,100),
                new Student("박자바",2,150),
                new Student("소자바",1,200),
                new Student("나자바",3,290),

        };

        //학생들 이름만 뽑아서 리스트 저장
        List<String> names= Stream.of(stuAr).map(Student::getName)
                .collect(Collectors.toList());
    }
}

class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }


    @Override
    public int compareTo(Student o) {
        return this.totalScore-o.totalScore;
    }
}
