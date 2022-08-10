/*
 * This file is generated by jOOQ.
 */
package org.jooq.sources;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.sources.tables.Actor;
import org.jooq.sources.tables.Address;
import org.jooq.sources.tables.Category;
import org.jooq.sources.tables.City;
import org.jooq.sources.tables.Country;
import org.jooq.sources.tables.Customer;
import org.jooq.sources.tables.Databasechangeloglock;
import org.jooq.sources.tables.Film;
import org.jooq.sources.tables.FilmActor;
import org.jooq.sources.tables.FilmCategory;
import org.jooq.sources.tables.Inventory;
import org.jooq.sources.tables.Language;
import org.jooq.sources.tables.Payment;
import org.jooq.sources.tables.PaymentP2007_01;
import org.jooq.sources.tables.PaymentP2007_02;
import org.jooq.sources.tables.PaymentP2007_03;
import org.jooq.sources.tables.PaymentP2007_04;
import org.jooq.sources.tables.PaymentP2007_05;
import org.jooq.sources.tables.PaymentP2007_06;
import org.jooq.sources.tables.Rental;
import org.jooq.sources.tables.Staff;
import org.jooq.sources.tables.Store;
import org.jooq.sources.tables.records.ActorRecord;
import org.jooq.sources.tables.records.AddressRecord;
import org.jooq.sources.tables.records.CategoryRecord;
import org.jooq.sources.tables.records.CityRecord;
import org.jooq.sources.tables.records.CountryRecord;
import org.jooq.sources.tables.records.CustomerRecord;
import org.jooq.sources.tables.records.DatabasechangeloglockRecord;
import org.jooq.sources.tables.records.FilmActorRecord;
import org.jooq.sources.tables.records.FilmCategoryRecord;
import org.jooq.sources.tables.records.FilmRecord;
import org.jooq.sources.tables.records.InventoryRecord;
import org.jooq.sources.tables.records.LanguageRecord;
import org.jooq.sources.tables.records.PaymentP2007_01Record;
import org.jooq.sources.tables.records.PaymentP2007_02Record;
import org.jooq.sources.tables.records.PaymentP2007_03Record;
import org.jooq.sources.tables.records.PaymentP2007_04Record;
import org.jooq.sources.tables.records.PaymentP2007_05Record;
import org.jooq.sources.tables.records.PaymentP2007_06Record;
import org.jooq.sources.tables.records.PaymentRecord;
import org.jooq.sources.tables.records.RentalRecord;
import org.jooq.sources.tables.records.StaffRecord;
import org.jooq.sources.tables.records.StoreRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActorRecord> ACTOR_PKEY = Internal.createUniqueKey(Actor.ACTOR, DSL.name("actor_pkey"), new TableField[] { Actor.ACTOR.ACTOR_ID }, true);
    public static final UniqueKey<AddressRecord> ADDRESS_PKEY = Internal.createUniqueKey(Address.ADDRESS, DSL.name("address_pkey"), new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = Internal.createUniqueKey(Category.CATEGORY, DSL.name("category_pkey"), new TableField[] { Category.CATEGORY.CATEGORY_ID }, true);
    public static final UniqueKey<CityRecord> CITY_PKEY = Internal.createUniqueKey(City.CITY, DSL.name("city_pkey"), new TableField[] { City.CITY.CITY_ID }, true);
    public static final UniqueKey<CountryRecord> COUNTRY_PKEY = Internal.createUniqueKey(Country.COUNTRY, DSL.name("country_pkey"), new TableField[] { Country.COUNTRY.COUNTRY_ID }, true);
    public static final UniqueKey<CustomerRecord> CUSTOMER_PKEY = Internal.createUniqueKey(Customer.CUSTOMER, DSL.name("customer_pkey"), new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final UniqueKey<DatabasechangeloglockRecord> DATABASECHANGELOGLOCK_PKEY = Internal.createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, DSL.name("databasechangeloglock_pkey"), new TableField[] { Databasechangeloglock.DATABASECHANGELOGLOCK.ID }, true);
    public static final UniqueKey<FilmRecord> FILM_PKEY = Internal.createUniqueKey(Film.FILM, DSL.name("film_pkey"), new TableField[] { Film.FILM.FILM_ID }, true);
    public static final UniqueKey<FilmActorRecord> FILM_ACTOR_PKEY = Internal.createUniqueKey(FilmActor.FILM_ACTOR, DSL.name("film_actor_pkey"), new TableField[] { FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID }, true);
    public static final UniqueKey<FilmCategoryRecord> FILM_CATEGORY_PKEY = Internal.createUniqueKey(FilmCategory.FILM_CATEGORY, DSL.name("film_category_pkey"), new TableField[] { FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID }, true);
    public static final UniqueKey<InventoryRecord> INVENTORY_PKEY = Internal.createUniqueKey(Inventory.INVENTORY, DSL.name("inventory_pkey"), new TableField[] { Inventory.INVENTORY.INVENTORY_ID }, true);
    public static final UniqueKey<LanguageRecord> LANGUAGE_PKEY = Internal.createUniqueKey(Language.LANGUAGE, DSL.name("language_pkey"), new TableField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
    public static final UniqueKey<PaymentRecord> PAYMENT_PKEY = Internal.createUniqueKey(Payment.PAYMENT, DSL.name("payment_pkey"), new TableField[] { Payment.PAYMENT.PAYMENT_ID }, true);
    public static final UniqueKey<RentalRecord> RENTAL_PKEY = Internal.createUniqueKey(Rental.RENTAL, DSL.name("rental_pkey"), new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final UniqueKey<StaffRecord> STAFF_PKEY = Internal.createUniqueKey(Staff.STAFF, DSL.name("staff_pkey"), new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final UniqueKey<StoreRecord> STORE_PKEY = Internal.createUniqueKey(Store.STORE, DSL.name("store_pkey"), new TableField[] { Store.STORE.STORE_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AddressRecord, CityRecord> ADDRESS__ADDRESS_CITY_ID_FKEY = Internal.createForeignKey(Address.ADDRESS, DSL.name("address_city_id_fkey"), new TableField[] { Address.ADDRESS.CITY_ID }, Keys.CITY_PKEY, new TableField[] { City.CITY.CITY_ID }, true);
    public static final ForeignKey<CityRecord, CountryRecord> CITY__CITY_COUNTRY_ID_FKEY = Internal.createForeignKey(City.CITY, DSL.name("city_country_id_fkey"), new TableField[] { City.CITY.COUNTRY_ID }, Keys.COUNTRY_PKEY, new TableField[] { Country.COUNTRY.COUNTRY_ID }, true);
    public static final ForeignKey<CustomerRecord, AddressRecord> CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY = Internal.createForeignKey(Customer.CUSTOMER, DSL.name("customer_address_id_fkey"), new TableField[] { Customer.CUSTOMER.ADDRESS_ID }, Keys.ADDRESS_PKEY, new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final ForeignKey<CustomerRecord, StoreRecord> CUSTOMER__CUSTOMER_STORE_ID_FKEY = Internal.createForeignKey(Customer.CUSTOMER, DSL.name("customer_store_id_fkey"), new TableField[] { Customer.CUSTOMER.STORE_ID }, Keys.STORE_PKEY, new TableField[] { Store.STORE.STORE_ID }, true);
    public static final ForeignKey<FilmRecord, LanguageRecord> FILM__FILM_LANGUAGE_ID_FKEY = Internal.createForeignKey(Film.FILM, DSL.name("film_language_id_fkey"), new TableField[] { Film.FILM.LANGUAGE_ID }, Keys.LANGUAGE_PKEY, new TableField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
    public static final ForeignKey<FilmRecord, LanguageRecord> FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY = Internal.createForeignKey(Film.FILM, DSL.name("film_original_language_id_fkey"), new TableField[] { Film.FILM.ORIGINAL_LANGUAGE_ID }, Keys.LANGUAGE_PKEY, new TableField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
    public static final ForeignKey<FilmActorRecord, ActorRecord> FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY = Internal.createForeignKey(FilmActor.FILM_ACTOR, DSL.name("film_actor_actor_id_fkey"), new TableField[] { FilmActor.FILM_ACTOR.ACTOR_ID }, Keys.ACTOR_PKEY, new TableField[] { Actor.ACTOR.ACTOR_ID }, true);
    public static final ForeignKey<FilmActorRecord, FilmRecord> FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY = Internal.createForeignKey(FilmActor.FILM_ACTOR, DSL.name("film_actor_film_id_fkey"), new TableField[] { FilmActor.FILM_ACTOR.FILM_ID }, Keys.FILM_PKEY, new TableField[] { Film.FILM.FILM_ID }, true);
    public static final ForeignKey<FilmCategoryRecord, CategoryRecord> FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY = Internal.createForeignKey(FilmCategory.FILM_CATEGORY, DSL.name("film_category_category_id_fkey"), new TableField[] { FilmCategory.FILM_CATEGORY.CATEGORY_ID }, Keys.CATEGORY_PKEY, new TableField[] { Category.CATEGORY.CATEGORY_ID }, true);
    public static final ForeignKey<FilmCategoryRecord, FilmRecord> FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY = Internal.createForeignKey(FilmCategory.FILM_CATEGORY, DSL.name("film_category_film_id_fkey"), new TableField[] { FilmCategory.FILM_CATEGORY.FILM_ID }, Keys.FILM_PKEY, new TableField[] { Film.FILM.FILM_ID }, true);
    public static final ForeignKey<InventoryRecord, FilmRecord> INVENTORY__INVENTORY_FILM_ID_FKEY = Internal.createForeignKey(Inventory.INVENTORY, DSL.name("inventory_film_id_fkey"), new TableField[] { Inventory.INVENTORY.FILM_ID }, Keys.FILM_PKEY, new TableField[] { Film.FILM.FILM_ID }, true);
    public static final ForeignKey<InventoryRecord, StoreRecord> INVENTORY__INVENTORY_STORE_ID_FKEY = Internal.createForeignKey(Inventory.INVENTORY, DSL.name("inventory_store_id_fkey"), new TableField[] { Inventory.INVENTORY.STORE_ID }, Keys.STORE_PKEY, new TableField[] { Store.STORE.STORE_ID }, true);
    public static final ForeignKey<PaymentRecord, CustomerRecord> PAYMENT__PAYMENT_CUSTOMER_ID_FKEY = Internal.createForeignKey(Payment.PAYMENT, DSL.name("payment_customer_id_fkey"), new TableField[] { Payment.PAYMENT.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<PaymentRecord, RentalRecord> PAYMENT__PAYMENT_RENTAL_ID_FKEY = Internal.createForeignKey(Payment.PAYMENT, DSL.name("payment_rental_id_fkey"), new TableField[] { Payment.PAYMENT.RENTAL_ID }, Keys.RENTAL_PKEY, new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final ForeignKey<PaymentRecord, StaffRecord> PAYMENT__PAYMENT_STAFF_ID_FKEY = Internal.createForeignKey(Payment.PAYMENT, DSL.name("payment_staff_id_fkey"), new TableField[] { Payment.PAYMENT.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<PaymentP2007_01Record, CustomerRecord> PAYMENT_P2007_01__PAYMENT_P2007_01_CUSTOMER_ID_FKEY = Internal.createForeignKey(PaymentP2007_01.PAYMENT_P2007_01, DSL.name("payment_p2007_01_customer_id_fkey"), new TableField[] { PaymentP2007_01.PAYMENT_P2007_01.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<PaymentP2007_01Record, RentalRecord> PAYMENT_P2007_01__PAYMENT_P2007_01_RENTAL_ID_FKEY = Internal.createForeignKey(PaymentP2007_01.PAYMENT_P2007_01, DSL.name("payment_p2007_01_rental_id_fkey"), new TableField[] { PaymentP2007_01.PAYMENT_P2007_01.RENTAL_ID }, Keys.RENTAL_PKEY, new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final ForeignKey<PaymentP2007_01Record, StaffRecord> PAYMENT_P2007_01__PAYMENT_P2007_01_STAFF_ID_FKEY = Internal.createForeignKey(PaymentP2007_01.PAYMENT_P2007_01, DSL.name("payment_p2007_01_staff_id_fkey"), new TableField[] { PaymentP2007_01.PAYMENT_P2007_01.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<PaymentP2007_02Record, CustomerRecord> PAYMENT_P2007_02__PAYMENT_P2007_02_CUSTOMER_ID_FKEY = Internal.createForeignKey(PaymentP2007_02.PAYMENT_P2007_02, DSL.name("payment_p2007_02_customer_id_fkey"), new TableField[] { PaymentP2007_02.PAYMENT_P2007_02.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<PaymentP2007_02Record, RentalRecord> PAYMENT_P2007_02__PAYMENT_P2007_02_RENTAL_ID_FKEY = Internal.createForeignKey(PaymentP2007_02.PAYMENT_P2007_02, DSL.name("payment_p2007_02_rental_id_fkey"), new TableField[] { PaymentP2007_02.PAYMENT_P2007_02.RENTAL_ID }, Keys.RENTAL_PKEY, new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final ForeignKey<PaymentP2007_02Record, StaffRecord> PAYMENT_P2007_02__PAYMENT_P2007_02_STAFF_ID_FKEY = Internal.createForeignKey(PaymentP2007_02.PAYMENT_P2007_02, DSL.name("payment_p2007_02_staff_id_fkey"), new TableField[] { PaymentP2007_02.PAYMENT_P2007_02.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<PaymentP2007_03Record, CustomerRecord> PAYMENT_P2007_03__PAYMENT_P2007_03_CUSTOMER_ID_FKEY = Internal.createForeignKey(PaymentP2007_03.PAYMENT_P2007_03, DSL.name("payment_p2007_03_customer_id_fkey"), new TableField[] { PaymentP2007_03.PAYMENT_P2007_03.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<PaymentP2007_03Record, RentalRecord> PAYMENT_P2007_03__PAYMENT_P2007_03_RENTAL_ID_FKEY = Internal.createForeignKey(PaymentP2007_03.PAYMENT_P2007_03, DSL.name("payment_p2007_03_rental_id_fkey"), new TableField[] { PaymentP2007_03.PAYMENT_P2007_03.RENTAL_ID }, Keys.RENTAL_PKEY, new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final ForeignKey<PaymentP2007_03Record, StaffRecord> PAYMENT_P2007_03__PAYMENT_P2007_03_STAFF_ID_FKEY = Internal.createForeignKey(PaymentP2007_03.PAYMENT_P2007_03, DSL.name("payment_p2007_03_staff_id_fkey"), new TableField[] { PaymentP2007_03.PAYMENT_P2007_03.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<PaymentP2007_04Record, CustomerRecord> PAYMENT_P2007_04__PAYMENT_P2007_04_CUSTOMER_ID_FKEY = Internal.createForeignKey(PaymentP2007_04.PAYMENT_P2007_04, DSL.name("payment_p2007_04_customer_id_fkey"), new TableField[] { PaymentP2007_04.PAYMENT_P2007_04.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<PaymentP2007_04Record, RentalRecord> PAYMENT_P2007_04__PAYMENT_P2007_04_RENTAL_ID_FKEY = Internal.createForeignKey(PaymentP2007_04.PAYMENT_P2007_04, DSL.name("payment_p2007_04_rental_id_fkey"), new TableField[] { PaymentP2007_04.PAYMENT_P2007_04.RENTAL_ID }, Keys.RENTAL_PKEY, new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final ForeignKey<PaymentP2007_04Record, StaffRecord> PAYMENT_P2007_04__PAYMENT_P2007_04_STAFF_ID_FKEY = Internal.createForeignKey(PaymentP2007_04.PAYMENT_P2007_04, DSL.name("payment_p2007_04_staff_id_fkey"), new TableField[] { PaymentP2007_04.PAYMENT_P2007_04.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<PaymentP2007_05Record, CustomerRecord> PAYMENT_P2007_05__PAYMENT_P2007_05_CUSTOMER_ID_FKEY = Internal.createForeignKey(PaymentP2007_05.PAYMENT_P2007_05, DSL.name("payment_p2007_05_customer_id_fkey"), new TableField[] { PaymentP2007_05.PAYMENT_P2007_05.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<PaymentP2007_05Record, RentalRecord> PAYMENT_P2007_05__PAYMENT_P2007_05_RENTAL_ID_FKEY = Internal.createForeignKey(PaymentP2007_05.PAYMENT_P2007_05, DSL.name("payment_p2007_05_rental_id_fkey"), new TableField[] { PaymentP2007_05.PAYMENT_P2007_05.RENTAL_ID }, Keys.RENTAL_PKEY, new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final ForeignKey<PaymentP2007_05Record, StaffRecord> PAYMENT_P2007_05__PAYMENT_P2007_05_STAFF_ID_FKEY = Internal.createForeignKey(PaymentP2007_05.PAYMENT_P2007_05, DSL.name("payment_p2007_05_staff_id_fkey"), new TableField[] { PaymentP2007_05.PAYMENT_P2007_05.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<PaymentP2007_06Record, CustomerRecord> PAYMENT_P2007_06__PAYMENT_P2007_06_CUSTOMER_ID_FKEY = Internal.createForeignKey(PaymentP2007_06.PAYMENT_P2007_06, DSL.name("payment_p2007_06_customer_id_fkey"), new TableField[] { PaymentP2007_06.PAYMENT_P2007_06.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<PaymentP2007_06Record, RentalRecord> PAYMENT_P2007_06__PAYMENT_P2007_06_RENTAL_ID_FKEY = Internal.createForeignKey(PaymentP2007_06.PAYMENT_P2007_06, DSL.name("payment_p2007_06_rental_id_fkey"), new TableField[] { PaymentP2007_06.PAYMENT_P2007_06.RENTAL_ID }, Keys.RENTAL_PKEY, new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final ForeignKey<PaymentP2007_06Record, StaffRecord> PAYMENT_P2007_06__PAYMENT_P2007_06_STAFF_ID_FKEY = Internal.createForeignKey(PaymentP2007_06.PAYMENT_P2007_06, DSL.name("payment_p2007_06_staff_id_fkey"), new TableField[] { PaymentP2007_06.PAYMENT_P2007_06.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<RentalRecord, CustomerRecord> RENTAL__RENTAL_CUSTOMER_ID_FKEY = Internal.createForeignKey(Rental.RENTAL, DSL.name("rental_customer_id_fkey"), new TableField[] { Rental.RENTAL.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<RentalRecord, InventoryRecord> RENTAL__RENTAL_INVENTORY_ID_FKEY = Internal.createForeignKey(Rental.RENTAL, DSL.name("rental_inventory_id_fkey"), new TableField[] { Rental.RENTAL.INVENTORY_ID }, Keys.INVENTORY_PKEY, new TableField[] { Inventory.INVENTORY.INVENTORY_ID }, true);
    public static final ForeignKey<RentalRecord, StaffRecord> RENTAL__RENTAL_STAFF_ID_FKEY = Internal.createForeignKey(Rental.RENTAL, DSL.name("rental_staff_id_fkey"), new TableField[] { Rental.RENTAL.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<StaffRecord, AddressRecord> STAFF__STAFF_ADDRESS_ID_FKEY = Internal.createForeignKey(Staff.STAFF, DSL.name("staff_address_id_fkey"), new TableField[] { Staff.STAFF.ADDRESS_ID }, Keys.ADDRESS_PKEY, new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final ForeignKey<StaffRecord, StoreRecord> STAFF__STAFF_STORE_ID_FKEY = Internal.createForeignKey(Staff.STAFF, DSL.name("staff_store_id_fkey"), new TableField[] { Staff.STAFF.STORE_ID }, Keys.STORE_PKEY, new TableField[] { Store.STORE.STORE_ID }, true);
    public static final ForeignKey<StoreRecord, AddressRecord> STORE__STORE_ADDRESS_ID_FKEY = Internal.createForeignKey(Store.STORE, DSL.name("store_address_id_fkey"), new TableField[] { Store.STORE.ADDRESS_ID }, Keys.ADDRESS_PKEY, new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final ForeignKey<StoreRecord, StaffRecord> STORE__STORE_MANAGER_STAFF_ID_FKEY = Internal.createForeignKey(Store.STORE, DSL.name("store_manager_staff_id_fkey"), new TableField[] { Store.STORE.MANAGER_STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
}
