package executors;

import executors.model.ScanDirectoryService;

public class ExecutorsMain {
    public static void main(String[] args){
        ScanDirectoryService scanDirectoryService = new ScanDirectoryService("D:\\Progetti", 5);
        scanDirectoryService.start();
    }
}
