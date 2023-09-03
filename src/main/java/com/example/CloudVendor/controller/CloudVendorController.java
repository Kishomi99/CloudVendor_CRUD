package com.example.CloudVendor.controller;

import com.example.CloudVendor.model.CloudVendor;
import com.example.CloudVendor.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloud-vendor")
public class CloudVendorController {

        @Autowired
        public CloudVendorService cloudVendorService;

        public CloudVendorController(CloudVendorService cloudVendorService) {
            this.cloudVendorService = cloudVendorService;
        }
        //read specific cloud vendor details from DB
        @GetMapping("{vendorId}")
        public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
        {
            return cloudVendorService.getCloudVendor(vendorId);
        }

        //read all details about the cloud vendor from DB
        @GetMapping()
        public List<CloudVendor> getAllCloudVendorDetails()

        {
            return cloudVendorService.getAllCloudVendor();
        }

        @PostMapping
        public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
        {
            cloudVendorService.createCloudVendor(cloudVendor);
            return "Cloud Vendor Created Successfully!!!!!!!!!!";
        }

        @PutMapping
        public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
        {
            cloudVendorService.updateCloudVendor(cloudVendor);
            return "Cloud Vendor Updated Successfully!!!!!!!!!!";
        }

        @DeleteMapping("{vendorId}")
        public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
        {
            cloudVendorService.deleteCloudVendor(vendorId);
            return "Cloud Vendor Deleted Successfully!!!!!!!!!!";
        }
}
