package com.thread.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllExceptionMain {
	public InvokeAllExceptionMain() {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		List<MyCallable> futureList = new ArrayList<MyCallable>();
		
		for(int i=0;i<10;i++) {
			MyCallable myCallable = new MyCallable((long)i);
			futureList.add(myCallable);
		}
		System.out.println("Start");
		try {
			List<Future<Long>> futures = service.invokeAll(futureList);
			for(Future<Long> future : futures) {
				try {
					System.out.println("Future.isDone => "+future.isDone());
					System.out.println("Future:  call => "+future.get());
				}catch (ExecutionException | CancellationException e) {
					e.printStackTrace();
				}catch (InterruptedException  e) {
					Thread.currentThread().interrupt();
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Completed");
		service.shutdown();
	}
	
	
	public static void main(String[] args) {
		InvokeAllExceptionMain demo = new InvokeAllExceptionMain();
	}

	class MyCallable implements Callable<Long>{
		Long id =0L;
		 public MyCallable(Long val) {
			this.id =val;
		}
		
		@Override
		public Long call() throws Exception {
			if(id == 3) {
				throw new Exception("Error");
			}else {
				return id;
			}
		
		}
	}

}
