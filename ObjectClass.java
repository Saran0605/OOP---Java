public class ObjectClass {
    int num;
    ObjectClass(int n){
        super();
        this.num = n;
    }

    public String toString(){
        return "num="+num;

    }
    public static void main(String[] args) {
        ObjectClass one = new ObjectClass(10);
        System.out.println(one);
    }

    public ObjectClass() {
        super();
    }
//unique representation of object as numbers
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
