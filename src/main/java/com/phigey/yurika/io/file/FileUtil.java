package com.phigey.yurika.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * @author cfa
 */
public class FileUtil {
    final static long MAX_BUFFER_SIZE = 1024 * 1024 * 50;
    public final static int BUFFER_SIZE = 1024 * 1024;

    public static void copyFile(String srcDir, String dstDir) throws IOException {
        FileChannel fromChannel = new FileInputStream(new File(srcDir)).getChannel();
        File dsFile = new File(dstDir);
        if (!dsFile.getParentFile().exists()) {
            dsFile.getParentFile().mkdirs();
        }
        FileChannel toChannel = new FileOutputStream(dsFile).getChannel();
        long position = 0;

        try {
            do {
                long count = position + MAX_BUFFER_SIZE <= fromChannel.size() ? MAX_BUFFER_SIZE : fromChannel.size() - position;
                toChannel.transferFrom(fromChannel, position, count);
                position = position + MAX_BUFFER_SIZE;
            }
            while (position < fromChannel.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fromChannel.close();
            if (toChannel != null) {
                toChannel.close();
            }
        }

    }

    public static void copyFile2(String srcDir, String dstDir) throws IOException {
        File sourceFile = new File(srcDir);
        File targetFile = new File(dstDir);
        Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyFolder(String srcDir, String dstDir) throws IOException {
        File srcFile = new File(srcDir);
        File dstFile = new File(dstDir);
        if (!srcFile.exists()) {
            srcFile.mkdirs();
        }
        if (!dstFile.exists()) {
            dstFile.mkdirs();
        }
        if (!srcFile.isDirectory()) {
            return;
        }
        if (!dstFile.isDirectory()) {
            return;
        }
        File[] childFiles = srcFile.listFiles();
        for (File childFile : childFiles) {
            if (childFile.isFile()) {
                FileChannel input = null;
                FileChannel output = null;
                try {
                    input = new FileInputStream(new File(childFile.getAbsolutePath())).getChannel();
                    output = new FileOutputStream(new File(dstDir + "/" + childFile.getName())).getChannel();
                    //output.transferFrom(input, 0, Long.MAX_VALUE);
                    ByteBuffer byteBuffer = ByteBuffer.allocate(BUFFER_SIZE);
                    while (input.read(byteBuffer) != -1) {
                        byteBuffer.flip();
                        output.write(byteBuffer);
                        byteBuffer.clear();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (input != null) {
                        input.close();
                    }
                    if (output != null) {
                        output.close();
                    }
                }
            }
            if (childFile.isDirectory()) {
                copyFolder(srcDir + "/" + childFile.getName(), dstDir + "/" + childFile.getName());
            }
        }

    }
}