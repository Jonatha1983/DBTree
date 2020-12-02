package com.github.jonatha1983.dbtree.services

import com.intellij.openapi.project.Project
import com.github.jonatha1983.dbtree.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
