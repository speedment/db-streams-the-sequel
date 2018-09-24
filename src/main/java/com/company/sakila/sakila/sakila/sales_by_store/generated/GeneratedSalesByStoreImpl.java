package com.company.sakila.sakila.sakila.sales_by_store.generated;

import com.company.sakila.sakila.sakila.sales_by_store.SalesByStore;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.sakila.sakila.sales_by_store.SalesByStore}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSalesByStoreImpl implements SalesByStore {
    
    private String store;
    private String manager;
    private BigDecimal totalSales;
    
    protected GeneratedSalesByStoreImpl() {}
    
    @Override
    public Optional<String> getStore() {
        return Optional.ofNullable(store);
    }
    
    @Override
    public Optional<String> getManager() {
        return Optional.ofNullable(manager);
    }
    
    @Override
    public Optional<BigDecimal> getTotalSales() {
        return Optional.ofNullable(totalSales);
    }
    
    @Override
    public SalesByStore setStore(String store) {
        this.store = store;
        return this;
    }
    
    @Override
    public SalesByStore setManager(String manager) {
        this.manager = manager;
        return this;
    }
    
    @Override
    public SalesByStore setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("store = "      + Objects.toString(OptionalUtil.unwrap(getStore())));
        sj.add("manager = "    + Objects.toString(OptionalUtil.unwrap(getManager())));
        sj.add("totalSales = " + Objects.toString(OptionalUtil.unwrap(getTotalSales())));
        return "SalesByStoreImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof SalesByStore)) { return false; }
        final SalesByStore thatSalesByStore = (SalesByStore)that;
        if (!Objects.equals(this.getStore(), thatSalesByStore.getStore())) { return false; }
        if (!Objects.equals(this.getManager(), thatSalesByStore.getManager())) { return false; }
        if (!Objects.equals(this.getTotalSales(), thatSalesByStore.getTotalSales())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getStore()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getManager()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTotalSales()));
        return hash;
    }
}