package com.example.CloudVendor.service.impl;

import com.example.CloudVendor.model.CloudVendor;
import com.example.CloudVendor.repository.CloudVendorRepository;
import com.example.CloudVendor.service.CloudVendorService;

import java.util.List;

public class CloudVendorServiceImplementation implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImplementation(CloudVendorRepository cloudVendorRepository) {
         this.cloudVendorRepository = cloudVendorRepository;
}

    @Override
    public String createCloudVendor(CloudVendor cloudVendor)
    {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor)
    {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String CloudVendorId)
    {
        cloudVendorRepository.deleteById(CloudVendorId);
        return "Successfully deleted!!!";
    }

    @Override
    public CloudVendor getCloudVendor(String CloudVendorId)
    {

        return cloudVendorRepository.findById(CloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor()
    {
        return cloudVendorRepository.findAll();
    }
}
