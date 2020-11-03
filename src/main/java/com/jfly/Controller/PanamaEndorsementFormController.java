package com.jfly.Controller;

import com.jfly.entity.PanamaEndorsementForm;
import com.jfly.service.IPanamaEndorsementFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/form")
public class PanamaEndorsementFormController {
    @Autowired
    IPanamaEndorsementFormService service;

    @PostMapping("/select/v1")
    public Mono<PanamaEndorsementForm> select2(@RequestBody PanamaEndorsementForm form) {
        return service.selectFormByTrackingId(form.getTrackingId());
    }


    @PostMapping("/insert/v1")
    public Mono<PanamaEndorsementForm> insert(@RequestBody PanamaEndorsementForm form) {
        return service.insertForm(form);
    }


    @PostMapping("/update/v1")
    public Mono<Integer> update(@RequestBody PanamaEndorsementForm form) {
        return service.updateForm(form);
    }

    @PostMapping("/delete/v1")
    public Mono<Integer> delete(@RequestBody PanamaEndorsementForm form) {
        return service.deleteForm(form);
    }
}
