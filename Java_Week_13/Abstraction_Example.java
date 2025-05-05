// Abstract class, method => MyTest Calculate()
// Overridden subclass1 => Addition Calculate() => obj1
// subclass2 => Substraction Calculate() => obj2
// subclass2 => Multiplication Calculate() => obj3

    abstract class MyTest{
        public abstract void Calculate();
    }

    class Addition extends MyTest {
        @Override
        public void Calculate() {
            int a = 10, b = 5;
            int result = a + b;
            System.out.println("Addition result: " + result);
        }
    }

    class Substraction extends MyTest {
        @Override
        public void Calculate() {
            int a = 10, b = 5;
            int result = a - b;
            System.out.println("Substraction result: " + result);
        }
    }

    class Multiplication extends MyTest {
        @Override
        public void Calculate() {
            int a = 10, b = 5;
            int result = a * b;
            System.out.println("Multiplication result: " + result);
        }
    }
    public class Abstraction_Example{
        public static void main(String[] args) {
            MyTest obj1 = new Addition();
            MyTest obj2 = new Substraction();
            MyTest obj3 = new Multiplication();

            obj1.Calculate();
            obj2.Calculate();
            obj3.Calculate();
        }
}