curl -X POST -u admin:admin   'http://localhost:7180/api/v1/clusters/Sid/services/hive/commands/stop'

        {
          "id" : 530,
          "name" : "Stop",
          "startTime" : "2017-06-05T17:42:11.200Z",
          "active" : true,
          "serviceRef" : {
            "clusterName" : "cluster",
            "serviceName" : "hive"
          }
        }
curl -X POST -u admin:admin   'http://localhost:7180/api/v1/clusters/Sid/services/hive/commands/start'

        {
          "id" : 533,
          "name" : "Start",
          "startTime" : "2017-06-05T17:42:47.373Z",
          "active" : true,
          "serviceRef" : {
            "clusterName" : "cluster",
            "serviceName" : "hive"
          }
        }

