interface Car{  
    void run();  
    }  
      
    class Bmw implements Car{  
    public void run(){
        System.out.println("driving car on road with speed 130km/h");
    }  
         
    public static void main(String... args){  
    Car c=new Bmw();
       
    c.run();  
    } }

    