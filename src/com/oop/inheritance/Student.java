package com.oop.inheritance;

class Students {
    private String studentId;
    private String name;
    private int age;

    public Students(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class UndergraduateStudent extends Students {
    private int year;

    public UndergraduateStudent(String studentId, String name, int age, int year) {
        super(studentId, name, age);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

class Freshman extends UndergraduateStudent {
    public Freshman(String studentId, String name, int age, int year) {
        super(studentId, name, age, year);
    }
}

class Sophomore extends UndergraduateStudent {
    public Sophomore(String studentId, String name, int age, int year) {
        super(studentId, name, age, year);
    }
}

class Junior extends UndergraduateStudent {
    public Junior(String studentId, String name, int age, int year) {
        super(studentId, name, age, year);
    }
}

class Senior extends UndergraduateStudent {
    public Senior(String studentId, String name, int age, int year) {
        super(studentId, name, age, year);
    }
}

class GraduateStudent extends Students {
    private String degree;

    public GraduateStudent(String studentId, String name, int age, String degree) {
        super(studentId, name, age);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }
}

class DoctoralStudent extends GraduateStudent {
    public DoctoralStudent(String studentId, String name, int age, String degree) {
        super(studentId, name, age, degree);
    }
}

class MastersStudent extends GraduateStudent {
    public MastersStudent(String studentId, String name, int age, String degree) {
        super(studentId, name, age, degree);
    }
}






