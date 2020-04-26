package com.pkubir.common.exception.user;

import com.pkubir.common.exception.BaseException;

/**
 * 用户信息异常类
 * 
 * @author 技术微信号：wx17725354261
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
