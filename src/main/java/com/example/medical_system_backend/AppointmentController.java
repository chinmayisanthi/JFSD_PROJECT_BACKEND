// AppointmentController.java
package com.example.medical_system_backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "http://localhost:5500")  // Adjust the URL as needed
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/book")
    public ResponseEntity<?> bookAppointment(@RequestBody Appointment appointment) {
        Appointment savedAppointment = appointmentService.bookAppointment(appointment);
        return new ResponseEntity<>(savedAppointment, HttpStatus.CREATED);
    }
    
    @GetMapping("/getall")
   public ResponseEntity<?> Getall(){
    	List<Appointment> appointments = appointmentService.getall();
    	return new ResponseEntity<>(appointments,HttpStatus.OK);
    }
    
}
