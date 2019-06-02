package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class MainControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "MainController GET" should {

    "Return OK status" in {
      val controller = new MainController(stubControllerComponents())
      val home = controller.healthCheck().apply(FakeRequest(GET, "/health-check"))

      status(home) mustBe OK
      contentType(home) mustBe None
    }
  }
}
