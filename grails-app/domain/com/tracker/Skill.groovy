package com.tracker

/*
entity Skill {
  name SkillType
  level ProficiencyLevel
  keywords String
}

enum SkillType {
  LANGUAGE (Language),
  TECHNOLOGY (Technology),
  OPERATING_SYSTEM (OS),
  TOOL (Tool)
}
*/
class Skill {
    String type
    String name
    String level
    String keywords
    String description

    static constraints = {
      name blank:false, unique: true
      type inList: ["language", "programming", "os"]
      level inList: ["basic", "intermediate", "advanced"]
    }
    static belongsTo = [cv:CurriculumVitae]
}
