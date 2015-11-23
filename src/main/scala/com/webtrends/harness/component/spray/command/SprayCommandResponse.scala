package com.webtrends.harness.component.spray.command

import com.webtrends.harness.command.CommandResponse
import spray.http.{StatusCodes, HttpHeader, StatusCode}

class SprayCommandResponse[T](val d: Option[T],
                              val t: String = "json",
                              val status: StatusCode = StatusCodes.OK,
                              val additionalHeaders: List[HttpHeader] = List()
                             ) extends CommandResponse[T](d, t)
