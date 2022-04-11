//package com.alan.springbatchpractice.config;
//
//import org.apache.ibatis.session.ExecutorType;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//
//@Configuration
//@MapperScan(value = "com.alan.monitor1.mapper", sqlSessionFactoryRef="db1SqlSessionFactory")
//@EnableTransactionManagement
//public class DataSourceConfig {
//
//    @Bean(name = "db1DataSource")
//    @Primary
//    @ConfigurationProperties(prefix = "spring.db1.datasource")
//    public DataSource db1DataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "db1SqlSessionFactory")
//    @Primary
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("db1DataSource") DataSource dataSource, ApplicationContext applicationContext) throws Exception{
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
////        Resource[] arrResource = new PathMatchingResourcePatternResolver()
////                .getResources("classpath:mapper/order/**/*Mapper.xml");
//        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/order/**/*Mapper.xml"));
//        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean(name = "db1SqlSessionTemplate")
//    @Primary public SqlSessionTemplate db1SqlSessionTemplate(SqlSessionFactory db1SqlSessionFactory) throws Exception {
//        return new SqlSessionTemplate(db1SqlSessionFactory);
//    }
//
//    @Bean(name = "db1BatchSqlSessionTemplate")
//    public SqlSessionTemplate db1BatchSqlSessionTemplate(@Qualifier("db1SqlSessionFactory") SqlSessionFactory cmsSqlSessionFactory) throws Exception {
//        return new SqlSessionTemplate(cmsSqlSessionFactory, ExecutorType.BATCH);
//    }
//
////    @Primary
////    @Bean(name = "db1TransactionManager")
////    public PlatformTransactionManager transactionManager(@Qualifier("db1DataSource") DataSource dataSource){
////        return new DataSourceTransactionManager(dataSource);
////    }
//
//}