package com.github.nehapednekar.customplugin.services

import com.github.nehapednekar.customplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
