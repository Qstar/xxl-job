package com.xxl.job.core.biz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * common return
 *
 * @param <T>
 * @author xuxueli 2015-12-4 16:32:31
 */
@Data
@NoArgsConstructor
public class ReturnT<T> implements Serializable {
    public static final long serialVersionUID = 42L;

    public static final int SUCCESS_CODE = 200;
    public static final int FAIL_CODE    = 500;

    public static final ReturnT<String> SUCCESS = new ReturnT<String>(null);
    public static final ReturnT<String> FAIL    = new ReturnT<String>(FAIL_CODE, null);

    private int    code;
    private String msg;
    private T      content;

    public ReturnT(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ReturnT(T content) {
        this.code = SUCCESS_CODE;
        this.content = content;
    }
}
