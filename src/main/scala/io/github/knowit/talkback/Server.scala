package io.github.knowit.talkback

import scala.util.Properties.envOrNone
import fs2.Task
import io.github.knowit.talkback.rest._
import org.http4s.server.blaze.BlazeBuilder
import org.http4s.util.StreamApp

object Server extends StreamApp {
  val port: Int = envOrNone("TALKBACK_HTTP_PORT").fold(8080)(_.toInt)

  def stream(args: List[String]): fs2.Stream[Task, Nothing] = BlazeBuilder.bindHttp(port)
    .mountService(HelloWorld.service, "/")
    .serve
}
