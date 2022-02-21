package com.first.firstDemo.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private static final long serialVersionUID = 1L;
}