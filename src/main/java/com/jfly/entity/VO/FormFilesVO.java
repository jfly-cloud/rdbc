package com.jfly.entity.VO;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class FormFilesVO implements Serializable {
    private static final long serialVersionUID=1L;
    private  String definition;
    private  List<String> urls;
}
