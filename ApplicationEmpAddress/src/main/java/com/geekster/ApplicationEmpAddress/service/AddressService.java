package com.geekster.ApplicationEmpAddress.service;

import com.geekster.ApplicationEmpAddress.model.Address;
import com.geekster.ApplicationEmpAddress.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "added successfully";
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElseThrow();
    }

    public String deleteAddressById(Long id) {
        Optional<Address> address=addressRepo.findById(id);
        if(address.isPresent()){
            return "deleted successfully";
        }else return "Address id not found";

    }
}
