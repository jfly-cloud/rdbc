package com.jfly.mapper;

import com.jfly.entity.Employee;
import com.jfly.entity.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mappings({
            @Mapping(target="employeeId", source="employee.id"),
            @Mapping(target="employeeName", source="employee.name"),
            @Mapping(target="employeeStartDt", source = "employee.startDt",
                    dateFormat = "dd-MM-yyyy HH:mm:ss")
    })
    EmployeeDTO employeetoEmployeeDTO(Employee employee);
}
