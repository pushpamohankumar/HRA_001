package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchWindow {
@Test
public void window() {
	String s="aaabbccdaabb";
	int count=1;
	for(int i=0;i<s.length();i++)
	{
		
		if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			count++;
		}
		else {
			System.out.println(s.charAt(i)+" "+count);
			count=1;
		}
}
	System.out.println(s.charAt(s.length()-1)+" "+count);
}
@Test
public void vowel() {
	String s="testyantraio";
	char[] st = s.toCharArray();
	int vowels=0;
	int conso=0;
	for(int i=0;i<st.length;i++)
	{
		if(st[i]=='a' || st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u')
		{
			vowels++;
			System.out.println(st[i]+" is a vowels ");
		}
		else
		{
			conso++;
			System.out.println(st[i]+" is a consonants");
		}
	}
}
@Test
public void segregare() {
	String s="BgY&8(4^yiKP@5";
	String Upper="";
	String lower="";
	String Special="";
	String num="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			lower=lower+s.charAt(i);
		}
		else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
		{
			Upper=Upper+s.charAt(i);
		}
		else if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			num=num+s.charAt(i);
		}
		else
		{
			Special=Special+s.charAt(i);
		}
	}
	System.out.println("lower letters :"+lower);
	System.out.println("Upper letters :"+Upper);
	System.out.println("num letters :"+num);
	System.out.println("special letters :"+Special);
}
@Test
public void addnum() {
	String s="1bnfg4k6";
	int num=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			num=num+s.charAt(i)-48;
		}
	}
	System.out.println(num);
}
@Test
public void addtwo() {
	String s="11bnfg14k16";
	int sum=0;
	int tsum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			int n=s.charAt(i)-48;
			tsum=tsum*10+n;
		}
		else {
			sum=sum+tsum;
			tsum=0;
		}
	}
	sum=sum+tsum;
	System.out.println(sum);
}
@Test
public void rev() {
	int a[]= {1,4,6,7,8};
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
}

@Test
public void fibonocci() {
	int n=1;
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	for(int i=0;i<=n;i++)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println(temp);
	}
	
}

}
