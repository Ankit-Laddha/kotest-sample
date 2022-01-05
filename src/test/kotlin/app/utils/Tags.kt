package app.utils

import io.kotest.core.Tag

sealed class TestTypeTag : Tag()

object AB : TestTypeTag()
object CD : TestTypeTag()
object EF : TestTypeTag()
