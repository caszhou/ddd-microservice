package com.caszhou.ddd.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.web.bind.annotation.*;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.caszhou.ddd.api.ICustomerService;
import com.caszhou.ddd.dto.CustomerAddCmd;
import com.caszhou.ddd.dto.CustomerListByNameQry;
import com.caszhou.ddd.dto.data.CustomerDto;

import lombok.SneakyThrows;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@RestController
public class CustomerController {
    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @SneakyThrows
    @GetMapping(value = "/dev/be")
    public void devBe() {
        Process process;
        try {
            process = Runtime.getRuntime().exec("sh /Users/zhouxiajie/mnt/java_home/rhdk/easy-report/ops/dev/be.sh");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            int exitValue = process.waitFor();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            if (exitValue == 0) {
                System.out.println("successfully executed the linux command");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    @GetMapping(value = "/dev/fe")
    public void devFe() {
        Process process;
        try {
            process = Runtime.getRuntime().exec("sh /Users/zhouxiajie/mnt/java_home/rhdk/easy-report/ops/dev/fe.sh");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            int exitValue = process.waitFor();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            if (exitValue == 0) {
                System.out.println("successfully executed the linux command");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @GetMapping(value = "/customer")
    public MultiResponse<CustomerDto> listCustomerByName(@RequestParam(required = false) String name) {
        CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
        customerListByNameQry.setName(name);
        return customerService.listByName(customerListByNameQry);
    }

    @PostMapping(value = "/customer")
    public Response addCustomer(@RequestBody CustomerAddCmd customerAddCmd) {
        return customerService.addCustomer(customerAddCmd);
    }
}
