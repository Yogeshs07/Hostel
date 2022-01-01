package com.example.hostel.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    public static final String STUDENT_ID = "STUDENT_ID";
    public static final String STUDENT_NAME = "STUDENT_NAME";
    public static final String STUDENT_YEAR = "STUDENT_YEAR";
    public static final String STUDENT_CONTACT_NO = "STUDENT_CONTACT_NO";
    public static final String STUDENT_EMAIL = "STUDENT_EMAIL";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = STUDENT_ID)
    private Integer studentId;

    @Column(name = STUDENT_NAME)
    private String studentName;

    @Column(name = STUDENT_YEAR)
    private String studentYear;

    @Column(name = STUDENT_CONTACT_NO)
    private String studentContactNo;

    @Column(name = STUDENT_EMAIL)
    private String studentEmail;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    private List<Report> reportList = new ArrayList<>();

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudentContactNo() {
        return studentContactNo;
    }

    public void setStudentContactNo(String studentContactNo) {
        this.studentContactNo = studentContactNo;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public List<Report> getReportList() {
        return reportList;
    }

    public void setReportList(List<Report> reportList) {
        this.reportList = reportList;
    }
}
