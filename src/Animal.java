public class Animal extends Thread{



    public Animal(String name, int prioridad) {
        this.setName(name);
        this.setPriority(prioridad);
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long)Math.pow(this.getPriority(),this.getPriority()) );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        for (int i = 0; i < 10000; i++) {


        }
        System.out.println("Soy :"+getName());
    }
}
