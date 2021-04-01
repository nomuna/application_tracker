package com.tracker

class CurriculumVitae {
    String type
    String language
    String theme

    static constraints = {
      type inList["custom", "generic"]
      language inList ["de", "en"]
    }

    static hasMany = [employments: Employment,
                      skills: Skill,
                      schoolsVisited: Education,
                      projects: Project,
                      jobApplications: JobApplication
    ]
}
