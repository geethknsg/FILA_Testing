/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.test;

import bcccp.tickets.season.SeasonTicket;
import java.util.Date; 
/**
 * 
 *
 * @author Geeth
 */
public class SeasonTicket_testing {
    
    public static void main(String [] args){
    
        SeasonTicket st = new SeasonTicket("xpc00101" , "xpark001" , 12122017, 13122017 );
        System.out.println(st.getCarparkId());
        System.out.println(st.getId());
//        Date date = new Date( 12-12-2007);
//        System.out.println(date);
        System.out.println(st.getStartValidPeriod());
        System.out.println(st.getEndValidPeriod());
        
        
    }
}
