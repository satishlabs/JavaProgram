package com.serialization.scenario3;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class B extends A{
	int j=20;
	
	public B(int i, int j) {
		super(i);
		this.j = j;
	}
	
	// By implementing writeObject method,  
    // we can prevent 
    // subclass from serialization 
    private void writeObject(ObjectOutputStream out) throws IOException 
    { 
        throw new NotSerializableException("This class can't be serialized"); 
    }

 // By implementing readObject method,  
    // we can prevent 
    // subclass from de-serialization 
    private void readObject(ObjectInputStream in) throws IOException 
    { 
        throw new NotSerializableException(); 
    } 

}
