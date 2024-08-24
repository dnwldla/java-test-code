package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        QueryExecutor queryExecutor=new QueryExecutorImpl();
        queryExecutor.execute("SELECT * from user where id=1");

        //읽기전용
        QueryExecutor readOnlyQueryExecutor=new ReadOnlyImpl();
    }
}
