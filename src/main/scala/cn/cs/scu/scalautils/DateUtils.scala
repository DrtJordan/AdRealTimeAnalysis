package cn.cs.scu.scalautils

import java.text.SimpleDateFormat

/**
  * Created by zhangchi on 17/3/16.
  */
class DateUtils(time: Long) {

  val sdf = new SimpleDateFormat("yyyy-MM-dd")

  val date: String = sdf.format(time)

  def getDate:String = {

    date

  }

}

object DateUtils{

  def getDate(time: Long):String = {

    val sdf = new SimpleDateFormat("yyyy-MM-dd")

    sdf.format(time)

  }

  def getTime(time:Long):String = {

    val sdf = new SimpleDateFormat("HH:mm:ss")

    sdf.format(time)

  }

  def getMinute(time:Long):String = {
    val sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm")
    sdf.format(time)
  }

}