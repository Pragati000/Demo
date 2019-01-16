package main;

import java.util.Arrays;

public class Demo {
    int[] list =new int[10];
    public static void main(String args){

        Demo l1=new Demo();
        System.out.println(Arrays.toString(l1.list));
        l1.insert(42);
System.out.println(Arrays.toString(l1.list));
}
void insert(int value)
{
    for (int i = 0; i < list.length; i++) {
if(list[i]==0)
{
list[i]=value;
}
    }}}