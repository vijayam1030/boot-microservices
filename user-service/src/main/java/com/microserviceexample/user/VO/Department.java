package com.microserviceexample.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Department {

    private Long depId;
    private String depName;
    private String depAddress;
    private String depCode;

}
