package com.phigey.yurika.apache.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * @author cfa
 */
public class HadoopMain {
    public static void main(String[] args) {
        Configuration configuration = HDFSUtils.initConfiguration();

        HDFSUtils.initKerberosENV(configuration);

        try {
            Path dstPath = new Path("/user");
            FileSystem fileSystem = FileSystem.get(configuration);
            FileStatus[] listStatus = fileSystem.listStatus(dstPath);
            for (FileStatus fileStatus : listStatus) {
                Path path = fileStatus.getPath();
                System.out.println(path);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
