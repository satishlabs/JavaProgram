package com.cache;

import java.util.Calendar;
import java.util.Date;

/*
  A Generic Cache Object wrapper.  Implements the Cacheable
interface uses a TimeToLive stategy for CacheObject expiration.
  */

public class CachedObject implements Cacheable{
	//This variable will be used to determine if the object is expired.
	private Date dateOfExpiration = null;
	private Object indentifier = null;
	
	/*  This contains the real "value".  This is the object which needs to
	be shared. */
	public Object object = null;
	
	public CachedObject(Object obj, Object id, int minutesToLive) {
		this.object = obj;
		this.indentifier = id;
		// minutesToLive of 0 means it lives on indefinitely.
		if(minutesToLive != 0) {
			dateOfExpiration = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateOfExpiration);
			cal.add(cal.MINUTE, minutesToLive);
			dateOfExpiration = cal.getTime();
		}
	}

	@Override
	public boolean isExpired() {
		// Remember if the minutes to live is zero then it lives forever!
		if(dateOfExpiration != null) {
			 // date of expiration is compared.
			if(dateOfExpiration.before(new Date())) {
				  System.out.println("CachedResultSet.isExpired:  Expired from Cache! EXPIRE TIME: " + dateOfExpiration.toString() + " CURRENT TIME: " +
						  (new java.util.Date()).toString());
				  return true;
			}else {
			    System.out.println("CachedResultSet.isExpired:  Expired not from Cache!");
			     return false;
			}
		}else
			return false;
	}

	@Override
	public Object getIdentifier() {
		return indentifier;
	}

}
