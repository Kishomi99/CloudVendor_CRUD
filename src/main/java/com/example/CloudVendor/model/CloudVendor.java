package com.example.CloudVendor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // make it as a jpa entity
@Table(name ="cloud_vendor")
public class CloudVendor {

        @Id
        @Column(name ="Vendor_Id", length = 10)
        private String vendorId;
        @Column(name ="Vendor_Name", length = 50)
        private String vendorName;
        @Column(name ="Address", length = 50)
        private String vendorAddress;
        @Column(name ="PhoneNumber", length = 50)
        private String vendorPhoneNumber;

        public CloudVendor() {
        }

        public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
            this.vendorId = vendorId;
            this.vendorName = vendorName;
            this.vendorAddress = vendorAddress;
            this.vendorPhoneNumber = vendorPhoneNumber;
        }

        public String getVendorId() {
            return vendorId;
        }

        public void setVendorId(String vendorId) {
            this.vendorId = vendorId;
        }

        public String getVendorName() {
            return vendorName;
        }

        public void setVendorName(String vendorName) {
            this.vendorName = vendorName;
        }

        public String getVendorAddress() {
            return vendorAddress;
        }

        public void setVendorAddress(String vendorAddress) {
            this.vendorAddress = vendorAddress;
        }

        public String getVendorPhoneNumber() {
            return vendorPhoneNumber;
        }

        public void setVendorPhoneNumber(String vendorPhoneNumber) {
            this.vendorPhoneNumber = vendorPhoneNumber;
        }
}
