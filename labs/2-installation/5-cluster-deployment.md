    {
      "timestamp" : "2017-06-05T17:40:49.343Z",
      "clusters" : [ {
        "name" : "cluster",
        "displayName" : "Sid",
        "version" : "CDH5",
        "fullVersion" : "5.8.3",
        "services" : [ {
          "name" : "zookeeper",
          "type" : "ZOOKEEPER",
          "config" : {
            "items" : [ {
              "name" : "service_config_suppression_server_count_validator",
              "value" : "true"
            } ]
          },
          "roles" : [ {
            "name" : "zookeeper-SERVER-fa65012143adc051f5c061600b7c6f2d",
            "type" : "SERVER",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "role_jceks_password",
                "value" : "96r1nghvgs7tk4lt4x175c8zt"
              }, {
                "name" : "serverId",
                "value" : "1"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "zookeeper-SERVER-BASE"
            }
          } ],
          "displayName" : "ZooKeeper",
          "roleConfigGroups" : [ {
            "name" : "zookeeper-SERVER-BASE",
            "displayName" : "Server Default Group",
            "roleType" : "SERVER",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "zookeeper"
            },
            "config" : {
              "items" : [ {
                "name" : "zookeeper_server_java_heapsize",
                "value" : "134217728"
              } ]
            }
          } ]
        }, {
          "name" : "oozie",
          "type" : "OOZIE",
          "config" : {
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
          },
          "roles" : [ {
            "name" : "oozie-OOZIE_SERVER-fa65012143adc051f5c061600b7c6f2d",
            "type" : "OOZIE_SERVER",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "role_jceks_password",
                "value" : "e2ed5hrm3dn3ng6td0615t0v0"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "oozie-OOZIE_SERVER-BASE"
            }
          } ],
          "displayName" : "Oozie",
          "roleConfigGroups" : [ {
            "name" : "oozie-OOZIE_SERVER-BASE",
            "displayName" : "Oozie Server Default Group",
            "roleType" : "OOZIE_SERVER",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "oozie"
            },
            "config" : {
              "items" : [ {
                "name" : "oozie_database_host",
                "value" : "localhost:3306"
              }, {
                "name" : "oozie_database_name",
                "value" : "oozie_oozie_server"
              }, {
                "name" : "oozie_database_password",
                "value" : ""
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
            }
          } ]
        }, {
          "name" : "hue",
          "type" : "HUE",
          "config" : {
            "items" : [ {
              "name" : "database_password",
              "value" : ""
            }, {
              "name" : "database_type",
              "value" : "mysql"
            }, {
              "name" : "hive_service",
              "value" : "hive"
            }, {
              "name" : "hue_webhdfs",
              "value" : "hdfs-NAMENODE-fa65012143adc051f5c061600b7c6f2d"
            }, {
              "name" : "oozie_service",
              "value" : "oozie"
            }, {
              "name" : "zookeeper_service",
              "value" : "zookeeper"
            } ]
          },
          "roles" : [ {
            "name" : "hue-HUE_SERVER-fa65012143adc051f5c061600b7c6f2d",
            "type" : "HUE_SERVER",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "role_jceks_password",
                "value" : "4rx2ryhi32zh32rnj8ctj8yhx"
              }, {
                "name" : "secret_key",
                "value" : "EAiqty1xWSdIMlrGrqEzKIQgpEOUiU"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "hue-HUE_SERVER-BASE"
            }
          } ],
          "displayName" : "Hue",
          "roleConfigGroups" : [ {
            "name" : "hue-HUE_LOAD_BALANCER-BASE",
            "displayName" : "Load Balancer Default Group",
            "roleType" : "HUE_LOAD_BALANCER",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hue"
            },
            "config" : {
              "items" : [ ]
            }
          }, {
            "name" : "hue-HUE_SERVER-BASE",
            "displayName" : "Hue Server Default Group",
            "roleType" : "HUE_SERVER",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hue"
            },
            "config" : {
              "items" : [ ]
            }
          }, {
            "name" : "hue-KT_RENEWER-BASE",
            "displayName" : "Kerberos Ticket Renewer Default Group",
            "roleType" : "KT_RENEWER",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hue"
            },
            "config" : {
              "items" : [ ]
            }
          } ]
        }, {
          "name" : "hdfs",
          "type" : "HDFS",
          "config" : {
            "items" : [ {
              "name" : "dfs_ha_fencing_cloudera_manager_secret_key",
              "value" : "SRJ9UXXUpUGF1KMFn5VzydMurYvuuS"
            }, {
              "name" : "dfs_replication",
              "value" : "1"
            }, {
              "name" : "fc_authorization_secret_key",
              "value" : "xI4Sf8XzxTudo18ikLFqUdCUpULQ6h"
            }, {
              "name" : "http_auth_signature_secret",
              "value" : "ZTBaXm9grt4LvVQjUOQRSMiYbpzt2O"
            }, {
              "name" : "rm_dirty",
              "value" : "true"
            }, {
              "name" : "service_config_suppression_datanode_count_validator",
              "value" : "true"
            }, {
              "name" : "zookeeper_service",
              "value" : "zookeeper"
            } ]
          },
          "roles" : [ {
            "name" : "hdfs-BALANCER-fa65012143adc051f5c061600b7c6f2d",
            "type" : "BALANCER",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "hdfs-BALANCER-BASE"
            }
          }, {
            "name" : "hdfs-DATANODE-fa65012143adc051f5c061600b7c6f2d",
            "type" : "DATANODE",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "role_jceks_password",
                "value" : "8l7qh00xhijtncmai31z6ypbu"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "hdfs-DATANODE-BASE"
            }
          }, {
            "name" : "hdfs-NAMENODE-fa65012143adc051f5c061600b7c6f2d",
            "type" : "NAMENODE",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "namenode_id",
                "value" : "34"
              }, {
                "name" : "role_jceks_password",
                "value" : "cbd0bsvz0plexzl5f6no2bjfc"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "hdfs-NAMENODE-BASE"
            }
          }, {
            "name" : "hdfs-SECONDARYNAMENODE-fa65012143adc051f5c061600b7c6f2d",
            "type" : "SECONDARYNAMENODE",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "role_jceks_password",
                "value" : "8zrvemtmufi93o6odgm5j6tge"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "hdfs-SECONDARYNAMENODE-BASE"
            }
          } ],
          "displayName" : "HDFS",
          "roleConfigGroups" : [ {
            "name" : "hdfs-BALANCER-BASE",
            "displayName" : "Balancer Default Group",
            "roleType" : "BALANCER",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hdfs"
            },
            "config" : {
              "items" : [ {
                "name" : "balancer_java_heapsize",
                "value" : "134217728"
              } ]
            }
          }, {
            "name" : "hdfs-DATANODE-BASE",
            "displayName" : "DataNode Default Group",
            "roleType" : "DATANODE",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hdfs"
            },
            "config" : {
              "items" : [ {
                "name" : "datanode_java_heapsize",
                "value" : "134217728"
              }, {
                "name" : "dfs_data_dir_list",
                "value" : "/dfs/dn"
              }, {
                "name" : "dfs_datanode_du_reserved",
                "value" : "134217728"
              }, {
                "name" : "dfs_datanode_max_locked_memory",
                "value" : "175112192"
              } ]
            }
          }, {
            "name" : "hdfs-FAILOVERCONTROLLER-BASE",
            "displayName" : "Failover Controller Default Group",
            "roleType" : "FAILOVERCONTROLLER",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hdfs"
            },
            "config" : {
              "items" : [ ]
            }
          }, {
            "name" : "hdfs-GATEWAY-BASE",
            "displayName" : "Gateway Default Group",
            "roleType" : "GATEWAY",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hdfs"
            },
            "config" : {
              "items" : [ {
                "name" : "dfs_client_use_trash",
                "value" : "true"
              } ]
            }
          }, {
            "name" : "hdfs-HTTPFS-BASE",
            "displayName" : "HttpFS Default Group",
            "roleType" : "HTTPFS",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hdfs"
            },
            "config" : {
              "items" : [ ]
            }
          }, {
            "name" : "hdfs-JOURNALNODE-BASE",
            "displayName" : "JournalNode Default Group",
            "roleType" : "JOURNALNODE",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hdfs"
            },
            "config" : {
              "items" : [ ]
            }
          }, {
            "name" : "hdfs-NAMENODE-BASE",
            "displayName" : "NameNode Default Group",
            "roleType" : "NAMENODE",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hdfs"
            },
            "config" : {
              "items" : [ {
                "name" : "dfs_name_dir_list",
                "value" : "/dfs/nn"
              }, {
                "name" : "dfs_namenode_servicerpc_address",
                "value" : "8022"
              }, {
                "name" : "namenode_java_heapsize",
                "value" : "134217728"
              } ]
            }
          }, {
            "name" : "hdfs-NFSGATEWAY-BASE",
            "displayName" : "NFS Gateway Default Group",
            "roleType" : "NFSGATEWAY",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hdfs"
            },
            "config" : {
              "items" : [ ]
            }
          }, {
            "name" : "hdfs-SECONDARYNAMENODE-BASE",
            "displayName" : "SecondaryNameNode Default Group",
            "roleType" : "SECONDARYNAMENODE",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hdfs"
            },
            "config" : {
              "items" : [ {
                "name" : "fs_checkpoint_dir_list",
                "value" : "/dfs/snn"
              }, {
                "name" : "secondary_namenode_java_heapsize",
                "value" : "134217728"
              } ]
            }
          } ],
          "replicationSchedules" : [ ],
          "snapshotPolicies" : [ ]
        }, {
          "name" : "yarn",
          "type" : "YARN",
          "config" : {
            "items" : [ {
              "name" : "hdfs_service",
              "value" : "hdfs"
            }, {
              "name" : "rm_dirty",
              "value" : "true"
            }, {
              "name" : "zk_authorization_secret_key",
              "value" : "8MpWOpfXS9aisQ2TEOSEoQDP7MFv1C"
            }, {
              "name" : "zookeeper_service",
              "value" : "zookeeper"
            } ]
          },
          "roles" : [ {
            "name" : "yarn-JOBHISTORY-fa65012143adc051f5c061600b7c6f2d",
            "type" : "JOBHISTORY",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "role_jceks_password",
                "value" : "46o4lecqc0d5788wxw3mba8a9"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "yarn-JOBHISTORY-BASE"
            }
          }, {
            "name" : "yarn-NODEMANAGER-fa65012143adc051f5c061600b7c6f2d",
            "type" : "NODEMANAGER",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "role_jceks_password",
                "value" : "37c88d2w6absw48b7fbmob4py"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "yarn-NODEMANAGER-BASE"
            }
          }, {
            "name" : "yarn-RESOURCEMANAGER-fa65012143adc051f5c061600b7c6f2d",
            "type" : "RESOURCEMANAGER",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "rm_id",
                "value" : "32"
              }, {
                "name" : "role_jceks_password",
                "value" : "dga5njmzd7y13j12ycsc4rz2c"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "yarn-RESOURCEMANAGER-BASE"
            }
          } ],
          "displayName" : "YARN (MR2 Included)",
          "roleConfigGroups" : [ {
            "name" : "yarn-GATEWAY-BASE",
            "displayName" : "Gateway Default Group",
            "roleType" : "GATEWAY",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "yarn"
            },
            "config" : {
              "items" : [ {
                "name" : "mapred_reduce_tasks",
                "value" : "2"
              }, {
                "name" : "mapred_submit_replication",
                "value" : "1"
              } ]
            }
          }, {
            "name" : "yarn-JOBHISTORY-BASE",
            "displayName" : "JobHistory Server Default Group",
            "roleType" : "JOBHISTORY",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "yarn"
            },
            "config" : {
              "items" : [ {
                "name" : "mr2_jobhistory_java_heapsize",
                "value" : "134217728"
              } ]
            }
          }, {
            "name" : "yarn-NODEMANAGER-BASE",
            "displayName" : "NodeManager Default Group",
            "roleType" : "NODEMANAGER",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "yarn"
            },
            "config" : {
              "items" : [ {
                "name" : "node_manager_java_heapsize",
                "value" : "134217728"
              }, {
                "name" : "yarn_nodemanager_heartbeat_interval_ms",
                "value" : "100"
              }, {
                "name" : "yarn_nodemanager_local_dirs",
                "value" : "/yarn/nm"
              }, {
                "name" : "yarn_nodemanager_log_dirs",
                "value" : "/yarn/container-logs"
              }, {
                "name" : "yarn_nodemanager_resource_cpu_vcores",
                "value" : "4"
              }, {
                "name" : "yarn_nodemanager_resource_memory_mb",
                "value" : "1024"
              } ]
            }
          }, {
            "name" : "yarn-RESOURCEMANAGER-BASE",
            "displayName" : "ResourceManager Default Group",
            "roleType" : "RESOURCEMANAGER",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "yarn"
            },
            "config" : {
              "items" : [ {
                "name" : "resource_manager_java_heapsize",
                "value" : "134217728"
              }, {
                "name" : "yarn_scheduler_maximum_allocation_mb",
                "value" : "1024"
              }, {
                "name" : "yarn_scheduler_maximum_allocation_vcores",
                "value" : "4"
              } ]
            }
          } ]
        }, {
          "name" : "hive",
          "type" : "HIVE",
          "config" : {
            "items" : [ {
              "name" : "hive_metastore_database_name",
              "value" : "hive"
            }, {
              "name" : "hive_metastore_database_password",
              "value" : ""
            }, {
              "name" : "mapreduce_yarn_service",
              "value" : "yarn"
            }, {
              "name" : "zookeeper_service",
              "value" : "zookeeper"
            } ]
          },
          "roles" : [ {
            "name" : "hive-GATEWAY-fa65012143adc051f5c061600b7c6f2d",
            "type" : "GATEWAY",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "hive-GATEWAY-BASE"
            }
          }, {
            "name" : "hive-HIVEMETASTORE-fa65012143adc051f5c061600b7c6f2d",
            "type" : "HIVEMETASTORE",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "role_jceks_password",
                "value" : "855dqh7n1dbch99j2i6z82nt0"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "hive-HIVEMETASTORE-BASE"
            }
          }, {
            "name" : "hive-HIVESERVER2-fa65012143adc051f5c061600b7c6f2d",
            "type" : "HIVESERVER2",
            "hostRef" : {
              "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
            },
            "config" : {
              "items" : [ {
                "name" : "role_jceks_password",
                "value" : "d3njmf33ym8oo4x0rsm3cc8km"
              } ]
            },
            "roleConfigGroupRef" : {
              "roleConfigGroupName" : "hive-HIVESERVER2-BASE"
            }
          } ],
          "displayName" : "Hive",
          "roleConfigGroups" : [ {
            "name" : "hive-GATEWAY-BASE",
            "displayName" : "Gateway Default Group",
            "roleType" : "GATEWAY",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hive"
            },
            "config" : {
              "items" : [ ]
            }
          }, {
            "name" : "hive-HIVEMETASTORE-BASE",
            "displayName" : "Hive Metastore Server Default Group",
            "roleType" : "HIVEMETASTORE",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hive"
            },
            "config" : {
              "items" : [ {
                "name" : "hive_metastore_java_heapsize",
                "value" : "134217728"
              } ]
            }
          }, {
            "name" : "hive-HIVESERVER2-BASE",
            "displayName" : "HiveServer2 Default Group",
            "roleType" : "HIVESERVER2",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hive"
            },
            "config" : {
              "items" : [ {
                "name" : "hiveserver2_java_heapsize",
                "value" : "134217728"
              }, {
                "name" : "hiveserver2_spark_driver_memory",
                "value" : "966367641"
              }, {
                "name" : "hiveserver2_spark_executor_cores",
                "value" : "4"
              }, {
                "name" : "hiveserver2_spark_executor_memory",
                "value" : "912680550"
              }, {
                "name" : "hiveserver2_spark_yarn_driver_memory_overhead",
                "value" : "102"
              }, {
                "name" : "hiveserver2_spark_yarn_executor_memory_overhead",
                "value" : "153"
              } ]
            }
          }, {
            "name" : "hive-WEBHCAT-BASE",
            "displayName" : "WebHCat Server Default Group",
            "roleType" : "WEBHCAT",
            "base" : true,
            "serviceRef" : {
              "clusterName" : "cluster",
              "serviceName" : "hive"
            },
            "config" : {
              "items" : [ ]
            }
          } ],
          "replicationSchedules" : [ ]
        } ],
        "parcels" : [ {
          "product" : "CDH",
          "version" : "5.8.3-1.cdh5.8.3.p0.2",
          "stage" : "DISTRIBUTED",
          "clusterRef" : {
            "clusterName" : "cluster"
          }
        }, {
          "product" : "CDH",
          "version" : "5.8.3-1.cdh5.8.3.p0.2",
          "stage" : "ACTIVATED",
          "clusterRef" : {
            "clusterName" : "cluster"
          }
        } ]
      } ],
      "hosts" : [ {
        "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791",
        "ipAddress" : "127.0.0.1",
        "hostname" : "localhost",
        "rackId" : "/default",
        "config" : {
          "items" : [ {
            "name" : "host_health_suppression_host_clock_offset",
            "value" : "true"
          } ]
        }
      }, {
        "hostId" : "da25e5b2-775c-4613-8d48-19ecd76d0fb8",
        "ipAddress" : "127.0.1.1",
        "hostname" : "sid-HP-Pavilion-Notebook",
        "rackId" : "/default",
        "config" : {
          "items" : [ ]
        }
      } ],
      "users" : [ {
        "name" : "__cloudera_internal_user__mgmt-EVENTSERVER-fa65012143adc051f5c061600b7c6f2d",
        "roles" : [ "ROLE_USER" ],
        "pwHash" : "61fc7b9489f8fac25b1b783a35fd00f9bf828e1b2a050f95403531de6f625a55",
        "pwSalt" : -4238952270675358865,
        "pwLogin" : true
      }, {
        "name" : "__cloudera_internal_user__mgmt-HOSTMONITOR-fa65012143adc051f5c061600b7c6f2d",
        "roles" : [ "ROLE_USER" ],
        "pwHash" : "a3defdcee6eb94b37920b8e30268dcbf2b07be4dd42d094f5cde0d41c7fe0cd2",
        "pwSalt" : 1829650623011060362,
        "pwLogin" : true
      }, {
        "name" : "__cloudera_internal_user__mgmt-REPORTSMANAGER-fa65012143adc051f5c061600b7c6f2d",
        "roles" : [ "ROLE_USER" ],
        "pwHash" : "44171b9d0c0a90a7dc62b7010e57ea50cfedb18e1cfecc783675f4f03246e41d",
        "pwSalt" : -7081072396083797510,
        "pwLogin" : true
      }, {
        "name" : "__cloudera_internal_user__mgmt-SERVICEMONITOR-fa65012143adc051f5c061600b7c6f2d",
        "roles" : [ "ROLE_USER" ],
        "pwHash" : "150fa34228bd6eefbaabb7a0a332f2f047b9693ad3614cce430f0d082a8d55e7",
        "pwSalt" : -4452744081985209616,
        "pwLogin" : true
      }, {
        "name" : "admin",
        "roles" : [ "ROLE_ADMIN" ],
        "pwHash" : "e54822c1a4babd431e6a5515026464203cd0e0c46455177a3a417d60be374b7b",
        "pwSalt" : -2332550855518382050,
        "pwLogin" : true
      } ],
      "versionInfo" : {
        "version" : "5.11.0",
        "buildUser" : "jenkins",
        "buildTimestamp" : "20170412-1255",
        "gitHash" : "70cb1442626406432a6e7af5bdf206a384ca3f98",
        "snapshot" : false
      },
      "managementService" : {
        "name" : "mgmt",
        "type" : "MGMT",
        "config" : {
          "items" : [ {
            "name" : "service_health_suppression_mgmt_embedded_db_free_space",
            "value" : "true"
          } ]
        },
        "roles" : [ {
          "name" : "mgmt-ALERTPUBLISHER-fa65012143adc051f5c061600b7c6f2d",
          "type" : "ALERTPUBLISHER",
          "hostRef" : {
            "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
          },
          "config" : {
            "items" : [ {
              "name" : "role_jceks_password",
              "value" : "bjza7vf1efilzs16ejixxgf18"
            } ]
          },
          "roleConfigGroupRef" : {
            "roleConfigGroupName" : "mgmt-ALERTPUBLISHER-BASE"
          }
        }, {
          "name" : "mgmt-EVENTSERVER-fa65012143adc051f5c061600b7c6f2d",
          "type" : "EVENTSERVER",
          "hostRef" : {
            "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
          },
          "config" : {
            "items" : [ {
              "name" : "role_jceks_password",
              "value" : "be9p1xwh1k16s73c5xzk2f1yg"
            } ]
          },
          "roleConfigGroupRef" : {
            "roleConfigGroupName" : "mgmt-EVENTSERVER-BASE"
          }
        }, {
          "name" : "mgmt-HOSTMONITOR-fa65012143adc051f5c061600b7c6f2d",
          "type" : "HOSTMONITOR",
          "hostRef" : {
            "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
          },
          "config" : {
            "items" : [ {
              "name" : "role_jceks_password",
              "value" : "esjwneu597x0m4e0wzpxj19ia"
            } ]
          },
          "roleConfigGroupRef" : {
            "roleConfigGroupName" : "mgmt-HOSTMONITOR-BASE"
          }
        }, {
          "name" : "mgmt-REPORTSMANAGER-fa65012143adc051f5c061600b7c6f2d",
          "type" : "REPORTSMANAGER",
          "hostRef" : {
            "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
          },
          "config" : {
            "items" : [ {
              "name" : "role_jceks_password",
              "value" : "5kpeh9vwv84z3np83nw9w4yl8"
            } ]
          },
          "roleConfigGroupRef" : {
            "roleConfigGroupName" : "mgmt-REPORTSMANAGER-BASE"
          }
        }, {
          "name" : "mgmt-SERVICEMONITOR-fa65012143adc051f5c061600b7c6f2d",
          "type" : "SERVICEMONITOR",
          "hostRef" : {
            "hostId" : "2be58ee7-f531-4834-a53e-a19cdd817791"
          },
          "config" : {
            "items" : [ {
              "name" : "role_jceks_password",
              "value" : "dytxajs2sjh5x6eeoyxjgklio"
            } ]
          },
          "roleConfigGroupRef" : {
            "roleConfigGroupName" : "mgmt-SERVICEMONITOR-BASE"
          }
        } ],
        "displayName" : "Cloudera Management Service",
        "roleConfigGroups" : [ {
          "name" : "mgmt-ACTIVITYMONITOR-BASE",
          "displayName" : "Activity Monitor Default Group",
          "roleType" : "ACTIVITYMONITOR",
          "base" : true,
          "serviceRef" : {
            "serviceName" : "mgmt"
          },
          "config" : {
            "items" : [ ]
          }
        }, {
          "name" : "mgmt-ALERTPUBLISHER-BASE",
          "displayName" : "Alert Publisher Default Group",
          "roleType" : "ALERTPUBLISHER",
          "base" : true,
          "serviceRef" : {
            "serviceName" : "mgmt"
          },
          "config" : {
            "items" : [ ]
          }
        }, {
          "name" : "mgmt-EVENTSERVER-BASE",
          "displayName" : "Event Server Default Group",
          "roleType" : "EVENTSERVER",
          "base" : true,
          "serviceRef" : {
            "serviceName" : "mgmt"
          },
          "config" : {
            "items" : [ {
              "name" : "event_server_heapsize",
              "value" : "134217728"
            } ]
          }
        }, {
          "name" : "mgmt-HOSTMONITOR-BASE",
          "displayName" : "Host Monitor Default Group",
          "roleType" : "HOSTMONITOR",
          "base" : true,
          "serviceRef" : {
            "serviceName" : "mgmt"
          },
          "config" : {
            "items" : [ {
              "name" : "firehose_heapsize",
              "value" : "268435456"
            }, {
              "name" : "firehose_non_java_memory_bytes",
              "value" : "805306368"
            } ]
          }
        }, {
          "name" : "mgmt-NAVIGATOR-BASE",
          "displayName" : "Navigator Audit Server Default Group",
          "roleType" : "NAVIGATOR",
          "base" : true,
          "serviceRef" : {
            "serviceName" : "mgmt"
          },
          "config" : {
            "items" : [ ]
          }
        }, {
          "name" : "mgmt-NAVIGATORMETASERVER-BASE",
          "displayName" : "Navigator Metadata Server Default Group",
          "roleType" : "NAVIGATORMETASERVER",
          "base" : true,
          "serviceRef" : {
            "serviceName" : "mgmt"
          },
          "config" : {
            "items" : [ ]
          }
        }, {
          "name" : "mgmt-REPORTSMANAGER-BASE",
          "displayName" : "Reports Manager Default Group",
          "roleType" : "REPORTSMANAGER",
          "base" : true,
          "serviceRef" : {
            "serviceName" : "mgmt"
          },
          "config" : {
            "items" : [ {
              "name" : "headlamp_database_host",
              "value" : "localhost:3306"
            }, {
              "name" : "headlamp_database_name",
              "value" : "rman"
            }, {
              "name" : "headlamp_database_password",
              "value" : ""
            }, {
              "name" : "headlamp_database_user",
              "value" : "rman"
            }, {
              "name" : "headlamp_heapsize",
              "value" : "268435456"
            } ]
          }
        }, {
          "name" : "mgmt-SERVICEMONITOR-BASE",
          "displayName" : "Service Monitor Default Group",
          "roleType" : "SERVICEMONITOR",
          "base" : true,
          "serviceRef" : {
            "serviceName" : "mgmt"
          },
          "config" : {
            "items" : [ {
              "name" : "firehose_heapsize",
              "value" : "268435456"
            }, {
              "name" : "firehose_non_java_memory_bytes",
              "value" : "805306368"
            } ]
          }
        }, {
          "name" : "mgmt-TELEMETRYPUBLISHER-BASE",
          "displayName" : "Telemetry Publisher Default Group",
          "roleType" : "TELEMETRYPUBLISHER",
          "base" : true,
          "serviceRef" : {
            "serviceName" : "mgmt"
          },
          "config" : {
            "items" : [ ]
          }
        } ]
      },
      "managerSettings" : {
        "items" : [ {
          "name" : "CLUSTER_STATS_START",
          "value" : "10/26/2012 14:50"
        }, {
          "name" : "PUBLIC_CLOUD_STATUS",
          "value" : "NOT_ON_PUBLIC_CLOUD"
        }, {
          "name" : "REMOTE_PARCEL_REPO_URLS",
          "value" : "https://archive.cloudera.com/cdh5/parcels/5.8.3/,https://archive.cloudera.com/cdh4/parcels/latest/,https://archive.cloudera.com/impala/parcels/latest/,https://archive.cloudera.com/search/parcels/latest/,https://archive.cloudera.com/accumulo/parcels/1.4/,https://archive.cloudera.com/accumulo-c5/parcels/latest/,https://archive.cloudera.com/kafka/parcels/latest/,https://archive.cloudera.com/navigator-keytrustee5/parcels/latest/,http://archive.cloudera.com/kudu/parcels/latest/,https://archive.cloudera.com/spark/parcels/latest/,https://archive.cloudera.com/sqoop-connectors/parcels/latest/"
        } ]
      },
      "allHostsConfig" : {
        "items" : [ {
          "name" : "host_memswap_thresholds",
          "value" : "{\"warning\":60,\"critical\":70}"
        }, {
          "name" : "host_network_interfaces_slow_mode_thresholds",
          "value" : "{\"warning\":\"never\",\"critical\":\"never\"}"
        } ]
      },
      "peers" : [ ],
      "hostTemplates" : {
        "items" : [ ]
      }
    }
