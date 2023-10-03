package com.geekster.ApplicationEmpAddress.controller;

import com.geekster.ApplicationEmpAddress.model.Address;
import com.geekster.ApplicationEmpAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("create/address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }
    @GetMapping("get/all/address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("get/address/id/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @DeleteMapping ("delete/address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
}
