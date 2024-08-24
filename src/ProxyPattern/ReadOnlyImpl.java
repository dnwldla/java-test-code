package ProxyPattern;

public class ReadOnlyImpl implements QueryExecutor {
    @Override
    public void execute(String sql) {
        if (!sql.startsWith("select"))
            throw new RuntimeException("읽기 전용이므로 해당 쿼리는 수행되지 않습니다");
    }
}
