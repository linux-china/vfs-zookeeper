package org.mvnsearch.vfs.provider.zk;

import org.apache.commons.vfs2.provider.URLFileNameParser;

/**
 * zookeeper file name parser
 *
 * @author linux_china
 */
public class ZooKeeperFileNameParser extends URLFileNameParser {
    private static final ZooKeeperFileNameParser INSTANCE = new ZooKeeperFileNameParser();

    public ZooKeeperFileNameParser() {
        super(2181);
    }

    public static ZooKeeperFileNameParser getInstance() {
        return INSTANCE;
    }

}
