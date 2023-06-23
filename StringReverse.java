//reverse the String in java 
import java. util.*;
class String{
public String reverse(String s){
  String rev="";
  for(int i=s.length();i>=0;i--){
   rev+=s.charAt(i);
  }
  return rev;
}
  
