package io.github.knowit.talkback.rest

import io.circe._
import io.github.knowit.talkback.util.Logging
import org.http4s._
import org.http4s.circe._
import org.http4s.dsl._

object MessageServlet extends Logging {
  val service = HttpService {
    case GET -> Root / "msg" / message =>
      log.debug(s"MessageServlet - GET message: <<<$message>>>")
      Ok(Json.obj("message" -> Json.fromString(s"Message from app: ${message}")))
  }
}
