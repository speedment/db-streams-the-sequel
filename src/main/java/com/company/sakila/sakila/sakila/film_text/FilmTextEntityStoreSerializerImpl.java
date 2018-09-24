package com.company.sakila.sakila.sakila.film_text;

import com.company.sakila.sakila.sakila.film_text.generated.GeneratedFilmTextEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named film_text.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class FilmTextEntityStoreSerializerImpl extends GeneratedFilmTextEntityStoreSerializerImpl {
    
    public FilmTextEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}