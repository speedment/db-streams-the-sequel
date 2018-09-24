package com.company.sakila.sakila.sakila.film_actor;

import com.company.sakila.sakila.sakila.film_actor.generated.GeneratedFilmActorEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named film_actor.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class FilmActorEntityStoreSerializerImpl extends GeneratedFilmActorEntityStoreSerializerImpl {
    
    public FilmActorEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}