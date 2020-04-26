package com.pkubir.common.exception.user;

/**
 * 验证码失效异常类
 * 
 * @author 技术微信号：wx17725354261
 */
public class CaptchaExpireException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire", null);
    }
}
