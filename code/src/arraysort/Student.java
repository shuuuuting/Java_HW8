/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;

/**
 *
 * @author zhangshuting
 */
public class Student {
    String name;
    int id;
    int grade;
    public Student(String n,int i,int g){
        name=n;
        id=i;
        grade=g;
    }
    @Override
    public String toString(){
    return String.format("%-10s%06d%4d",name,id,grade);
    }
}
