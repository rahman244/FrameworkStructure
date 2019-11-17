public class selection {

   static int x =10000;
    int b=180;


    public static void main(String[] args) {

       selection.test();
     //selection sel = new selection();

    // sel.test();


        System.out.println(sel.b);

        System.out.println(selection.x);



    }



    public  void test2(){


        System.out.println("I am no static method");




    }

    public static void test(){
        selection sel2 = new selection();

        System.out.println(sel2.a);


        int select = 2;

        if (select == 1)
        {
            System.out.println("take your small coffe");

        }


        else if(select==2)

        {
            System.out.println("take your meadim coffe");

        }
        else if(select==3)

        {
            System.out.println("take your large coffe");

            System.out.println(selection.x);
        }
        else

        {
            System.out.println("we dont have this coffee");

        }

        System.out.println(selection.x);
        System.out.println(select);

    }
}
