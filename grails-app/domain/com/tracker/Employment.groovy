package com.tracker

/*entity EmploymentHistory {
  start LocalDate
  end LocalDate
  title String
  description TextBlob
  keywords String
}*/

class Employment {
    String position
    Date start
    Date end
    String desciption

    static constraints = {
       position    blank:false, unique: true
       start       nullable: true
       end         nullable: true
       description nullable: true
    }
    static belongsTo = [cv:CurriculumVitae]
}
