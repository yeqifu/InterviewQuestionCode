import java.util.Scanner;

/**
 * 一维数组的使用
 * 2.从键盘读入学生成绩，找出最高分， 并输出学生成绩等级。
 *   成绩>=最高分-10    等级为’A’
 *   成绩>=最高分-20    等级为’B’
 *   成绩>=最高分-30    等级为’C’
 *   其余 等级为’D’
 *   提示：先读入学生人数，根据人数创建int数组， 存放学生成绩
 * @Author: 落亦-
 * @Date: 2019/12/27 17:40
 */
public class OneArrayUse {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        //获得学生的个数  studentNum
        int studentNum = scanner.nextInt();
        //创建一个有studentNum个元素的数组
        int[] student = new int[studentNum];

        System.out.println("请分别输入"+studentNum+"个学生的成绩，输入完一个学生的成绩之后敲回车再输入下一个学生的成绩:");

        for (int i = 0; i < studentNum; i++) {
            int socre = scanner.nextInt();
            //将学生的成绩放入数组中
            student[i]=socre;
        }
        System.out.print("学生的原始成绩为：");
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i]+",");
        }
        System.out.println();
        int[] student2 = student;
        System.out.print("student2为：");
        for (int i = 0; i < student2.length; i++) {
            System.out.print(student2[i]+",");
        }

        System.out.println();

        int[] student3=student2;

        System.out.print("student3为：");
        for (int i = 0; i < student3.length; i++) {
            System.out.print(student3[i]+",");
        }

        System.out.println();

        for (int i = 0; i < student.length-1; i++) {
            for (int j = 0; j < student.length - i - 1; j++) {
                if (student[j]>student[j+1]){
                    int temp;
                    temp = student[j];
                    student[j] = student[j+1];
                    student[j+1] = temp;
                }
            }

        }

        System.out.print("学生排序之后成绩为:");
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i]+",");
        }

        System.out.println("最高分是："+student[student.length-1]);
        int max = student[student.length-1];

        for (int i = 0; i < student2.length; i++) {
            if ( Math.abs(student2[i]-max)<10){
                System.out.println("student"+i+"的score is "+student2[i]+" grade is"+"A");
            }else if ( Math.abs(student2[i]-max)<20){
                System.out.println("student"+i+"的score is "+student2[i]+" grade is"+"B");
            }else if ( Math.abs(student2[i]-max)<30){
                System.out.println("student"+i+"的score is "+student2[i]+" grade is"+"C");
            }else{
                System.out.println("student"+i+"的score is "+student2[i]+" grade is"+"D");
            }
        }*/


        //1、先从键盘获得学生的人数
        System.out.print("请输入学生的人数：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("请分别输入每个学生的成绩，输入完一个学生的成绩之后敲回车输入下一个学生的成绩：");
        //先动态初始化一个有number个元素的一维数组
        int[] score = new int[number];
        //将number个学生的成绩依次放入数组中
        for (int i = 0; i < number; i++) {
            score[i] = scanner.nextInt();
        }

        //将第一个学生的成绩当成最高分
        int maxScore = score[0];
        //将数组中的成绩依次与maxScore进行对比，最后得出最高分
        for (int i = 1; i < score.length; i++) {
            if (score[i]>maxScore){
                maxScore=score[i];
            }
        }
        System.out.println("最高分是："+maxScore);

        //声明level
        char level;
        for (int i = 0; i < score.length; i++) {
            if (maxScore-score[i]<10){
                level = 'A';
            }else if (maxScore-score[i]<20){
                level = 'B';
            }else if (maxScore-score[i]<30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student"+i+"score is"+score[i]+"grade is"+level);
        }

    }
}
