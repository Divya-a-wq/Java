package div.polymorphism;

class plane extends vehicle{
    @Override
    public void start() {
        super.start();
        System.out.println("plane is taking of");
    }
}
