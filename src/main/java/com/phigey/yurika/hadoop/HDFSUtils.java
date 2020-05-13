package com.phigey.yurika.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;

/**
 * @author cfa
 */
public class HDFSUtils {
    /**
     * 加载hdfs客户端配置
     * @return
     */
    public static Configuration initConfiguration() {
        Configuration configuration = new Configuration();
        configuration.addResource(new Path(getPath("hadoop-conf/core-site.xml")));
        /*configuration.set("hadoop.security.authentication", "Kerberos");*/
        return configuration;
    }


    /**
     * 初始化Kerberos环境
     */
    public static void initKerberosENV(Configuration conf) {
        System.setProperty("java.security.krb5.conf",
                getPath("hadoop-conf/krb5.conf"));
        System.setProperty("javax.security.auth.useSubjectCredsOnly", "false");
        /*System.setProperty("sun.security.krb5.debug", "true");*/
        try {
            UserGroupInformation.setConfiguration(conf);
            UserGroupInformation.loginUserFromKeytab("aps",
                    getPath("hadoop-conf/aps.keytab"));
            System.out.println(UserGroupInformation.getCurrentUser());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getPath(String file) {
        if (null == file) {
            return null;
        }
        return Thread.currentThread().getContextClassLoader().getResource(file).getPath();
    }
}
