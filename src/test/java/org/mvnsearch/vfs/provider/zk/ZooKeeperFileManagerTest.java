package org.mvnsearch.vfs.provider.zk;

import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.VFS;

/**
 * zookeeper file manager test
 *
 * @author linux_china
 */
public class ZooKeeperFileManagerTest {

    public void testZkVfs() throws Exception {
        FileSystemManager fsManager = VFS.getManager();
        FileObject root = fsManager.resolveFile("zk://127.0.0.1/");
        System.out.println(root);
    }
}
