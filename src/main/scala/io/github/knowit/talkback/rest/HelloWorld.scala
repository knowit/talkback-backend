package io.github.knowit.talkback.rest

import io.circe._
import io.github.knowit.talkback.util.Logging
import org.http4s._
import org.http4s.circe._
import org.http4s.dsl._

object HelloWorld extends Logging {
  val service = HttpService {
    case GET -> Root / "hello" / name =>
      log.debug(s"HelloWorld - GET message: <<<$name>>>")
      Ok(Json.obj("message" -> Json.fromString(s"Hello, ${name}")))
  }
}
