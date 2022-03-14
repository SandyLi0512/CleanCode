package com.epam.engx.cleancode.naming.task1;

import com.epam.engx.cleancode.naming.task1.thirdpartyjar.Order;
import com.epam.engx.cleancode.naming.task1.thirdpartyjar.Submittable;

public interface IOrderService  extends Submittable {
    void submitOrder(Order pOrder);
}
