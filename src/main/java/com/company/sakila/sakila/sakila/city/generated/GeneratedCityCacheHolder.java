package com.company.sakila.sakila.sakila.city.generated;

import com.company.sakila.sakila.sakila.city.City;
import com.company.sakila.sakila.sakila.city.CityEntityStoreSerializerImpl;
import com.company.sakila.sakila.sakila.city.CityManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.HasStatistics.Statistics;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfComparable;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfInt;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfString;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.internal.util.StatisticsInternalUtil;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.runtime.bulk.PersistOperation;
import com.speedment.runtime.bulk.RemoveOperation;
import com.speedment.runtime.bulk.UpdateOperation;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.ColumnLabel;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.StreamSupplierComponent;
import com.speedment.runtime.field.Field;
import com.speedment.runtime.field.trait.HasIdentifier;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * A holder class for the various caches that are used to speed up the {@link
 * CityManager}.
 * 
 * Generated by
 * com.speedment.enterprise.datastore.generator.internal.code.GeneratedEntityCacheHolderTranslator
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedCityCacheHolder implements EntityStoreHolder<City> {
    
    private final EntityStore<City> entityStore;
    private final OfInt fieldCityIdCache;
    private final OfString fieldCityCache;
    private final OfInt fieldCountryIdCache;
    private final OfComparable<Timestamp> fieldLastUpdateCache;
    
    public GeneratedCityCacheHolder(
            EntityStore<City> entityStore,
            OfInt fieldCityIdCache,
            OfString fieldCityCache,
            OfInt fieldCountryIdCache,
            OfComparable<Timestamp> fieldLastUpdateCache) {
        
        this.entityStore          = requireNonNull(entityStore);
        this.fieldCityIdCache     = requireNonNull(fieldCityIdCache);
        this.fieldCityCache       = requireNonNull(fieldCityCache);
        this.fieldCountryIdCache  = requireNonNull(fieldCountryIdCache);
        this.fieldLastUpdateCache = requireNonNull(fieldLastUpdateCache);
    }
    
    @Override
    public EntityStore<City> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<City> columnId) {
        if (columnId instanceof City.Identifier) {
            final City.Identifier _id = (City.Identifier) columnId;
            switch (_id) {
                case CITY_ID     : return (CACHE) fieldCityIdCache;
                case CITY        : return (CACHE) fieldCityCache;
                case COUNTRY_ID  : return (CACHE) fieldCountryIdCache;
                case LAST_UPDATE : return (CACHE) fieldLastUpdateCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "city_id"     : return (CACHE) fieldCityIdCache;
                case "city"        : return (CACHE) fieldCityCache;
                case "country_id"  : return (CACHE) fieldCountryIdCache;
                case "last_update" : return (CACHE) fieldLastUpdateCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<City> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedCityCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            CityEntityStoreSerializerImpl::new,
            TableIdentifier.of("sakila", "sakila", "city")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<City> recycleAndPersist(PersistOperation<City> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<City> recycleAndRemove(RemoveOperation<City> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<City> recycleAndUpdate(UpdateOperation<City> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<City> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<City>, FieldCache<?>>>of(
            Tuples.of(City.CITY_ID,    fieldCityIdCache),
            Tuples.of(City.CITY,       fieldCityCache),
            Tuples.of(City.COUNTRY_ID, fieldCountryIdCache),
            Tuples.of(City.LAST_UPDATE,fieldLastUpdateCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<City>> columnIdentifiers = Stream.<HasIdentifier<City>>of(
            City.CITY_ID,
            City.CITY,
            City.COUNTRY_ID,
            City.LAST_UPDATE
        )
            .map(HasIdentifier::identifier)
            .collect(toSet());
        return EntityStoreHolder.of(
            entityStore,
            fieldCaches,
            multiFieldCaches,
            columnIdentifiers
        );
    }
    
    public static CompletableFuture<GeneratedCityCacheHolder> reload(CompletableFuture<EntityStore<City>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfInt> fieldCityIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, City.CITY_ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldCityCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, City.CITY, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldCountryIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, City.COUNTRY_ID, 0);
        
        final CompletableFuture<FieldCache.OfComparable<Timestamp>> fieldLastUpdateCacheFuture =
            DataStoreHolderUtil.buildComparableCache(entityStoreFuture, executor, City.LAST_UPDATE, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedCityCacheHolder(
                    entityStore,
                    fieldCityIdCacheFuture.get(),
                    fieldCityCacheFuture.get(),
                    fieldCountryIdCacheFuture.get(),
                    fieldLastUpdateCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldCityIdCache.close();
        fieldCityCache.close();
        fieldCountryIdCache.close();
        fieldLastUpdateCache.close();
    }
    
    @Override
    public Map<String, Map<Statistics, ?>> getStatistics() {
        return StatisticsInternalUtil.getStatistics(    
            this,
            entityStore.identifier(),
            City.Identifier.CITY_ID,
            City.Identifier.CITY,
            City.Identifier.COUNTRY_ID,
            City.Identifier.LAST_UPDATE
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}