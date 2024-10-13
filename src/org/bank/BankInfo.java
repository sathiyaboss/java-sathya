package org.bank;
  ///java Task Q2
public class BankInfo 
{
	public void bankDetails() {
		System.out.println("Bank Details :\n");
		}
	public void bankinfo(String name,int code) {
		System.out.println("Full Name      = "+name+"\nSort Code      = "+code);
		}
	public void bankInfo(long accnum,String adress) {
		System.out.println("Account Number = "+accnum+"\nBank Adress    = "+adress);
		}
   public static void main(String[] args) {
	BankInfo s = new BankInfo();
	 s.bankDetails();
	 s.bankinfo("prakash Raj", 140);
	 s.bankInfo(10014540214l,"No:3/2 parrys RBI bank 1st street\n\t\t chennai -600005");
}
}
