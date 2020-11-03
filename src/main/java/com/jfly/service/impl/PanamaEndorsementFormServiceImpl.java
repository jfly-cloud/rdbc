package com.jfly.service.impl;

import com.jfly.entity.PanamaEndorsementForm;
import com.jfly.entity.VO.EndorsementVO;
import com.jfly.entity.VO.FormSearchVO;
import com.jfly.service.IPanamaEndorsementFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Query;
import org.springframework.data.relational.core.query.Update;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * <p>
 * endorsement form table 服务类
 * </p>
 *
 * @author ning.fangguo
 * @since 2020-05-12
 */
@Service
public class PanamaEndorsementFormServiceImpl implements IPanamaEndorsementFormService {

    @Autowired
    private R2dbcEntityTemplate template;

    @Override
    public Page<EndorsementVO> selectFormByTUserId(FormSearchVO searchVO) {
        return null;
    }

    @Override
    public Page<EndorsementVO> selectFormByMolUser(FormSearchVO searchVO) {
        return null;
    }

    @Override
    public Page<EndorsementVO> selectFormByPolUser(FormSearchVO searchVO) {
        return null;
    }



    @Override
    public Mono<PanamaEndorsementForm> selectFormByTrackingId(String trackingId) {
        return template.select(PanamaEndorsementForm.class)
                .matching(Query.query(Criteria.where("tracking_id").is(trackingId)))
                .one();
    }

    @Override
    public Mono<PanamaEndorsementForm> insertForm(PanamaEndorsementForm form) {
        //此方法提取所有非null值并将其插入。
       return template.insert(PanamaEndorsementForm.class).using(form);
    }

    @Override
    public  Mono<Integer> updateForm(PanamaEndorsementForm form) {
        return template.update(PanamaEndorsementForm.class)
                .matching(Query.query(Criteria.where("tracking_id").is(form.getTrackingId())))
                .apply(Update.update("contact_person","!!!!!!!!!1"));
    }

    @Override
    public Mono<Integer> deleteForm(PanamaEndorsementForm form) {
        return template.delete(PanamaEndorsementForm.class)
                .matching(Query.query(Criteria.where("tracking_id").is(form.getTrackingId())))
                .all();
    }
}
