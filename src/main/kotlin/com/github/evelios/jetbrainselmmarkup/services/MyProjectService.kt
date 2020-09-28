package com.github.evelios.jetbrainselmmarkup.services

import com.intellij.openapi.project.Project
import com.github.evelios.jetbrainselmmarkup.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
