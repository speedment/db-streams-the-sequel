package com.company.sakila.sakila.sakila.staff.generated;

import com.company.sakila.sakila.sakila.staff.Staff;
import com.company.sakila.sakila.sakila.staff.StaffEntityStoreSerializerImpl;
import com.company.sakila.sakila.sakila.staff.StaffManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.HasStatistics.Statistics;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfComparable;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfInt;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfReference;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfShort;
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

import java.sql.Blob;
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
 * StaffManager}.
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
public final class GeneratedStaffCacheHolder implements EntityStoreHolder<Staff> {
    
    private final EntityStore<Staff> entityStore;
    private final OfShort fieldStaffIdCache;
    private final OfString fieldFirstNameCache;
    private final OfString fieldLastNameCache;
    private final OfInt fieldAddressIdCache;
    private final OfReference<Blob> fieldPictureCache;
    private final OfString fieldEmailCache;
    private final OfShort fieldStoreIdCache;
    private final OfInt fieldActiveCache;
    private final OfString fieldUsernameCache;
    private final OfString fieldPasswordCache;
    private final OfComparable<Timestamp> fieldLastUpdateCache;
    
    public GeneratedStaffCacheHolder(
            EntityStore<Staff> entityStore,
            OfShort fieldStaffIdCache,
            OfString fieldFirstNameCache,
            OfString fieldLastNameCache,
            OfInt fieldAddressIdCache,
            OfReference<Blob> fieldPictureCache,
            OfString fieldEmailCache,
            OfShort fieldStoreIdCache,
            OfInt fieldActiveCache,
            OfString fieldUsernameCache,
            OfString fieldPasswordCache,
            OfComparable<Timestamp> fieldLastUpdateCache) {
        
        this.entityStore          = requireNonNull(entityStore);
        this.fieldStaffIdCache    = requireNonNull(fieldStaffIdCache);
        this.fieldFirstNameCache  = requireNonNull(fieldFirstNameCache);
        this.fieldLastNameCache   = requireNonNull(fieldLastNameCache);
        this.fieldAddressIdCache  = requireNonNull(fieldAddressIdCache);
        this.fieldPictureCache    = requireNonNull(fieldPictureCache);
        this.fieldEmailCache      = requireNonNull(fieldEmailCache);
        this.fieldStoreIdCache    = requireNonNull(fieldStoreIdCache);
        this.fieldActiveCache     = requireNonNull(fieldActiveCache);
        this.fieldUsernameCache   = requireNonNull(fieldUsernameCache);
        this.fieldPasswordCache   = requireNonNull(fieldPasswordCache);
        this.fieldLastUpdateCache = requireNonNull(fieldLastUpdateCache);
    }
    
