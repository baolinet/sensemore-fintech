package com.sensemore.loan.infra.remote.cartoon;

import com.sensemore.loan.infra.remote.base.BaseRequest;

public class CartoonRequest extends BaseRequest<CartoonResponse> {

    @Override
    public Class<CartoonResponse> responseClass() {
        return CartoonResponse.class;
    }
    
}
