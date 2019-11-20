package minibase;


/**
 * LockManager is class which manages locks for transactions.
 * It stores states of various locks on pages and provides atomic grant
 * and release of locks.
 * @author hrishi
 */
public class LockManager {
    

    public LockManager() {
    
    }
    
    /**
     * Checks if transaction has lock on a page
     * @param tid Transaction Id
     * @param pid Page Id
     * @return boolean True if holds lock
     */
    public boolean holdsLock(TransactionId tid, PageId pid){
        return false;
    }
    
    /**
     * Grants lock to the Transaction.
     * @param tid TransactionId requesting lock.
     * @param pid PageId on which the lock is requested.
     * @param perm The type of permission.
     */
    public void requestLock(TransactionId tid, PageId pid, 
            Permissions perm) throws TransactionAbortedException{
    }
    
    
    
    /**
     * Releases locks associated with given transaction and page.
     * @param tid The TransactionId.
     * @param pid The PageId.
     */
    public synchronized void releaseLock(TransactionId tid, PageId pid){
   
    }
    
    /**
     * Releases Lock related to a page
     * @param pid PageId
     */
    public synchronized void removePage(PageId pid){
    }
    
    /**
     * Releases all pages associated with given Transaction.
     * @param tid The TransactionId.
     */
    public void releaseAllPages(TransactionId tid){
    }
    
}
