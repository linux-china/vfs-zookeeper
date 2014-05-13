package org.mvnsearch.vfs.provider.zk;

import org.apache.commons.vfs2.*;
import org.apache.commons.vfs2.provider.AbstractOriginatingFileProvider;

import java.util.Collection;

/**
 * zookeeper file provider
 *
 * @author linux_china
 */
public class ZooKeeperFileProvider extends AbstractOriginatingFileProvider {
    protected FileSystem doCreateFileSystem(FileName rootName, FileSystemOptions fileSystemOptions) throws FileSystemException {
        return null;
    }

    public Collection<Capability> getCapabilities() {
        return null;
    }
}
