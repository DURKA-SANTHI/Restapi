package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.example.ce1.model.Address;
import com.example.ce1.repository.AddressRepo;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    
    // public Address setAddress(Address address,Long personId)
    // {
    //     Address addressAvail = new Address();
    //      addressAvail.setStreet(address.getStreet());
    //      addressAvail.setCity(address.getCity());
    //      addressAvail.setZipcode(address.getZipcode());
    //      addressAvail.setPerson(address.getPerson());
    //      return addressRepo.saveAndFlush(addressAvail);
    // }
}
