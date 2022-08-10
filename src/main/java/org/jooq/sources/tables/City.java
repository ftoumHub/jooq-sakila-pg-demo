/*
 * This file is generated by jOOQ.
 */
package org.jooq.sources.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.sources.Indexes;
import org.jooq.sources.Keys;
import org.jooq.sources.Public;
import org.jooq.sources.tables.records.CityRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class City extends TableImpl<CityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.city</code>
     */
    public static final City CITY = new City();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CityRecord> getRecordType() {
        return CityRecord.class;
    }

    /**
     * The column <code>public.city.city_id</code>.
     */
    public final TableField<CityRecord, Integer> CITY_ID = createField(DSL.name("city_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.city.city</code>.
     */
    public final TableField<CityRecord, String> CITY_ = createField(DSL.name("city"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.city.country_id</code>.
     */
    public final TableField<CityRecord, Short> COUNTRY_ID = createField(DSL.name("country_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.city.last_update</code>.
     */
    public final TableField<CityRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    private City(Name alias, Table<CityRecord> aliased) {
        this(alias, aliased, null);
    }

    private City(Name alias, Table<CityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.city</code> table reference
     */
    public City(String alias) {
        this(DSL.name(alias), CITY);
    }

    /**
     * Create an aliased <code>public.city</code> table reference
     */
    public City(Name alias) {
        this(alias, CITY);
    }

    /**
     * Create a <code>public.city</code> table reference
     */
    public City() {
        this(DSL.name("city"), null);
    }

    public <O extends Record> City(Table<O> child, ForeignKey<O, CityRecord> key) {
        super(child, key, CITY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_COUNTRY_ID);
    }

    @Override
    public Identity<CityRecord, Integer> getIdentity() {
        return (Identity<CityRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CityRecord> getPrimaryKey() {
        return Keys.CITY_PKEY;
    }

    @Override
    public List<ForeignKey<CityRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CITY__CITY_COUNTRY_ID_FKEY);
    }

    private transient Country _country;

    public Country country() {
        if (_country == null)
            _country = new Country(this, Keys.CITY__CITY_COUNTRY_ID_FKEY);

        return _country;
    }

    @Override
    public City as(String alias) {
        return new City(DSL.name(alias), this);
    }

    @Override
    public City as(Name alias) {
        return new City(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(String name) {
        return new City(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(Name name) {
        return new City(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Short, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