    @Override
    public EntityStore<Staff> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Staff> columnId) {
        if (columnId instanceof Staff.Identifier) {
            final Staff.Identifier _id = (Staff.Identifier) columnId;
            switch (_id) {
                case STAFF_ID    : return (CACHE) fieldStaffIdCache;
                case FIRST_NAME  : return (CACHE) fieldFirstNameCache;
                case LAST_NAME   : return (CACHE) fieldLastNameCache;
                case ADDRESS_ID  : return (CACHE) fieldAddressIdCache;
                case PICTURE     : return (CACHE) fieldPictureCache;
                case EMAIL       : return (CACHE) fieldEmailCache;
                case STORE_ID    : return (CACHE) fieldStoreIdCache;
                case ACTIVE      : return (CACHE) fieldActiveCache;
                case USERNAME    : return (CACHE) fieldUsernameCache;
                case PASSWORD    : return (CACHE) fieldPasswordCache;
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
                case "staff_id"    : return (CACHE) fieldStaffIdCache;
                case "first_name"  : return (CACHE) fieldFirstNameCache;
                case "last_name"   : return (CACHE) fieldLastNameCache;
                case "address_id"  : return (CACHE) fieldAddressIdCache;
                case "picture"     : return (CACHE) fieldPictureCache;
                case "email"       : return (CACHE) fieldEmailCache;
                case "store_id"    : return (CACHE) fieldStoreIdCache;
                case "active"      : return (CACHE) fieldActiveCache;
                case "username"    : return (CACHE) fieldUsernameCache;
                case "password"    : return (CACHE) fieldPasswordCache;
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
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Staff> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedStaffCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            StaffEntityStoreSerializerImpl::new,
            TableIdentifier.of("sakila", "sakila", "staff")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Staff> recycleAndPersist(PersistOperation<Staff> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Staff> recycleAndRemove(RemoveOperation<Staff> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Staff> recycleAndUpdate(UpdateOperation<Staff> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Staff> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Staff>, FieldCache<?>>>of(
            Tuples.of(Staff.STAFF_ID,   fieldStaffIdCache),
            Tuples.of(Staff.FIRST_NAME, fieldFirstNameCache),
            Tuples.of(Staff.LAST_NAME,  fieldLastNameCache),
            Tuples.of(Staff.ADDRESS_ID, fieldAddressIdCache),
            Tuples.of(Staff.PICTURE,    fieldPictureCache),
            Tuples.of(Staff.EMAIL,      fieldEmailCache),
            Tuples.of(Staff.STORE_ID,   fieldStoreIdCache),
            Tuples.of(Staff.ACTIVE,     fieldActiveCache),
            Tuples.of(Staff.USERNAME,   fieldUsernameCache),
            Tuples.of(Staff.PASSWORD,   fieldPasswordCache),
            Tuples.of(Staff.LAST_UPDATE,fieldLastUpdateCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Staff>> columnIdentifiers = Stream.<HasIdentifier<Staff>>of(
            Staff.STAFF_ID,
            Staff.FIRST_NAME,
            Staff.LAST_NAME,
            Staff.ADDRESS_ID,
            Staff.PICTURE,
            Staff.EMAIL,
            Staff.STORE_ID,
            Staff.ACTIVE,
            Staff.USERNAME,
            Staff.PASSWORD,
            Staff.LAST_UPDATE
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
    
    public static CompletableFuture<GeneratedStaffCacheHolder> reload(CompletableFuture<EntityStore<Staff>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfShort> fieldStaffIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, Staff.STAFF_ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldFirstNameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Staff.FIRST_NAME, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldLastNameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Staff.LAST_NAME, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldAddressIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Staff.ADDRESS_ID, 0);
        
        final CompletableFuture<FieldCache.OfReference<Blob>> fieldPictureCacheFuture =
            DataStoreHolderUtil.buildObjectCache(entityStoreFuture, executor, Staff.PICTURE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldEmailCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Staff.EMAIL, 0);
        
        final CompletableFuture<FieldCache.OfShort> fieldStoreIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, Staff.STORE_ID, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldActiveCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Staff.ACTIVE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldUsernameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Staff.USERNAME, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldPasswordCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Staff.PASSWORD, 0);
        
        final CompletableFuture<FieldCache.OfComparable<Timestamp>> fieldLastUpdateCacheFuture =
            DataStoreHolderUtil.buildComparableCache(entityStoreFuture, executor, Staff.LAST_UPDATE, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedStaffCacheHolder(
                    entityStore,
                    fieldStaffIdCacheFuture.get(),
                    fieldFirstNameCacheFuture.get(),
                    fieldLastNameCacheFuture.get(),
                    fieldAddressIdCacheFuture.get(),
                    fieldPictureCacheFuture.get(),
                    fieldEmailCacheFuture.get(),
                    fieldStoreIdCacheFuture.get(),
                    fieldActiveCacheFuture.get(),
                    fieldUsernameCacheFuture.get(),
                    fieldPasswordCacheFuture.get(),
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
        fieldStaffIdCache.close();
        fieldFirstNameCache.close();
        fieldLastNameCache.close();
        fieldAddressIdCache.close();
        fieldPictureCache.close();
        fieldEmailCache.close();
        fieldStoreIdCache.close();
        fieldActiveCache.close();
        fieldUsernameCache.close();
        fieldPasswordCache.close();
        fieldLastUpdateCache.close();
    }
    
    @Override
    public Map<String, Map<Statistics, ?>> getStatistics() {
        return StatisticsInternalUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Staff.Identifier.STAFF_ID,
            Staff.Identifier.FIRST_NAME,
            Staff.Identifier.LAST_NAME,
            Staff.Identifier.ADDRESS_ID,
            Staff.Identifier.PICTURE,
            Staff.Identifier.EMAIL,
            Staff.Identifier.STORE_ID,
            Staff.Identifier.ACTIVE,
            Staff.Identifier.USERNAME,
            Staff.Identifier.PASSWORD,
            Staff.Identifier.LAST_UPDATE
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}