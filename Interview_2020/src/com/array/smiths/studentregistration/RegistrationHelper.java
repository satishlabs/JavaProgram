package com.array.smiths.studentregistration;

public class RegistrationHelper {
private final RegistrationPortal registrationPortal;
    
    public RegistrationHelper(RegistrationPortal registrationPortal) {
        this.registrationPortal = registrationPortal;
    }
    
    public void register(Student student) {
        if (this.registrationPortal != null) {
            this.registrationPortal.register(student);
        }
    }
}
