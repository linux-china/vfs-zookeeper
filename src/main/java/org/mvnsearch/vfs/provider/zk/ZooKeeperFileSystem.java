package org.mvnsearch.vfs.provider.zk;

import org.apache.commons.vfs2.Capability;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.provider.AbstractFileName;
import org.apache.commons.vfs2.provider.AbstractFileSystem;
import org.apache.commons.vfs2.provider.GenericFileName;
import org.apache.curator.framework.CuratorFramework;

import java.util.Collection;

/**
 * zookeeper file system
 *
 * @author linux_china
 */
public class ZooKeeperFileSystem extends AbstractFileSystem {
    private CuratorFramework curator;

    public ZooKeeperFileSystem(GenericFileName rootName, CuratorFramework curator, FileSystemOptions fileSystemOptions) {
        super(rootName, null, fileSystemOptions);
        this.curator = curator;
    }

    protected FileObject createFile(AbstractFileName name) throws Exception {
        return null;
    }

    protected void addCapabilities(Collection<Capability> caps) {

    }
}
