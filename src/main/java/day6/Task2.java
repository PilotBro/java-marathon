package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane firstPlane = new Airplane("Cirrus", 2005, 9, 1610);
        firstPlane.info();

        firstPlane.setWeight(2000);
        firstPlane.setProducer("Cessna");
        firstPlane.setLength(10);
        firstPlane.setYear(2010);
        firstPlane.setFuel(300);
        firstPlane.info();

        firstPlane.setWeight(1560);
        firstPlane.setProducer("Baron");
        firstPlane.setLength(12);
        firstPlane.setYear(1840);
        firstPlane.setFuel(700);
        firstPlane.info();

        firstPlane.fillUp(29);
        firstPlane.info();
    }
}
