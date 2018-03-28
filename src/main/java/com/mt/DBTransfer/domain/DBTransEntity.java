package com.mt.DBTransfer.domain;

public class DBTransEntity {
    private String ip;
    private int port;
    private String dbType;
    private String table;
    private String dbInstance;
    private String username;
    private String password;
    private String driverName;
    
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDbType() {
        return this.dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getTable() {
        return this.table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getDbInstance() {
        return this.dbInstance;
    }

    public void setDbInstance(String dbInstance) {
        this.dbInstance = dbInstance;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    
    //TODO
    public String jdbcUrl() {
        if ("sqlserver".equals(dbType)) {
            return "jdbc:"+ dbType + "://" + ip + ":" + port +";" + "databaseName="+dbInstance;
        }
        return "jdbc:"+ dbType + "://" + ip + ":" + port +"/" + dbInstance;
    }

    public String driverName(){
        if ("sqlserver".equals(dbType)) {
            return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        }else if ("postgresql".equals(dbType)) {
            return "org.postgresql.Driver";
        }
        throw new RuntimeException("No such driver");
    }

}
