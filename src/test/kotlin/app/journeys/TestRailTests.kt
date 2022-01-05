package app.journeys

import app.utils.AB
import app.utils.CD
import app.utils.EF
import io.kotest.core.spec.DoNotParallelize
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.time.ExperimentalTime

@ExperimentalTime
@DoNotParallelize
class TestRailTests : FunSpec({

    beforeTest {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("ddMMMyyyy-HHmmss-SSS")
        val currentTime = current.format(formatter)
        println("ABC: Ankit: $currentTime")
    }

    test("TEST 1")
        .config(tags = setOf(AB, CD, EF)) {
            println("Start Test")
            // true shouldBe false
            println("End Test")
        }

    test("TEST 2 ")
        .config(tags = setOf(AB, CD)) {
            println("Start Test")
            true shouldBe false
            println("End Test")
        }

})
