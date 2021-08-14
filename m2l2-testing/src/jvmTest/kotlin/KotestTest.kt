import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class KotestTest: StringSpec({

    "our first test JVM" {
        1.toString() shouldBe "1"
    }

})
