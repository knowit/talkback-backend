package io.github.knowit.talkback

import scala.util.Properties.envOrElse
import fs2.Task
import org.http4s.server.blaze.BlazeBuilder
import org.http4s.util.StreamApp
import io.github.knowit.talkback.rest._

object Server extends StreamApp {
  val port: Int = envOrElse("TALKBACK_HTTP_PORT", "8080").toInt

  def stream(args: List[String]): fs2.Stream[Task, Nothing] = BlazeBuilder.bindHttp(port)
    .mountService(HelloWorld.service, "/")
    .mountService(MessageServlet.service, "/")
    .serve
}
