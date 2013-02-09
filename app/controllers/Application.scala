package controllers

import play.api._
import play.api.mvc._
import javax.script.{ScriptContext, ScriptEngineManager}

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def playpause = Action {
    val runtime = Runtime.getRuntime
    val args = Array("osascript", "-e", "tell application \"Hermes\" to playpause")
    runtime.exec(args)

    Ok("playpause")
  }
  
}