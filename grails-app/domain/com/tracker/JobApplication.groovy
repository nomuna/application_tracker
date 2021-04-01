package com.tracker

/*
entity Application {
  position String,
  salaryLow Long,
  salaryHigh Long,
  coverLetter String,
  usedCV String,
  applied LocalDate,
  response LocalDate,
  company String,
  contactPerson String,
  address TextBlob,
  email String
}
*/
class JobApplication {

    String position 
    Long salaryLow
    Long salaryHigh
    String coverLetter
    Date applied
    Date response
    String company
    String contactPerson
    String address
    String email

    static constraints = { }
    static belongsTo = [cv:CurriculumVitae]
}
