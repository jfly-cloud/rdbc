package com.jfly.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.jfly.base.BaseEntity;
import com.jfly.entity.VO.FormFilesTVO;
import com.jfly.entity.VO.FormFilesVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;
import java.util.List;

/**
 * <p>
 * endorsement form table
 * </p>
 *
 * @author ning.fangguo
 * @since 2020-05-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table
public class PanamaEndorsementForm extends BaseEntity {

    private static final long serialVersionUID=1L;

    @Id
    @JsonSerialize(using= ToStringSerializer.class)
    private Long id;

    @JsonSerialize(using= ToStringSerializer.class)
    private Long userId;

    private String trackingId;

    private String contactPerson;

    private String contactEmail;

    private String contactNumber;

    /**
     * 1=Normal (1-3 Working Days),2=Express (1 Working Day)
     */
    private Integer process;

    private String address;

    private String billingAddress;

    private String name;

    @JsonSerialize(using= ToStringSerializer.class)
    private Long rankId;

    /**
     * 0=NO,1=YES
     */
    private Integer vessel;

    /**
     * 0=NO,1=YES
     */
    private Integer nationality;

    @JsonSerialize(using= ToStringSerializer.class)
    private String typeId;

    /**
     * 1=new,2=approved
     */
    private Integer preReview;


    /**
     * 1=new,2=approved,3=rejected,4=resubmitted,5=quote,6=payment,7=pendingApprove
     */
    private Integer finReview;

    /**
     * 1=Not viewed,2=Viewed
     */
    private  Integer flag;

    /**
     * @see
     */
    @Transient
    private String operType;

    @Transient
    private String userStatus;

    @Transient
    private String companyName;

    @Transient
    private String companyStatus;

    @Transient
    private List<FormFilesVO> files;

    @Transient
    private List<FormFilesTVO> tfiles;

    @Transient
    private FormFilesVO approvedUrl;

    @Transient
    private String url;

    @Transient
    private String certUrl;

    @Transient
    private Boolean comExist;

}
