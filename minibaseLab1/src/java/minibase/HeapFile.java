package minibase;

import java.io.*;
import java.util.*;

/**
 * HeapFile is an implementation of a DbFile that stores a collection of tuples
 * in no particular order. Tuples are stored on pages, each of which is a fixed
 * size, and the file is simply a collection of those pages. HeapFile works
 * closely with HeapPage. The format of HeapPages is described in the HeapPage
 * constructor.
 * 
 * @see minibase.HeapPage#HeapPage
 * @author Sam Madden
 */
public class HeapFile implements DbFile {

    /**
     * Constructs a heap file backed by the specified file.
     * 
     * @param f
     *            the file that stores the on-disk backing store for this heap
     *            file.
     */

    public HeapFile(File f, TupleDesc td) {
        // TODO: some code goes here
    }

    /**
     * Returns the File backing this HeapFile on disk.
     * 
     * @return the File backing this HeapFile on disk.
     */
    public File getFile() {
        // TODO: some code goes here
        return null;
    }

    /**
     * Returns an ID uniquely identifying this HeapFile. Implementation note:
     * you will need to generate this tableid somewhere ensure that each
     * HeapFile has a "unique id," and that you always return the same value for
     * a particular HeapFile. We suggest hashing the absolute file name of the
     * file underlying the heapfile, i.e. f.getAbsoluteFile().hashCode().
     * 
     * @return an ID uniquely identifying this HeapFile.
     */
    public int getId() {
        // TODO: some code goes here
        throw new UnsupportedOperationException("implement this");
    }

    /**
     * Returns the TupleDesc of the table stored in this DbFile.
     * 
     * @return TupleDesc of this DbFile.
     */
    public TupleDesc getTupleDesc() {
        // TODO: some code goes here
        throw new UnsupportedOperationException("implement this");
    }

    // see DbFile.java for javadocs
    public Page readPage(PageId pid) {
        // TODO: some code goes here
	// hint!! to read specific page at arbitrary offset you need random access to the file
        return null;
    }

    // see DbFile.java for javadocs
    public void writePage(Page page) throws IOException {
        // some code goes here
        // not necessary for proj1
    }

    /**
     * Returns the number of pages in this HeapFile.
     */
    public int numPages() {
        // TODO: some code goes here
	// hint!! you can calculate number of pages as you know PAGE_SIZE
        return 0;
    }

    // see DbFile.java for javadocs
    public ArrayList<Page> insertTuple(TransactionId tid, Tuple t)
            throws DbException, IOException, TransactionAbortedException {
        // some code goes here
        return null;
        // not necessary for proj1
    }

    // see DbFile.java for javadocs
    public Page deleteTuple(TransactionId tid, Tuple t) throws DbException,
            TransactionAbortedException {
        // some code goes here
        return null;
        // not necessary for proj1
    }

    // see DbFile.java for javadocs
    public DbFileIterator iterator(TransactionId tid) {
        // TODO: some code goes here
        return null;
    }

    // TODO: make HeapFileIterator class, you can freely add new methods, variable
    /**
     * Class for iterating over all tuples of this file
     *
     * @see minibase.DbFileIterator
     */
    private class HeapFileIterator implements DbFileIterator {
    
	    /**
	     * Constructor for iterator
	     *
	     * @param tid Transactional of requesting transaction
	     * @param tableId of the HeapFile
	     * @param numPages the number of pages in file
	     */
	    public HeapFileIterator(TransactionId tid, int tableId, int numPages) {
	    	// hint: you can get tuple iterator from HeapPage 
	    }

	    /**
	     * Open it iterator for iteration
	     *
	     * @throws DbException
	     * @throws TransactionAbortedException
	     */
	    public void open() throws DbException, TransactionAbortedException {

	    }

	    /**
	     * Check if iterator has next tuple
	     *
	     * @return boolean true if exists
	     * @throws DbException
	     * @throws TransactionAbortedException
	     */
	    public boolean hasNext() throws DbException, TransactionAbortedException {
	    	return false;
	    }

	    /**
	     * Get next tuple in this file
	     *
	     * @return
	     * @throws DbException
	     * @throws TrnasactionAbortedException
	     * @throws NoSuchElementException
	     */
	    public Tuple next() throws DbException, TransactionAbortedException, NoSuchElementException {
	    	return null;
	    }

	    /**
	     * Rewind iterator to the start of file
	     *
	     * @throws DbException
	     * @throws TransactionAbortedException
	     */
	    public void rewind() throws DbException, TransactionAbortedException {
	    }

	    /**
	     * Close the iterator
	     */
	    public void close() {
	    		
	    }
    }
}

