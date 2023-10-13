package com.acceleratedskillup;

import hudson.model.AbstractProject
import hudson.tasks.Mailer
import hudson.model.User

def printMailInfo(){
  def item = hudson.model.Hudson.instance.getItem(env.JOB_NAME) 
  def build = item.getLastBuild()
  def cause = build.getCause(hudson.model.Cause.UserIdCause.class)
  def id = cause.getUserId()
  User u = User.get(id)
  def umail = u.getProperty(Mailer.UserProperty.class)
  print umail.getAddress()
}
