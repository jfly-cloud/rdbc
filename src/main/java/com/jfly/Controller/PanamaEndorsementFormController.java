package com.jfly.Controller;

import com.jfly.entity.Employee;
import com.jfly.entity.EmployeeDTO;
import com.jfly.entity.PanamaEndorsementForm;
import com.jfly.mapper.EmployeeMapper;
import com.jfly.service.IPanamaEndorsementFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import java.util.Date;


@RestController
@RequestMapping("/form")
public class PanamaEndorsementFormController {
    @Autowired
    private IPanamaEndorsementFormService service;

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

    @PostMapping("/mapstruct/v1")
    public String  mapstruct() {
        Employee employee=new Employee();
        employee.setId(1111111111);
        employee.setName("!!!!!!!!!!");
        employee.setStartDt(new Date());
        EmployeeDTO employeeDTO = EmployeeMapper.INSTANCE.employeetoEmployeeDTO(employee);
        return employeeDTO.toString();
    }
}
