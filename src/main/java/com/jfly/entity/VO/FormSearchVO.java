package com.jfly.entity.VO;
import lombok.Data;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
public class FormSearchVO{

    private static final long serialVersionUID=1L;

    private Long userId;

    private String trackingId;

    private String name;

    private String vesselName;

    private String port;

    private String type;

    private Integer form;

    private ZonedDateTime startTime;

    private ZonedDateTime endTime;

    private Date startDate;

    private Date endDate;
    /**
     * 1=new,2=approved
     */
    private Integer preReview;

    /**
     * 1=new,2=approved,3=rejected,4=resubmitted
     */
    private Integer finReview;

    private  String companyName;

    private String zone;
}
