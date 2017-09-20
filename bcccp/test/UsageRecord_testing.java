/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.test;
import bcccp.tickets.season.UsageRecord;

/**
 *
 * @author Geeth
 */
public class UsageRecord_testing {
    public static void main(String [] args){
        
    UsageRecord us = new UsageRecord("xp001" , 12122007 );
    us.finalise(19122007);
    System.out.println(us.getSeasonTicketId());
    System.out.println(us.getStartTime());
    System.out.println(us.getEndTime());
    System.out.println(us.toString());
            }
}
