package com.jooq.demo;

import org.jooq.DSLContext;
import org.jooq.conf.Settings;

import static com.jooq.demo.config.DatasourceConfig.createDataSource;
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.impl.DSL.using;

public class Demo {

    public static DSLContext dsl() {
        final DSLContext dsl = using(
                createDataSource(),
                POSTGRES,
                new Settings().withRenderFormatted(true)
        );
        return dsl;
    }

    public static final DSLContext ctx = using(
            createDataSource(),
            POSTGRES,
            new Settings().withRenderFormatted(true) // true ajoute des sauts de lignes
    );


    public static void title(Object title) {
        println("");
        println(title);
        println("-".repeat(("" + title).length()));
    }

    public static <T> T println(T t) {
        System.out.println(t);
        return t;
    }
}
