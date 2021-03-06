package JdkGradlePlugins.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.BuildTypeSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

class JdkGradlePlugins_Stage_Trigger_BT(uuid: String, branch: String, config: (bt: BuildType) -> kotlin.Unit) : BuildType({
    this.uuid = uuid
    this.id = "JdkGradlePlugins_STAGE_BT_TRIGGER_${branch}"
    this.name = "Trigger($branch)"
    this.type = BuildTypeSettings.Type.COMPOSITE

    config.invoke(this);

    triggers {
        vcs {
            triggerRules = ""
            branchFilter = "+:*"
            perCheckinTriggering = true
            groupCheckinsByCommitter = true
            enableQueueOptimization = false
        }
    }

})
