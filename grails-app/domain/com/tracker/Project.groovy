package com.tracker

/*
entity RelevantProjects {
  start LocalDate
  end LocalDate
  customer String
  description TextBlob
  technologies String
  contribution TextBlob
}
*/
class Project {
    String type
    Date start
    Date end
    String desciption
    String customer
    String technologiesUsed
    String contribution

    static constraints = {
       type             blank:false, unique: true
       description      blank:false, unique: true
       customer         blank:false, unique: true
       technologiesUsed blank:false, unique: true
       contribution     nullable: true

       start            nullable: true
       end              nullable: true
       description      nullable: true
    }
    static belongsTo = [cv:CurriculumVitae]

}

