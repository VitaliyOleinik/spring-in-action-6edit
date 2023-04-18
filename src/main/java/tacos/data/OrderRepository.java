package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.TacoOrder;

import java.util.Date;
import java.util.List;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
    List<TacoOrder> readTacoOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
    List<TacoOrder> findByDeliveryToAndDeliveryCityAllIgnoresCase(
            String deliveryTo, String deliveryCity);
    List<TacoOrder> findByDeliveryCityOrderByDeliveryTo(String city);
}


/*
 IsAfter, After, IsGreaterThan, GreaterThan;
 IsGreaterThanEqual, GreaterThanEqual;
 IsBefore, Before, IsLessThan, LessThan;
 IsLessThanEqual, LessThanEqual;
 IsBetween, Between;
 IsNull, Null;
 IsNotNull, NotNull;
 IsIn, In;
 IsNotIn, NotIn;
 IsStartingWith, StartingWith, StartsWith;
 IsEndingWith, EndingWith, EndsWith;
 IsContaining, Containing, Contains;
 IsLike, Like;
 IsNotLike, NotLike;
 IsTrue, True;
 IsFalse, False;
 Is, Equals;
 IsNot, Not;
 IgnoringCase, IgnoresCas*/