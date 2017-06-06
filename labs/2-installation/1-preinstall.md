1. Check for vm.swappiness

    Command used: `sysctl vm.swappiness`

    Output:  `vm.swappiness = 60`
    
    Setting vm.swapiness
    
    Command used: `sysctl -w vm.swapiness=1`

2. Show the mount attributes of all volumes

    Command used: `df -HT`
    
    Output:

    Filesystem     Type      Size  Used Avail Use% Mounted on
    /dev/sda11     ext4      144G   23G  114G  17% /
    /dev/sda9      ext4      107G   63M  101G   1% /media/sid/L2
    /dev/sda8      ext4       47G   55M   44G   1% /media/sid/L1
    /dev/sda10     ext4       29G   47M   28G   1% /media/sid/L3

3. Show the reserve space of any non-root, ext-based volumes

    Command used: `for inp in /dev/sda10 /dev/sda9 /dev/sda8; do echo $inp; echo ''; echo '';tune2fs -l $inp|sed -n 14,19p; echo '';echo ''; done`


    /dev/sda10

    Block count:              7118848
    Reserved block count:     355942
    Free blocks:              6962965
    Free inodes:              1782357
    First block:              0
    Block size:               4096


    /dev/sda9

    Block count:              26373888
    Reserved block count:     1318694
    Free blocks:              25911969
    Free inodes:              6594549
    First block:              0
    Block size:               4096


    /dev/sda8

    Block count:              11534336
    Reserved block count:     576716
    Free blocks:              11307309
    Free inodes:              2883573
    First block:              0
    Block size:               4096

4. Disable transparent huge page support

   Command used: `hugeadm --thp-never`

5. Display network configurations

    Command used: `ifconfig -a`


                   eth0      Link encap:Ethernet  HWaddr 3c:a8:2a:a5:6b:ef
                             inet addr:192.168.0.13  Bcast:192.168.0.255  Mask:255.255.255.0
                             inet6 addr: fe80::3ea8:2aff:fea5:6bef/64 Scope:Link
                             UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
                             RX packets:2397187 errors:0 dropped:1 overruns:0 frame:0
                             TX packets:1257594 errors:0 dropped:0 overruns:0 carrier:0
                             collisions:0 txqueuelen:1000
                             RX bytes:3460448597 (3.4 GB)  TX bytes:92594784 (92.5 MB)

                   lo        Link encap:Local Loopback
                             inet addr:127.0.0.1  Mask:255.0.0.0
                             inet6 addr: ::1/128 Scope:Host
                             UP LOOPBACK RUNNING  MTU:65536  Metric:1
                             RX packets:7873 errors:0 dropped:0 overruns:0 frame:0
                             TX packets:7873 errors:0 dropped:0 overruns:0 carrier:0
                             collisions:0 txqueuelen:1
                             RX bytes:995363 (995.3 KB)  TX bytes:995363 (995.3 KB)

                   wlan0     Link encap:Ethernet  HWaddr d8:5d:e2:42:a5:21
                             BROADCAST MULTICAST  MTU:1500  Metric:1
                             RX packets:7540 errors:0 dropped:0 overruns:0 frame:0
                             TX packets:532 errors:0 dropped:0 overruns:0 carrier:0
                             collisions:0 txqueuelen:1000
                             RX bytes:1907136 (1.9 MB)  TX bytes:105214 (105.2 KB)

6. gentnet and nslookup

    getent hosts

        127.0.1.1       sid-HP-Pavilion-Notebook

    nslookup 127.0.0.1
        Server:		127.0.1.1
        Address:	127.0.1.1#53

        1.0.0.127.in-addr.arpa	name = localhost.

7. nscd service

    nscd -g
    nscd configuration:

                  0  server debug level
            37m 37s  server runtime
                  5  current number of threads
                 32  maximum number of threads
                  0  number of times clients had to wait
                 no  paranoia mode enabled
               3600  restart internal
                  5  reload count

    hosts cache:

                yes  cache is enabled
                yes  cache is persistent
                yes  cache is shared
                211  suggested size
             216064  total data pool size
                136  used data pool size
               3600  seconds time to live for positive entries
                 20  seconds time to live for negative entries
                  0  cache hits on positive entries
                  0  cache hits on negative entries
                  1  cache misses on positive entries
                  0  cache misses on negative entries
                  0% cache hit rate
                  1  current number of cached values
                  1  maximum number of cached values
                  0  maximum chain length searched
                  0  number of delays on rdlock
                  0  number of delays on wrlock
                  0  memory allocations failed
                yes  check /etc/hosts for changes

8. ntpd service

    ntpdc -s
         remote           local      st poll reach  delay   offset    disp
    =======================================================================
    *weppel.xs4all.n 192.168.0.13     1   64  377 0.03009  0.013434 0.07140
     stratum2-4.NTP. 192.168.0.13     2   64  377 0.02531  0.020899 0.06369
    .ntp.nesebarnet. 192.168.0.13     3   64  377 0.06529 -0.008220 0.05042
     alphyn.canonica 192.168.0.13     2   64  377 0.10242  0.001478 0.04491
    .au.kashra.pictu 192.168.0.13     2   64  377 0.16267 -0.018285 0.04398
