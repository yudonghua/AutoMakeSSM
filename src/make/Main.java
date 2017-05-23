package make;

import java.io.*;

/**
 * Created by Dell on 2017/5/22.
 */
public class Main {
    public static void main (String args[]) throws IOException {
        copy("F:\\java\\MakeSSM\\script","F:\\java\\MakeSSM\\demo");
        String table ="goods";
        String entity = "customer business status";
        getAll(table,entity);
    }
    public static void copy(String path,String copypath) {
        Runtime run = Runtime.getRuntime();
        try {
            // run.exec("cmd /k shutdown -s -t 3600");
            Process process = run.exec("C:\\Windows\\system32\\xcopy /e "+path+" "+copypath+"\\ ");
            InputStream in = process.getInputStream();
            while (in.read() != -1) {
                System.out.println(in.read());
            }
            in.close();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getAll(String table,String entity){
        entity = "id "+entity;
        new Entity().getBean(table,entity);
        new Dao().getDao(table);
        new Service().getImpl(table);
        new Service().getService(table);
        new Sql().getSql(table,entity);
        new Xml().getXml(table,entity);
        new Controller().getController(table,entity);
    }
}
