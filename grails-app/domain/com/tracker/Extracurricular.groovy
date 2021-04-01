package com.tracker

/*
entity Extracurricular {
  name String
  description String
}
*/
class Extracurricular {
    String type
    Date start
    Date end
    String description

    static constraints = {
       type        blank:false, unique: true
       start       nullable: true
       end         nullable: true
       description nullable: true
    }
}
