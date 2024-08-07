package com.medilabo_solutions.patient.controller;

import com.medilabo_solutions.patient.model.Patient;
import com.medilabo_solutions.patient.service.PatientService;
import com.medilabo_solutions.patient.service.contracts.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private IPatientService iPatientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        return iPatientService.getAllPatients();
    }

    @GetMapping("/{firstName}/{lastName}")
    public Patient getPatientByName(@PathVariable String firstName, @PathVariable String lastName) {
        return iPatientService.getPatientByName(firstName, lastName);
    }

    @PutMapping("/{firstName}/{lastName}")
    public Patient updatePatient(@PathVariable String firstName, @PathVariable String lastName, @RequestBody Patient patient) {
        return iPatientService.updatePatient(firstName, lastName, patient);
    }
}
