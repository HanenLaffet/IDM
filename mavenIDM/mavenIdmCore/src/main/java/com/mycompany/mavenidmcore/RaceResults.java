/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenidmcore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hanen LAFFET
 */
public class RaceResults {
    private ArrayList<String> tagRfid;
    private ArrayList<TimeDuration> time;
    
    public RaceResults(List<String> tagRfid, ArrayList<TimeDuration> time){
        tagRfid = new ArrayList<String>();
        time = new ArrayList<TimeDuration>();
        
    }
    
   public void onNewResult(String tag, TimeDuration resultTime){
        tagRfid.add(tag);
        time.add(resultTime);
   }
   
   public void printResults() {
       for (int  i=0 ; i<time.size(); i++){
           
       }
   }
    
}
