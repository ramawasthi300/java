package javaclg; 
class static_inner{
     static int data = 30;
     static class inner{
         void msg(){
             System.out.println("data is " +data);
         }
    public static void main(String[] args) {
    static_inner.inner obj =new static_inner.inner();
    obj.msg();
     }
    }
}
