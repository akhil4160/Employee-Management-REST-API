package com.akhil.employeemanagementapi.mapper;

import com.akhil.employeemanagementapi.dto.EmployeeRequest;
import com.akhil.employeemanagementapi.dto.EmployeeResponse;
import com.akhil.employeemanagementapi.entity.Employee;

public class EmployeeMapper {

    public static Employee toEntity(EmployeeRequest request) {

        Employee employee = new Employee();

        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());
        employee.setEmail(request.getEmail());
        employee.setDepartment(request.getDepartment());
        employee.setSalary(request.getSalary());
        employee.setJoiningDate(request.getJoiningDate());

        return employee;
    }

    public static EmployeeResponse toResponse(Employee employee) {

        return new EmployeeResponse(employee.getId(),
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getEmail(),
                                employee.getDepartment(),
                                employee.getSalary(),
                                employee.getJoiningDate()
        );
    }
}
