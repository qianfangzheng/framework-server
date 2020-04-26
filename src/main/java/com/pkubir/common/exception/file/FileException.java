package com.pkubir.common.exception.file;

import com.pkubir.common.exception.BaseException;

/**
 * 文件信息异常类
 * 
 * @author 技术微信号：wx17725354261
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
