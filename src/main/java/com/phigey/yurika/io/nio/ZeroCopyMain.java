package com.phigey.yurika.io.nio;

import java.io.IOException;
import java.nio.channels.FileChannel;

public class ZeroCopyMain {
    public static void main(String[] args) throws IOException {

        FileChannel fileChannel = FileChannel.open(null, null);

    }
}
