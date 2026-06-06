package com.akhil.employeemanagementapi.service;

import com.akhil.employeemanagementapi.dto.EmployeeRequest;
import com.akhil.employeemanagementapi.dto.EmployeeResponse;

import java.util.List;


public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest request);

    List<EmployeeResponse> getAllEmployees();

    EmployeeResponse getEmployeeById(Integer id);

    EmployeeResponse updateEmployee(
            Integer id,
            EmployeeRequest request);

    void deleteEmployee(Integer id);
}
