package com.jfly.entity.VO;

import com.github.liaochong.myexcel.core.annotation.ExcelColumn;
import com.github.liaochong.myexcel.core.annotation.IgnoreColumn;
import lombok.Data;

import java.io.Serializable;

@Data
public class EndorsementVO  implements Serializable {

    private static final long serialVersionUID=1L;

    @IgnoreColumn
    private String userId;
    @IgnoreColumn
    private String userStatus;

    @ExcelColumn(title ="Tracking ID",width = 30)
    private String trackingId;

    @ExcelColumn(title = "Applicant's Name",width = 30)
    private String name;

    @ExcelColumn(title ="Date Submitted",width = 30)
    private String createdDttm;


    @ExcelColumn(title = "Submitted by",width = 50)
    private  String companyName;

    /**
     * 1=new,2=approved
     */
    @IgnoreColumn
    private Integer preReview;

    /**
     * 1=new,2=approved,3=rejected,4=resubmitted
     */
    @ExcelColumn(title = "Panama Status",width = 30,mapping = "-2:NEW,-1:APPROVED,1:NEW,2:APPROVED,3:REJECTED,4:RESUBMIT,5:QUOTE,6:PAYMENT,7:PENDING APPROVE")
    private Integer finReview;

    @IgnoreColumn
    private Boolean urlExist;

    @IgnoreColumn
    private  String companyStatus;

    @IgnoreColumn
    private  Boolean comExist;

    @ExcelColumn(title = "Form Files",width = 120)
    private String url;

    @ExcelColumn(title = "Approved Certs",width = 120)
    private  String certUrl;

    @IgnoreColumn
    private  Integer flag;
}
