package io.github.knowit.talkback.rest

import io.circe._
import org.http4s._
import org.http4s.circe._
import org.http4s.dsl._

class MessageServlet {
  val service = HttpService {
    case GET -> Root / "msg" / message =>
      Ok(Json.obj("message" -> Json.fromString(s"Message from app: ${message}")))
  }
}
