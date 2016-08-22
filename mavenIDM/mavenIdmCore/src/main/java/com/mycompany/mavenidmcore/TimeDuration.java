/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenidmcore;

/**
 *
 * @author Hanen LAFFET
 */
 class TimeDuration {
    private int nbreSeconde;
    
    public TimeDuration(int nbreSeconde) throws BadBadValueException{
        if (nbreSeconde<0)
            throw new BadBadValueException(nbreSeconde) ;
        else
         this.nbreSeconde= nbreSeconde;
    }
    
    @Override
    public String toString(){
        
        int h= nbreSeconde/3600;
        int min = (nbreSeconde%3600 )/60;
        int s = (nbreSeconde%3600 )%60;
     
        return h+"h "+min+" min "+s +"s";
    
    }
    public int getNbreSeconde(){
        return nbreSeconde;
    }
    
    
    
    
}
