package org.mvnsearch.vfs.provider.zk;

import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.operations.FileOperation;
import org.apache.commons.vfs2.operations.FileOperationProvider;

import java.util.Collection;

/**
 * zookeeper file operations provider
 *
 * @author linux_china
 */
public class ZooKeeperFileOperationsProvider implements FileOperationProvider {
    public void collectOperations(Collection<Class<? extends FileOperation>> operationsList, FileObject file) throws FileSystemException {

    }

    public FileOperation getOperation(FileObject file, Class<? extends FileOperation> operationClass) throws FileSystemException {
        return null;
    }
}
