package com.mt.DBTransfer.utils;

import com.mt.DBTransfer.domain.DBTransEntity;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DbExecutor {

    private DBTransEntity dbTransEntity;

    public DbExecutor(DBTransEntity dbTransEntity) {
        super();
        this.dbTransEntity = dbTransEntity;
    }

    public void execute(String sql,Object[] params) throws ClassNotFoundException, SQLException {
            Class.forName(this.dbTransEntity.driverName());
            Connection connection = DriverManager.getConnection(this.dbTransEntity.jdbcUrl(),
                    this.dbTransEntity.getUsername(), this.dbTransEntity.getPassword());
            QueryRunner qRunner = new QueryRunner();
            qRunner.update(connection, sql,params);
            connection.close();
    }

    public <T> List<T> query(String sql,Class<T> clz) throws SQLException, ClassNotFoundException {
        //Class.forName(this.dbTransEntity.driverName());
        Connection connection = DriverManager.getConnection(this.dbTransEntity.jdbcUrl(),
                this.dbTransEntity.getUsername(), this.dbTransEntity.getPassword());
        QueryRunner qRunner = new QueryRunner();
        return qRunner.query(connection, sql, new BeanListHandler<>(clz));
    }
}
