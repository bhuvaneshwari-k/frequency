package org.example;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Frequency {
    public static void main(String[] args) throws Exception {
        Logger l=Logger.getLogger("welcome");
        Scanner file=new Scanner (new File("src/main/java/org/example/text.txt"));
        HashMap<String,Integer> map=new HashMap<>();
        while(file.hasNext()){
            String str=file.next();
            Integer freq=map.getOrDefault(str,0)+1;
            map.put(str,freq);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq= new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        l.log(Level.INFO,()->"The word and its frequency is:"+pq);
        file.close();
    }
}