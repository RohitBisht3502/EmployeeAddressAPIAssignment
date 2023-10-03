package com.geekster.ApplicationEmpAddress.repo;

import com.geekster.ApplicationEmpAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
