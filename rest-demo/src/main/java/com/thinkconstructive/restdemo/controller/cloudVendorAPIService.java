package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class cloudVendorAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public ResponseEntity<?> getCloudVendorDetails(@PathVariable String vendorId) {
        if (cloudVendor == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No records found");
        }

        // Logic to return cloudVendor details by vendorId
        // Assuming you have some logic to fetch details by vendorId

        return ResponseEntity.ok(cloudVendor);
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "A cloud vendor has been created successfully";

    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "A cloud vendor has been updated successfully";

    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "A cloud vendor has been deleted successfully";

    }
}
