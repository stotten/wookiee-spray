package com.webtrends.harness.component.spray.command

import com.webtrends.harness.command.CommandException
import spray.http.{StatusCodes, HttpHeader, StatusCode}

class SprayCommandException(val name:String,
                                 val msg:String,
                                 val ex:Option[Throwable]=None,
                                 val status: StatusCode = StatusCodes.BadRequest,
                                 val additionalHeaders: List[HttpHeader] = List()
                                ) extends CommandException(name, msg, ex)

object SprayCommandException {
  def apply(name:String, msg:String) = new SprayCommandException(name, msg)
  def apply(name:String, t:Throwable) = new SprayCommandException(name, t.getMessage, Some(t))
}
