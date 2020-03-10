package latihan2;
/**
 * Test
 */
class Test<T> {

    T obj;
    Test(T obj){ this.obj = obj; } //constructor
    public T getObject() { return this.obj; }
    
}
class Main
{
    public static void main(String[] args) {
    
        // instance of integer type
        Test <Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
    
        // instance of String type
        Test<String> sObj = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
    
}