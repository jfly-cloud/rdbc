package com.jfly.entity.VO;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilesVO implements Serializable {

    private static final long serialVersionUID=1L;

    private  String name;
    private  String type;
    private  String url;
}
