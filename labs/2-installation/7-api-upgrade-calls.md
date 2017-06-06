Report the latest available version of the API

    curl -u admin:admin 'http://localhost:7180/api/version'
    
        v16

Report the CM version

    curl -u admin:admin 'http://localhost:7180/api/v16/cm/version'
        {
          "version" : "5.11.0",
          "buildUser" : "jenkins",
          "buildTimestamp" : "20170412-1255",
          "gitHash" : "70cb1442626406432a6e7af5bdf206a384ca3f98",
          "snapshot" : false
        }

List all CM users

        curl -u admin:admin 'http://localhost:7180/api/v16/users'
        {
          "items" : [ {
            "name" : "admin",
            "roles" : [ "ROLE_ADMIN" ]
          } ]
        }

Report the database server in use by CM
     
     curl -u admin:admin 'http://localhost:7180/api/v1/clusters/Sid/services/oozie/config'
        {
          "roleTypeConfigs" : [ {
            "roleType" : "OOZIE_SERVER",
            "items" : [ {
              "name" : "oozie_database_host",
              "value" : "localhost:3306"
            }, {
              "name" : "oozie_database_name",
              "value" : "oozie_oozie_server"
            }, {
              "name" : "oozie_database_password",
              "value" : "Sid@123"
            }, {
              "name" : "oozie_database_type",
              "value" : "mysql"
            }, {
              "name" : "oozie_database_user",
              "value" : "oozie_server"
            }, {
              "name" : "oozie_java_heapsize",
              "value" : "134217728"
            } ]
          } ],
          "items" : [ {
            "name" : "hive_service",
            "value" : "hive"
          }, {
            "name" : "mapreduce_yarn_service",
            "value" : "yarn"
          }, {
            "name" : "zookeeper_service",
            "value" : "zookeeper"
          } ]
        }
