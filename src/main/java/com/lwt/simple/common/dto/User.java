package com.lwt.simple.common.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 风格
     */
    private String style;

}
