package demo;

/**
 * Copyright: Copyright (c) 2002-2014
 * Company: Reflexion Networks, Inc.
 * Created: August 2014
 *
 * @author droyer@reflexion.net
 */

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * @author droyer@reflexion.net
 */
@Configuration
public class PersistenceConfig
    implements TransactionManagementConfigurer
{
    @Inject
    private DataSource dataSource;

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager ( )
    {
        return
            new DataSourceTransactionManager(
                dataSource
            );
    }
}
