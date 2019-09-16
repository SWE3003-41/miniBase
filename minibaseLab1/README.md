# minibase Lab1

#### Goal: Implement the classes (`Tuple, TupleDesc, Catalog`)  
*(`Field`, `IntField`, `StringField` and `Type` is already implemented.)*


## Main Components of miniBase and Excercise(hw)
### Database.java
- a class that initializes static variables used by the database system. 
- There is nothing you need to implement here.

### Tuple.java
- a class that maintains information about the contents of a tuple. 
- Tuple is **a collection of `Field` objects**. 

### TupleDesc.java
- `TupleDesc` describes the schema of a tuple. 
- `TupleDesc` consists of **a collection of `Type`** objects


#### > Implementet the skeleton methods (except methods related to recordID)
- src/java/minibase/TupleDesc.java
- src/java/minibase/Tuple.java

If successfully implemented `TupleTest` and `TupleDescTest` unit tests should be passed. 
```bash
$ ant runtest -Dtest=TupleTest
$ ant runtest -Dtest=TupleDescTest
```

### Catalog 
- a class that keeps track of all **available tables in the database and their associated schemas**. 
- need to support the ability to add a new table + get information about a particular talble. 

#### > Implement the skeleton methods in:
- src/java/minibase/Catalog.java

If successfully implemented `CatalogTest` unit tests should be passed
```bash
$ ant runtest -Dtest=CatalogTest
```

## Implementation Guide.
Recommeneded Implementation order 
1. TupledDesc.java
2. Tuple.java
3. Catalog.java

Fill out methods where `TODO` is marked. (You don't need to implement iterator right now).

Search java methods if you need. For example in `Tuple.java` we manage fieldVal using data structure `List` there are in-built methods you can use. [reference](https://courses.cs.washington.edu/courses/cse341/98au/java/jdk1.2beta4/docs/api/java/util/List.html) 

## Submission
- Submit on icampus after making tarball
```bash
$ ant hadin
```

.  
.  
.  
Good Luck!
