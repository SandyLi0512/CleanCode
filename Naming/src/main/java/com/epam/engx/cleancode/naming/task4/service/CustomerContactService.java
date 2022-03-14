package com.epam.engx.cleancode.naming.task4.service;


import com.epam.engx.cleancode.naming.task4.thirdpartyjar.CustomerContact;

public interface CustomerContactService {

    /**
     * @param customerId
     * @return
     */
    CustomerContact findCustomerContactDetailsByCustomerId(Long customerId);

    /**
     * @param customerContactDetails
     */
    void updateCustomerContactDetails(CustomerContact customerContactDetails);

}
