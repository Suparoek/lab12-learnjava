package com.Labeee.lab12Checkstring;
import java.util.*;
public class Lab12Checkstring {
	public static void main(String[] arges) {
		String checkText;
		String string1 = "You and Me", string2=" you and me ";
		//checkText=checkString(string1,string2);
		//System.out.println("check string1 to string2: "+checkText);
		String stringone=" test is the contains to text Stringtestcamp ";
		//containString(string1,string2);
		//lengthtxt(string1,string2);
		
		//System.out.println("subString :"+substringtxt(stringone));
		//System.out.println("trimtxt"+trimtxt(string2));
		//System.out.println("toUp :" +toup(string1));
		//System.out.println("txt :" +chain(string2));
		cut(string2);
	}
	public static  String checkString(String string1, String string2) {
		String checkText;
		if(string1.equals(string2)) {
			checkText= "Equal";
		}else {
			checkText="Not Equal";
		}
		return checkText;
	}
	public static void containString(String stringone,String stringtwo) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		boolean check1 = stringone.contains(txt);
		boolean check2 = stringtwo.contains(txt);
		if(check1 == true && check2 == true) {
			System.out.println("ข้อมูลในทั้งสองมีข้อมูลอยู่");
		}else if(check1 == true && check2 == false) {
			System.out.println("มีข้อมูลอยู่ในชุดข้อมูลแรก แต่ไม่มีในชุดที่สอง");
		}else if(check1 == false && check2 == true) {
			System.out.println("มีข้อมูลในชุดแรก แต่ไม่มีในชุดสอง");
		}else {
			System.out.println("ไม่มีข้อมูล");
		}
	}
	public static void lengthtxt(String txt1,String txt2) {
		int txtlength1,txtlength2;
		txtlength1 = txt1.length();
		txtlength2 = txt2.length();
		System.out.println("ความยาวชุดข้อมูลที่1 :"+txtlength1+" ความยาวข้อมูลชุดที่สอง :"+txtlength2);
	}
	public static String substringtxt(String txt) {
		String sub;
		sub = txt.substring(1,4);
		return sub;
	}
	public static String trimtxt(String txt) {
		String trimtxt;
		trimtxt = txt.trim();
		return trimtxt;
	}
	public static String toup(String txt) {
		String up ;
		up = txt.toUpperCase();
		return up;
	}
	public static String chain(String txt) {
		String txt1;
		txt1 =  txt.toLowerCase().trim();
		return txt1;
	}
	public static void cut(String txt) {
		String cut1;
		 cut1 = txt.replaceAll("\\s+","" );
		 System.out.println(cut1);
	}
}
