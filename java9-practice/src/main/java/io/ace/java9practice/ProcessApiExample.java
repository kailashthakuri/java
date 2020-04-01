package io.ace.java9practice;

import java.io.IOException;
import java.time.ZoneId;

public class ProcessApiExample {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        String np = "Not Present";
        Process process = pb.start();

        ProcessHandle.Info info = process.info();
        System.out.println("Process  ID  " + process.pid());
        System.out.println("Command name  " + info.command().orElse(np));
        System.out.println("Process  ID  " + info.commandLine().orElse(np));
        System.out.println("Start Time " + info.startInstant().map(i -> i.atZone(ZoneId.systemDefault()).toLocalDateTime().toString()));
        System.out.println("Argument  " + info.arguments().orElse(new String[]{"tetst"}));
        System.out.println("Uer " + info.user().orElse(np));
    }


}
