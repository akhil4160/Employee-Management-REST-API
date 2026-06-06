package com.akhil.employeemanagementapi.service;

import com.akhil.employeemanagementapi.dto.EmployeeRequest;
import com.akhil.employeemanagementapi.dto.EmployeeResponse;
import com.akhil.employeemanagementapi.entity.Employee;
import com.akhil.employeemanagementapi.exception.EmployeeNotFoundException;
import com.akhil.employeemanagementapi.mapper.EmployeeMapper;
import com.akhil.employeemanagementapi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest request) {

        Employee employee = EmployeeMapper.toEntity(request);

        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeResponse response = EmployeeMapper.toResponse(savedEmployee);

        return response;
    }

    @Override
    public List<EmployeeResponse> getAllEmployees() {

        List<Employee> employees =
                employeeRepository.findAll();

        List<EmployeeResponse> responses =
                new ArrayList<>();

        for(Employee employee : employees) {

            EmployeeResponse response =
                    EmployeeMapper.toResponse(employee);

            responses.add(response);
        }
        return responses;
    }

    @Override
    public EmployeeResponse getEmployeeById(Integer id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee not found by id" + id));

        EmployeeResponse response = EmployeeMapper.toResponse(employee);

        return response;
    }

    @Override
    public EmployeeResponse updateEmployee(
            Integer id,
            EmployeeRequest request) {

        Employee employee =
                employeeRepository.findById(id)
                        .orElseThrow(() ->
                                new EmployeeNotFoundException(
                                        "Employee not found by id" + id));

        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());
        employee.setEmail(request.getEmail());
        employee.setDepartment(request.getDepartment());
        employee.setSalary(request.getSalary());
        employee.setJoiningDate(request.getJoiningDate());

        Employee savedEmployee =
                employeeRepository.save(employee);

        return EmployeeMapper.toResponse(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {

        Employee employee =
                employeeRepository.findById(id)
                        .orElseThrow(() ->
                                new EmployeeNotFoundException(
                                        "Employee not found by id" + id));

        employeeRepository.delete(employee);
    }
}

