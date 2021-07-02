package com.github.oahceh.fevalrepl.services

import com.github.oahceh.fevalrepl.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
