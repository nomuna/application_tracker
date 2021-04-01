package com.tracker

/*
entity Education {
 start LocalDate
 end LocalDate
 institution String
 note String
 degree String
}
*/
class Education {
    String school
    Date start
    Date end
    String description

    static constraints = {
       school      blank:false, unique: true
       start       nullable: true
       end         nullable: true
       description nullable: true
    }
    static belongsTo = [cv:CurriculumVitae]
}


