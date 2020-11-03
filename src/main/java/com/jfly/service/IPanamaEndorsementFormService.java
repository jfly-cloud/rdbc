package com.jfly.service;

import com.jfly.entity.PanamaEndorsementForm;
import com.jfly.entity.VO.EndorsementVO;
import com.jfly.entity.VO.FormSearchVO;
import org.springframework.data.domain.Page;
import reactor.core.publisher.Mono;

/**
 * <p>
 * endorsement form table 服务类
 * </p>
 *
 * @author ning.fangguo
 * @since 2020-05-12
 */
public interface IPanamaEndorsementFormService  {

    Page<EndorsementVO> selectFormByTUserId(FormSearchVO searchVO);

    Page<EndorsementVO> selectFormByMolUser(FormSearchVO searchVO);

    Page<EndorsementVO> selectFormByPolUser(FormSearchVO searchVO);

    Mono<PanamaEndorsementForm> selectFormByTrackingId(String  trackingId);

    Mono<PanamaEndorsementForm> insertForm(PanamaEndorsementForm form);

    Mono<Integer> updateForm(PanamaEndorsementForm form);

    Mono<Integer> deleteForm(PanamaEndorsementForm form);

}
