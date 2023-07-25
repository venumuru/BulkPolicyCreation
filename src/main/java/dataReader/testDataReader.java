package dataReader;

import java.util.ArrayList;
import java.util.HashMap;

public class testDataReader {

    public static void main(String[] args){
        SupportMethods methods = new SupportMethods();
        HashMap<String, ArrayList> requestData = methods.getRequestData();
        for(String key: requestData.keySet()){
            ArrayList arrayList = requestData.get(key);
            System.out.println(key + " : " + arrayList);
        }
    }


}