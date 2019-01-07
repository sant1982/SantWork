public interface ProductService{
    public abstract void test(); //by default methods of interface are public and abstract so no necessary to mention
    String countLength();
    default int count()
    { return 0;
    }
}