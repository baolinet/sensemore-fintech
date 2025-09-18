package com.sensemore.loan.infra.remote;

import org.springframework.stereotype.Service;

import com.sensemore.loan.infra.remote.base.BaseInvoker;
import com.sensemore.loan.infra.remote.cartoon.CartoonRequest;
import com.sensemore.loan.infra.remote.cartoon.CartoonResponse;

@Service
public class CartoonInvoker extends BaseInvoker {
    
    public CartoonResponse cartoon(CartoonRequest request) {
        return super.invoke(request);
    }
}
