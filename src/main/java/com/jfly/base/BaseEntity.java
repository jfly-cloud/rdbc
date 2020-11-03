package com.jfly.base;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Entity基类
 */
@Data
public class BaseEntity implements Serializable {

    /**删除标志 */
    @JsonIgnore
    private Integer delFlag;

    /** 创建者 */
    @JsonIgnore
    @CreatedBy
    private Long createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreatedDate
    private LocalDateTime createdDttm;

    /** 更新者 */
    @JsonIgnore
    @LastModifiedBy
    private Long updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @LastModifiedDate
    private LocalDateTime updatedDttm;

    /** 备注 */
    @JsonIgnore
    private String remark;
}