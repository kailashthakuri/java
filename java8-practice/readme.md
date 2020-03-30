## References 

- javabrains
  https://www.youtube.com/watch?v=0bHCxjkku0s&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&index=23
- TutorialPoint
  https://www.tutorialspoint.com/java8/java8_streams.htm

## Main functional interfaces(6)
- Consumer<T>   => represents an operation that accepts the one argument and returns no result.
- Supplier<T>   => accept no argument and produces a  result.
- Function<T,R> => accept the one argument and produces a result.
- Predicate<T>  => represents the predicate(boolean valued functio)n of one arugment.
- BinaryOperator<T> => represents an operation upon two operands of the same type, producing a result of the same type as the operands.
- UnaryOperator<T> => represents an operation on single operands that produces the result of the same type as the operand.

- Runnable =>  that takes nothing and returns nothing.

## Bi(4)
- BiConsumer<T,U>     =>  accepts the two input argument and produces no result.
- BiFunction<T,U,R>   => function that accepts the two argument and produces a result.
- BiPredicate<T,U>    =>  represent the predicate of two arguments.
- BinaryOperator      => above.

## Double(6)
- DoubleConsumer   => represents the operation that accepts single double-valued arugment and returns no result.
- DoubleSupplier   => represents the supplier of double-valued result.
- DoubleFunction<R>   => function that accepts a double-valued argument and produces a result. 
- DoublePredicate   => represents the predicate of one double-valued arugment.
- DoubleBinaryOperator => represents the operation upon two double-valued operands and producing a double-valued result.
- DoubleUnaryOperator =>  represents the operation on a single double-valued operand and producing a double-valued result.

## Int(6)
- IntConsumer  => represent the operation that accepts a single int-valued argument and produces no result.
- IntSupplier  => represents a supplier of int-valued results.
- IntFunction<R>  => represents the function that accepts an int-valued arugment and produces a result.
- IntPredicate  => represents the predicate of one int-valued argument.
- IntBinaryOperator => represents the operation on two int-valued operands and producing an int-valued result.
- IntUnaryOperator => represents the operation on a sigle int-valued operands and producing an int-valued result.

## Long(6)
- LongConsumer
- LongSupplier
- LongFunction<R>
- LongPredicate
- LongBinaryOperator
- LongUnaryOperator

## Boolean(1)
- BooleanSupplier => supplier of the boolean valued results.

## (6)
- DoubleToIntFunction => represents the function that accepts the a doubled-valued argument and preduces int-values result.
- DoubleToLongFunction
- IntToDoubleFunction
- IntToLongFunction
- LongToDoubleFunction
- LongToIntFunction

## Object &  Consumer(3)
- ObjIntConsumer => represents an operation that accepts the object-valued and int-valued argument and retuns no argument
- ObjDoubleConsumer
- ObjLongConsumer 

## Function(6)
- ToDoubleFunction<T> => function that produces a double-valued result.  
- ToLongFunction   
- ToIntFunction
- ToDoublBiFunction<T,U> => function that accepts the two argument and produces a double-valued result.
- ToIntDoubleFunction
- ToLongBiFunction

Tech Primers
https://www.youtube.com/watch?v=vHwToYEYvsU&list=PLTyWtrsGknYdqY_7lwcbJ1z4bvc5yEEZl






