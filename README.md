vfs-zookeeper
=============

ZooKeeper for Apache commons-vfs (Virtual File System) project

### Usage 

    FileSystemManager fsManager = VFS.getManager();
    FileObject dir = fsManager.resolveFile("zk://192.168.1.2/namespace/demo.txt");

