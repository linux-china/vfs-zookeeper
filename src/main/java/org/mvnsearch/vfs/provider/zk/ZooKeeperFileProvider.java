package org.mvnsearch.vfs.provider.zk;

import org.apache.commons.vfs2.*;
import org.apache.commons.vfs2.provider.AbstractOriginatingFileProvider;
import org.apache.commons.vfs2.provider.GenericFileName;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * zookeeper file provider
 *
 * @author linux_china
 */
public class ZooKeeperFileProvider extends AbstractOriginatingFileProvider {

    /**
     * The provider's capabilities.
     */
    public static final Collection<Capability> capabilities =
            Collections.unmodifiableCollection(Arrays.asList(Capability.CREATE,
                    Capability.DELETE,
                    Capability.RENAME,
                    Capability.GET_TYPE,
                    Capability.GET_LAST_MODIFIED,
                    Capability.SET_LAST_MODIFIED_FILE,
                    Capability.SET_LAST_MODIFIED_FOLDER,
                    Capability.LIST_CHILDREN,
                    Capability.READ_CONTENT,
                    Capability.URI,
                    Capability.WRITE_CONTENT,
                    Capability.APPEND_CONTENT,
                    Capability.RANDOM_ACCESS_READ,
                    Capability.RANDOM_ACCESS_WRITE));

    public ZooKeeperFileProvider() {
        setFileNameParser(ZooKeeperFileNameParser.getInstance());
    }

    protected FileSystem doCreateFileSystem(FileName name, FileSystemOptions fileSystemOptions) throws FileSystemException {
        final GenericFileName rootName = (GenericFileName) name;
        CuratorFramework curator = CuratorFrameworkFactory.newClient(rootName.getHostName() + ":" + rootName.getPort(), new ExponentialBackoffRetry(1000, 3));
        return new ZooKeeperFileSystem(rootName, curator, fileSystemOptions);
    }

    public Collection<Capability> getCapabilities() {
        return capabilities;
    }
}
