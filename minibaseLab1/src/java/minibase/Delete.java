package minibase;

/**
 * The delete operator. Delete reads tuples from its child operator and removes
 * them from the table they belong to.
 */
public class Delete extends Operator {

    private static final long serialVersionUID = 1L;

    // hint: implementation of Delete.java is not that much different from implementing Insert.java.
    /**
     * Constructor specifying the transaction that this delete belongs to as
     * well as the child to read from.
     * 
     * @param t
     *            The transaction this delete runs in
     * @param child
     *            The child operator from which to read tuples for deletion
     */
    public Delete(TransactionId t, DbIterator child) {
        // TODO: some code goes here
    }

    public TupleDesc getTupleDesc() {
        // TODO: some code goes here
        return null;
    }

    public void open() throws DbException, TransactionAbortedException {
        // TODO: some code goes here
    }

    public void close() {
        // TODO: some code goes here
    }

    public void rewind() throws DbException, TransactionAbortedException {
        // TODO: some code goes here
    }

    /**
     * Deletes tuples as they are read from the child operator. Deletes are
     * processed via the buffer pool (which can be accessed via the
     * Database.getBufferPool() method.
     * 
     * @return A 1-field tuple containing the number of deleted records.
     * @see Database#getBufferPool
     * @see BufferPool#deleteTuple
     */
    protected Tuple fetchNext() throws TransactionAbortedException, DbException {
        // TODO: some code goes here
        return null;
    }

    @Override
    public DbIterator[] getChildren() {
        // TODO: some code goes here
        return null;
    }

    @Override
    public void setChildren(DbIterator[] children) {
        // TODO: some code goes here
    }

}
