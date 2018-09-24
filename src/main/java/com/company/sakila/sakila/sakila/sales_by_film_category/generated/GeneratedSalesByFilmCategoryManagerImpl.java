package com.company.sakila.sakila.sakila.sales_by_film_category.generated;

import com.company.sakila.sakila.sakila.sales_by_film_category.SalesByFilmCategory;
import com.company.sakila.sakila.sakila.sales_by_film_category.SalesByFilmCategoryManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractViewManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.company.sakila.sakila.sakila.sales_by_film_category.SalesByFilmCategory}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSalesByFilmCategoryManagerImpl 
extends AbstractViewManager<SalesByFilmCategory> 
implements GeneratedSalesByFilmCategoryManager {
    
    private final TableIdentifier<SalesByFilmCategory> tableIdentifier;
    
    protected GeneratedSalesByFilmCategoryManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "sales_by_film_category");
    }
    
    @Override
    public TableIdentifier<SalesByFilmCategory> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<SalesByFilmCategory>> fields() {
        return SalesByFilmCategoryManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<SalesByFilmCategory>> primaryKeyFields() {
        return Stream.empty();
    }
}