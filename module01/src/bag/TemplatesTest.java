package bag;

import java.util.ArrayList;

/**
 * @author xjnstart
 * @date 2021/5/9-16:54
 *  * 1. IEDA中代码模板所处的位置:settings-Editor-live Templates/Postfix Completion
 *  * 2. 常用模板
 */
public class TemplatesTest {

    //模板六：prsf:可生成 private static final私有静态常量
    private static final Customer CUST = new Customer();

    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 =2;
    //变形：psfs
    public static final String NATION="china";



    //模板一:psvm
    public static void main(String[] args){


        //模板二:sout
        System.out.println("hello!");
        //变形:soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + args);//直接输入soutv,点回车  打印一个值到System.out
        //System.out.println("args = " + Arrays.deepToString(args));//直接输入soutp,点回车    打印方法参数的名称和值到System.out
        System.out.println("TemplatesTest.main");//直接输入soutm,点回车    打印当前的类名和方法到System.out
        //System.out.println();//直接输入sout,点回车  打印一个字符串到System.out
        //System.out.printf("");//直接输入souf,点回车  打印一个格式化字符串到System.out


        int num1=10;
        System.out.println("num1 = " + num1);
        int num2=20;
        System.out.println("num2 = " + num2);//可以输入souv，然后回车；或者输num2.soutv

        //模板三：fori
        String[] arr=new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }//这个语句输入fori,然后点回车；再输入arr[i].sout,点回车；

        //变形：iter
        for (String s : arr) {
            System.out.println(s);

        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }//输入list.for，然后回车；

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {


        }
        //变形：list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");

        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        if (list == null) {

        }//输入ifn，然后回车；

        //变形：inn
        if (list != null) {
            
        }//输入inn，然后回车；

        //变形：xxx.nn
        if (list != null) {

        }//输入list.nn，然后回车；

        //变形：xxx.null
        if (list == null) {

        }//输入list.null，然后回车；


    }

    //自己生成的模板演示  输入test,按回车即可得到
    public void  testupdata(){
        //修改的测试
    }

    //自己生成的模板演示2  输入pric,按回车即可得到;带注释的private int
    /**
    * 客户的id
    **/
    private int id;

    //自己生成的模板演示3 输入prsc,按回车即可得到;带注释的private String
    /**
    *客户的姓名
    **/
    private String name;






    
}

