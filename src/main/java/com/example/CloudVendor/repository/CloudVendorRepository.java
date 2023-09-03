package com.example.CloudVendor.repository;

import com.example.CloudVendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

//it is responsible and interact with database
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}

