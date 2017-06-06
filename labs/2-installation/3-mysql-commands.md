MySQL commands:

    mysql -p -u root
    
    mysql> status
    --------------
    mysql  Ver 14.14 Distrib 5.5.55, for debian-linux-gnu (x86_64) using readline 6.3
    
    Connection id:		53
    Current database:	
    Current user:		root@localhost
    SSL:			Not in use
    Current pager:		stdout
    Using outfile:		''
    Using delimiter:	;
    Server version:		5.5.55-0ubuntu0.14.04.1 (Ubuntu)
    Protocol version:	10
    Connection:		Localhost via UNIX socket
    Server characterset:	latin1
    Db     characterset:	latin1
    Client characterset:	utf8
    Conn.  characterset:	utf8
    UNIX socket:		/var/run/mysqld/mysqld.sock
    Uptime:			1 hour 6 min 17 sec
    
    Threads: 1  Questions: 638  Slow queries: 0  Opens: 189  Flush tables: 1  Open tables: 41  Queries per second avg: 0.160
    
List of databases:

    mysql> show databases;
    +--------------------+
    | Database           |
    +--------------------+
    | information_schema |
    | mysql              |
    | performance_schema |
    +--------------------+
    3 rows in set (0.00 sec)
