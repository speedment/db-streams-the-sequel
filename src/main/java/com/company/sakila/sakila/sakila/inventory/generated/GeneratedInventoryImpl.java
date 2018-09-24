package com.company.sakila.sakila.sakila.inventory.generated;

import com.company.sakila.sakila.sakila.film.Film;
import com.company.sakila.sakila.sakila.inventory.Inventory;
import com.company.sakila.sakila.sakila.store.Store;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.sakila.sakila.inventory.Inventory}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedInventoryImpl implements Inventory {
    
    private int inventoryId;
    private int filmId;
    private short storeId;
    private Timestamp lastUpdate;
    
    protected GeneratedInventoryImpl() {}
    
    @Override
    public int getInventoryId() {
        return inventoryId;
    }
    
    @Override
    public int getFilmId() {
        return filmId;
    }
    
    @Override
    public short getStoreId() {
        return storeId;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Inventory setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }
    
    @Override
    public Inventory setFilmId(int filmId) {
        this.filmId = filmId;
        return this;
    }
    
    @Override
    public Inventory setStoreId(short storeId) {
        this.storeId = storeId;
        return this;
    }
    
    @Override
    public Inventory setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Film findFilmId(Manager<Film> foreignManager) {
        return foreignManager.stream().filter(Film.FILM_ID.equal(getFilmId())).findAny().orElse(null);
    }
    
    @Override
    public Store findStoreId(Manager<Store> foreignManager) {
        return foreignManager.stream().filter(Store.STORE_ID.equal(getStoreId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("inventoryId = " + Objects.toString(getInventoryId()));
        sj.add("filmId = "      + Objects.toString(getFilmId()));
        sj.add("storeId = "     + Objects.toString(getStoreId()));
        sj.add("lastUpdate = "  + Objects.toString(getLastUpdate()));
        return "InventoryImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Inventory)) { return false; }
        final Inventory thatInventory = (Inventory)that;
        if (this.getInventoryId() != thatInventory.getInventoryId()) { return false; }
        if (this.getFilmId() != thatInventory.getFilmId()) { return false; }
        if (this.getStoreId() != thatInventory.getStoreId()) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatInventory.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getInventoryId());
        hash = 31 * hash + Integer.hashCode(getFilmId());
        hash = 31 * hash + Short.hashCode(getStoreId());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}