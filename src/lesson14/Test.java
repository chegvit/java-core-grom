package lesson14;

public class Test implements Cloneable{

    private int sumNumber;
    private  String name;

    public Test(int sumNumber, String name) {
        this.sumNumber = sumNumber;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception{
        Test test = new Test(10000,"name");
        System.out.println(test);
        System.out.println(test.hashCode());

        Test test1 = (Test) test.clone();
        System.out.println(test1);
        System.out.println(test1.hashCode());

        Test test2 = new Test(test.getSumNumber(),test.getName());

    }

    public int getSumNumber() {
        return sumNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "sumNumber=" + sumNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

