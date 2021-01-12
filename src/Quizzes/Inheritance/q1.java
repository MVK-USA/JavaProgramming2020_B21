package Quizzes.Inheritance;

 class q1 {
    public q1(){
        System.out.println("q1 ");
    }

    }
    class B extends q1{
    public B(){
        System.out.println("B");

    }
    }
    class Test extends B{
    public Test(){
        System.out.println("C");
    }

        public static void main(String[] args) {
            B obj = new B();
        }
    }

