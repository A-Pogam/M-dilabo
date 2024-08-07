package com.medilabo_solutions.patient.service.contracts;

import com.medilabo_solutions.patient.model.Patient;

import java.util.List;

public interface IPatientService {
    Patient addPatient(Patient patient);
    Patient updatePatient(String firstName, String lastName, Patient updatedPatient);
    Patient getPatientByName(String firstName, String lastName);
    List<Patient> getAllPatients();
}

