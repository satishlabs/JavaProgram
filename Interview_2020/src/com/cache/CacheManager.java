package com.cache;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CacheManager {
	// This is the HashMap that contains all objects in the cache.
	/* This object acts as a semaphore, which protects the HashMap */
	/* RESERVED FOR FUTURE USE  private static Object lock = new Object(); */
	static HashMap cacheHashMap = new HashMap<>();
	static {
		try {
			/* Create background thread, which will be responsible for purging expired items. */
			Thread threadCleanerUpper = new Thread(
					new Runnable() {
						/*  The default time the thread should sleep between scans.
		                  The sleep method takes in a millisecond value so 5000 = 5 Seconds.
						 */
						int milliSecondSleepTime = 5000;
						public void run() {
							try {
								/* Sets up an infinite loop.  The thread will continue looping forever. */
								while(true) {
									System.out.println("ThreadCleanerUpper Scanning For Expired Objects...");
									/* Get the set of all keys that are in cache.  These are the unique identifiers */
									Set keySet = cacheHashMap.keySet();
									Iterator keys = keySet.iterator();
									while(keys.hasNext()) {
										Object key = keys.next();
										Cacheable value = (Cacheable) cacheHashMap.get(key);
										if(value.isExpired()) {
											cacheHashMap.remove(key);
											System.out.println("ThreadCleanerUpper Running. Found an Expired Object in the Cache.");
										}
									}
									Thread.sleep(this.milliSecondSleepTime);
								}
							}catch (Exception e) {
								e.printStackTrace();
							}
							return;
						}
					});
		}catch (Exception e) {
			System.out.println("CacheManager.Static Block: " + e);
		}
	}
	public CacheManager() {
		
	}
	
	public static void puchCache(Cacheable object) {
		cacheHashMap.put(object.getIdentifier(), object);
	}
	public static Cacheable getCache(Object indentifier) {
		Cacheable objCacheable = (Cacheable) cacheHashMap.get(indentifier);
		if(objCacheable == null)
			return null;
		if(objCacheable.isExpired()) {
			cacheHashMap.remove(indentifier);
			return null;
		}else {
			return objCacheable;
		}
	}
}
