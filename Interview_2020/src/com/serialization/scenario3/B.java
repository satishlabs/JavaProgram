package com.serialization.scenario3;

import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class B extends A{
	int j=20;
	
	
	
	/*
     * define how Serialization process will write objects.  
     */
    private void writeObject(ObjectOutputStream os) throws NotSerializableException {
           throw new NotSerializableException("This class cannot be Serialized");
    } 
}
