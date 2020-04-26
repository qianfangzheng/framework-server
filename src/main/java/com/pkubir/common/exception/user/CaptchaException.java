package com.pkubir.common.exception.user;

/**
 * 验证码错误异常类
 * 
 * @author 技术微信号：wx17725354261
 */
public class CaptchaException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaException()
    {
        super("user.jcaptcha.error", null);
    }
}
