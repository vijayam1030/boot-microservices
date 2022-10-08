package com.microserviceexample.user.service;

import com.microserviceexample.user.VO.Department;
import com.microserviceexample.user.VO.ResponseTemplateVO;
import com.microserviceexample.user.entity.Users;
import com.microserviceexample.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    public Users saveUser(Users user){
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserwithDepartment(Long userId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Users user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://localhost:9001/departments/"+ user.getDeptId(),Department.class);

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }

}
