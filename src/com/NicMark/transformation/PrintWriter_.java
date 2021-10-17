package com.NicMark.transformation;

import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("hi,北京你好");
        printWriter.close();
    }
}
