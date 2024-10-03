### 문제상황
람다식을 사용할 때 냅다 매개변수 두 개를 사용하니 오류가 발생한다.

### 해결
람다식은 functional Interface와 함께 써야 한다
```java
package enumTest.operation;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS("+",(x,y)-> x+y),

    MINUS("-",(x,y)->x-y),

    MULTI("*",(x,y)->x*y),
    DIVIDE("/",(x,y)->x/y);

    private final String operator;
    private final DoubleBinaryOperator op; //DoubleBinaryOperator이라는 functional interface를 사용한다

    Operation(String operator, DoubleBinaryOperator op) {
        this.operator=operator;
        this.op=op;
    }

    public double apply(double x,double y){ //apply() 임의 함수를 만들어 functional interface에 내제된 applyDouble을 호출한다.
        return op.applyAsDouble(x,y);
    }



}
```
