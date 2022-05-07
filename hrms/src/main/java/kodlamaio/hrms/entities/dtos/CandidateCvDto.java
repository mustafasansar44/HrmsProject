package kodlamaio.hrms.entities.dtos;

import kodlamaio.hrms.entities.abstracts.Candidate;
import kodlamaio.hrms.entities.abstracts.CandidateEducation;
import kodlamaio.hrms.entities.abstracts.CandidateLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
public class CandidateCvDto {
    private List<CandidateEducation> candidateEducation;
    private List<CandidateLanguage> candidateLanguages;


/*
    //Candidate
    //Candidate Education
    //Candidate Language
    //Candidate Image


    private int id;
    private String firstName;
    private String lastName;

    private String schoolName;
    private String departmentName;
    private int startYear;

    private String languageName;
    private String languageLevel;

    //Candidate
    //Candidate Education
    //Candidate Language
    //Candidate Image

    private int id;
    private String firstName;
    private String lastName;

    private String schoolName;
    private String departmentName;
    private int startYear;

    private String languageName;
    private String languageLevel;

    private String languageName;
    private String languageLevel;
 */




}
/*
    private String businessName;
    private String position;
    private int startDate;
    private int endDate;


    private int id;
    private String firstName;
    private String lastName;

    private String schoolName;
    private String departmentName;
    private int startYear;

    private String businessName;
    private String position;
    private int startDate;
    private int endDate;

    private String languageName;
    private String languageLevel;

    private String socialName;

    private String technologyName;


 */