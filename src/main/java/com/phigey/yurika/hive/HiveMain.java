package com.phigey.yurika.hive;


import com.phigey.yurika.hadoop.HDFSUtils;
import org.apache.hadoop.conf.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author cfa
 */
public class HiveMain {
    public static void main(String[] args) {
        try {
            Configuration configuration = HDFSUtils.initConfiguration();
            HDFSUtils.initKerberosENV(configuration);
            Class.forName("org.apache.hive.jdbc.HiveDriver");
            Connection connection = DriverManager.getConnection("jdbc:hive2://192.168.4.133:10000/default;principal=aps@ZETYUN.COM", "hive", "hive");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
