package JdkGradlePlugins_Stages

import JdkGradlePlugins_Stages.buildTypes.JdkGradlePlugins_Stages_Tested
import jetbrains.buildServer.configs.kotlin.v2017_2.Project

object Project : Project({
    uuid = "c4e4e922-aa09-49f7-9cd5-024e27b63bbc"
    id = "JdkGradlePlugins_Stages2"
    parentId = "JdkGradlePlugins"
    name = "Stages"

    buildType(JdkGradlePlugins_Stages_Tested)
})
