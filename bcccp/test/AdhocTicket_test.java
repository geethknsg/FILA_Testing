/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.test;
import bcccp.tickets.adhoc.AdhocTicket;
/**
 *
 * @author Geeth
 */
public class AdhocTicket_test {
 public static void main( String []args){
AdhocTicket ad = new AdhocTicket( "xpark001", 99, "xp001001");
     System.out.println(ad.getBarcode());
     System.out.println(ad.getCarparkId());
     System.out.println(ad.getTicketNo());
     System.out.println(ad.toString());
}
    
}
