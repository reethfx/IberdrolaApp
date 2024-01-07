package com.reeth.projectiberdrola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reeth.projectiberdrola.model.Asociation;
import com.reeth.projectiberdrola.repository.AsociationRepository;

@Service
public class AsociationService {

    @Autowired
    private AsociationRepository asociationRepository;

    public List<Asociation> getInfo() {
        return asociationRepository.findAllByOrderByDniAsc();
    }
}
