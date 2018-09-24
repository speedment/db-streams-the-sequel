package com.company.sakila.sakila.sakila.sales_by_store;

import com.company.sakila.sakila.sakila.sales_by_store.generated.GeneratedSalesByStoreEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * sales_by_store.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class SalesByStoreEntityStoreSerializerImpl extends GeneratedSalesByStoreEntityStoreSerializerImpl {
    
    public SalesByStoreEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}