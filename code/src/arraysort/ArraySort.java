/*
 * B10433006 張舒婷
  */

/**
 *
 * @author zhangshuting
 */
package arraysort;
import java.util.Arrays;
import java.util.Comparator;

class NameCompare implements Comparator<Student>{
        @Override
        public int compare(Student x,Student y){
            return x.name.compareTo(y.name);
        }
    }
    class IDCompare implements Comparator<Student>{
        @Override
        public int compare(Student x,Student y){
            return x.id-y.id;
        }
    }
    class GradeCompare implements Comparator<Student>{
        @Override
        public int compare(Student x,Student y){
            return y.grade-x.grade;
        }
    }
public class ArraySort {
    public static void main(String[] args) {
        sortStudent();
    }
    private static void sortStudent(){
        Student students[]={
            new Student("Caleb",104992,99),
            new Student("Derek",102113,88),
            new Student("Dylan",101111,12),
            new Student("Anthony",Integer.parseInt("009123"),13),
            new Student("Bruce",102334,12),
            new Student("Spike",110222,1)
        };
        System.out.println("--------original information--------");
        display(students);
        Arrays.sort(students,new NameCompare());
        System.out.println("--------after sorting by name--------");
        display(students);
        Arrays.sort(students,new IDCompare());
        System.out.println("--------after sorting by id--------");
        display(students);
        Arrays.sort(students,new GradeCompare());
        System.out.println("--------after sorting by grade--------");
        display(students);
    }
    private static  <T> void display(T x[]) {
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }       
    }
}
