package com.hellsinner.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static ResponseDto build(Integer status, String msg, Object data) {
        return new ResponseDto(status, msg, data);
    }

    public static ResponseDto ok(Object data) {
        return new ResponseDto(data);
    }

    public static ResponseDto ok() {
        return new ResponseDto(null);
    }

    public static ResponseDto build(Integer status, String msg) {
        return new ResponseDto(status, msg, null);
    }

    public ResponseDto(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }
}
