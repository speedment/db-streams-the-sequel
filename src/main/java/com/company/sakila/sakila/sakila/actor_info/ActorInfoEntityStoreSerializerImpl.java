package com.company.sakila.sakila.sakila.actor_info;

import com.company.sakila.sakila.sakila.actor_info.generated.GeneratedActorInfoEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named actor_info.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class ActorInfoEntityStoreSerializerImpl extends GeneratedActorInfoEntityStoreSerializerImpl {
    
    public ActorInfoEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}