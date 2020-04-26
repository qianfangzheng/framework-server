package com.pkubir.common.utils;

/**
 * 处理并记录日志文件
 * 
 * @author 技术微信号：wx17725354261
 */
public class LogUtils
{
    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
