package app.config

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.listeners.Listener
import io.kotest.extensions.allure.AllureTestReporter

object ProjectConfig : AbstractProjectConfig() {

    override fun listeners(): List<Listener> = listOf(
        AllureTestReporter()
    )

    override val parallelism = 3
    override val testNameAppendTags = true
}
