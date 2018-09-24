package com.company.sakila.sakila.sakila.customer_list;

import com.company.sakila.sakila.sakila.customer_list.generated.GeneratedCustomerListEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * customer_list.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class CustomerListEntityStoreSerializerImpl extends GeneratedCustomerListEntityStoreSerializerImpl {
    
    public CustomerListEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}