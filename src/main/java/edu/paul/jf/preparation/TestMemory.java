package edu.paul.jf.preparation;

public class TestMemory {	
	//-verbose:gc -XX:+PrintGCDetails -Xloggc:C:/log/gc.log
	
    //Creating static variable j with default value  0
    static int j = 0;
    
    public static void main(String[] args) {	
        
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	//set this to manage process memory used
        if (j < 29) {
            j++;    //increment j  
            System.out.println(j);  //print j  
            main(new String[] { (args[0] + args[0]).intern() });
        }
//        
        try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}        
        double maxHeapSize = Runtime.getRuntime().maxMemory();
        String sizeInReadableForm;//
        double kbSize = maxHeapSize / 1024;
        double mbSize = kbSize / 1024;
        double gbSize = mbSize / 1024;//
        if (gbSize > 0) {
            sizeInReadableForm = gbSize + " GB";
        } else if (mbSize > 0) {
            sizeInReadableForm = mbSize + " MB";
        } else {
            sizeInReadableForm = kbSize + " KB";
        }

        System.out.println("Maximum Heap Size: " + sizeInReadableForm);
    }
}