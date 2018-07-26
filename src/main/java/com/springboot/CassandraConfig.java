package com.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
//Enable these fields and class state and behaviours if you do not want auto configurations
//@EnableCassandraRepositories(
//		  basePackages = "com.springboot")
public class CassandraConfig {// extends AbstractCassandraConfiguration {

	/*@Value("${api.cassandra.keyspace}")
	private String key_space;

	@Value("${api.cassandra.host}")
	private String contact_point;

	@Value("${api.cassandra.port}")
	private int port;

	@Override
	protected String getKeyspaceName() {
		return key_space;
	}

	// If you want to form a cluster, see baeldung example
	@Bean
	public CassandraClusterFactoryBean cluster() {
		CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
		cluster.setContactPoints(contact_point);
		cluster.setPort(port);
		return cluster;
	}

	@Bean
	public CassandraMappingContext cassandraMapping() throws ClassNotFoundException {
		return new BasicCassandraMappingContext();
	}*/
}