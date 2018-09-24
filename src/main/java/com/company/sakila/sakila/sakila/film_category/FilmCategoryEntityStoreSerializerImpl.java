package com.company.sakila.sakila.sakila.film_category;

import com.company.sakila.sakila.sakila.film_category.generated.GeneratedFilmCategoryEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * film_category.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class FilmCategoryEntityStoreSerializerImpl extends GeneratedFilmCategoryEntityStoreSerializerImpl {
    
    public FilmCategoryEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}