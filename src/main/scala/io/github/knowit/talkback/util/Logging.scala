package io.github.knowit.talkback.util

import org.log4s.{Logger, getLogger}


trait Logging {
  val log: Logger = getLogger
}
