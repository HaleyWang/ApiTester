package com.haleywang.monitor.dto.msg;

import com.haleywang.monitor.dto.Message;
import lombok.Getter;

/**
 * @author haley
 */

@Getter
public enum SettingDeleteMsg implements Message {


    /**
     * @author haley
     */
    NOT_FOUND("NOT_FOUND", "NOT_FOUND"),
    NOT_ALLOWED("NOT_ALLOWED", "Not allowed");

    private final String description;
    private final String code;

    SettingDeleteMsg(String code, String description) {
        this.code = code;
        this.description = description;
    }
}