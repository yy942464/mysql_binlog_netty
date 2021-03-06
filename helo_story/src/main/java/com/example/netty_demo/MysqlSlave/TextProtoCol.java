package com.example.netty_demo.MysqlSlave;

/*
 * @author ZZQ
 * @Date 2022/4/13 4:08 下午
 */
public enum TextProtoCol {
    /**
     * Internal server command.
     */
    SLEEP,
    /**
     * Used to inform the server that client wants to close the connection.
     */
    QUIT,
    /**
     * Used to change the default schema of the connection.
     */
    INIT_DB,
    /**
     * Used to send the server a text-based query that is executed immediately.
     */
    QUERY,
    /**
     * Used to get column definitions of the specific table.
     */
    FIELD_LIST,
    /**
     * Used to create new schema.
     */
    CREATE_DB,
    /**
     * Used to drop existing schema.
     */
    DROP_DB,
    /**
     * A low-level version of several FLUSH ... and RESET ... commands.
     */
    REFRESH,
    /**
     * Used to shutdown the mysql-server.
     */
    SHUTDOWN,
    /**
     * Used to get a human readable string of internal statistics.
     */
    STATISTICS,
    /**
     * Used to get a list of active threads.
     */
    PROCESS_INFO,
    /**
     * Internal server command.
     */
    CONNECT,
    /**
     * Used to ask the server to terminate the connection.
     */
    PROCESS_KILL,
    /**
     * Triggers a dump on internal debug info to stdout of the mysql-server.
     */
    DEBUG,
    /**
     * Used to check if the server is alive.
     */
    PING,
    /**
     * Internal server command.
     */
    TIME,
    /**
     * Internal server command.
     */
    DELAYED_INSERT,
    /**
     * Used to change user of the current connection and reset the connection state.
     */
    CHANGE_USER,
    /**
     * Requests a binary log network stream from the master starting a given position.
     */
    BINLOG_DUMP,
    /**
     * Used to dump a specific table.
     */
    TABLE_DUMP,
    /**
     * Internal server command.
     */
    CONNECT_OUT,
    /**
     * Registers a slave at the master. Should be sent before requesting a binary log events with {@link #BINLOG_DUMP}.
     */
    REGISTER_SLAVE,
    /**
     * Creates a prepared statement from the passed query string.
     */
    STMT_PREPARE,
    /**
     * Used to execute a prepared statement as identified by statement id.
     */
    STMT_EXECUTE,
    /**
     * Used to send some data for a column.
     */
    STMT_SEND_LONG_DATA,
    /**
     * Deallocates a prepared statement.
     */
    STMT_CLOSE,
    /**
     * Resets the data of a prepared statement which was accumulated with {@link #STMT_SEND_LONG_DATA} commands.
     */
    STMT_RESET,
    /**
     * Allows to enable and disable {@link com.github.shyiko.mysql.binlog.network.ClientCapabilities#MULTI_STATEMENTS}
     * for the current connection.
     */
    SET_OPTION,
    /**
     * Fetch a row from a existing resultset after a {@link #STMT_EXECUTE}.
     */
    STMT_FETCH,
    /**
     * Internal server command.
     */
    DAEMON,
    /**
     * Used to request the binary log network stream based on a GTID.
     */
    BINLOG_DUMP_GTID;
}
