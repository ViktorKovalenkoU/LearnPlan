# Java learning plan

## Git
---
- [ ] Local repository operations
  - [ ] git init
  - [ ] git add
  - [ ] git commit
  - [ ] git branch
  - [ ] git checkout
  - [ ] git merge
  - [ ] git rebase
  - [ ] .gitignore
- [ ] Remote repository operations
  - [ ] SSH keys setup
  - [ ] Setting remote repository / pushing local repository to remote 
  - [ ] git push
  - [ ] git pull

---
## Java core
- [ ] Platform basics - JVM, JRE, JDK
- [ ] Compiling, executing from console. Classpath.
- [ ] Executing from IDE. Debugging.
- [ ] Keywords 
- [ ] Data types. "final" keyword.
- [ ] Operators (types, priority)
  - [ ] Arithmetic operators
  - [ ] Condition operators - if, if-else, else, switch-case, ternary operator
  - [ ] Cycle operators - for, for-each, while, do-while. "break" and "continue" keywords.
- [ ] Methods - declaration and signature. 
- [ ] Array
  - [ ] Two-dimensional array 
  - [ ] Basic array operations
    - [ ] Adding element to initialized array
    - [ ] Deleting element from initialized array
    - [ ] Inserting element to initialized array
  - [ ] Introduction into algorithms 
    - [ ] Linear search algorithm
    - [ ] Bubble sorting algorithm
    - [ ] Binary search algorithm
- [ ] Classes
  - [ ] Field declaration  
  - [ ] Method declaration
    - [ ] Method overloading
    - [ ] Method overriding
    - [ ] Method hiding
  - [ ] Class "Object". Methods of this class.
  - [ ] Access modifiers - public, private, default, protected
  - [ ] OOP
    - [ ] Inheritance
    - [ ] Encapsulation
    - [ ] Polymorphism
    - [ ] Abstraction
  - [ ] "instanceof" operator
  - [ ] "final" keyword usages
  - [ ] "static" keyword usages
  - [ ] Constructor 
  - [ ] Initialization block
  - [ ] Order of constructor/init-block execution during object initialization
  - [ ] "this" keyword
  - [ ] "super" keyword 
  - [ ] Abstract classes
    - [ ] Abstract methods
    - [ ] Abstract constructors
  - [ ] Interfaces 
  - [ ] Inner classes, anonymous classes, local classes
- [ ] Wrapper classes - boxing, unboxing
- [ ] Linked list
  - [ ] Declaring linked list
  - [ ] Initializing linked list
  - [ ] Adding element to linked list
  - [ ] Deleting element from linked list
  - [ ] Inserting element to linked list
  - [ ] Compare linked list and array  
- [ ] Enum
- [ ] Generic classes and methods
- [ ] Strings
 - [ ] String
 - [ ] StringBuffer
 - [ ] StringBuilder
 - [ ] String pool
 - [ ] String formatting and templating
- [ ] Comparison of the objects
  - [ ] "Comparable" interface
  - [ ] "Comparator" class
  - [ ] "hashCode" method
  - [ ] "equals" method
- [ ] Collection framework
 - [ ] Collection
 - [ ] "Collections"/"Arrays" util classes
 - [ ] List
   - [ ] ArrayList
   - [ ] LinkedList
 - [ ] Queue
 - [ ] Deque 
 - [ ] Set
 - [ ] Map
    - [ ] HashMap
    - [ ] LinkedHashMap
    - [ ] TreeMap
- [ ] Java 8 features
	- [ ] Stream API
	- [ ] Functional Interfaces
	- [ ] Lambda expressions
	- [ ] Method references
- [ ] "Internationalization" - i18n
  - [ ] .property files
  - [ ] ResourceBundle
  - [ ] Locale
- [ ] Regular expressions
  - [ ] RegExp in java - Pattern, Matcher
- [ ] Exceptions
  - [ ] "try"/"catch"/"finally" keywords
  - [ ] "throw"/"throws" keywords
  - [ ] Exception types - checked, unchecked (runtime)
  - [ ] Create custom exception type 
- [ ] Input/Output (IO)
  - [ ] Input stream types - FileInputStream, BufferedInputStream, ByteArrayInputStream
  - [ ] Output stream types - FileOutputStream, BufferedOutputStream, ByteArrayOutputStream
  - [ ] "Scanner" class
  - [ ] "Formatter" class
  - [ ] Serialization/Deserialization of class
    - [ ] "transient" keyword
    - [ ] "SerialVersionUDI" field
    - [ ] JavaBeans 
  - [ ] Working with files in Java 
- [ ] Java tools for working with XML (first check [Data formatting types](#data-formatting-types))
  - [ ] JAXB
  - [ ] DOM
  - [ ] SAX
  - [ ] StAX
  - [ ] JAXP
- [ ] Threads
  - [ ] "Runnable" interface
  - [ ] "Callable" interface
  - [ ] Thread synchronization - "sychronized" keyword
  - [ ] "volatile" keyword
  - [ ] ThreadExecutorService. Thread pools.
- [ ] Java Reflection API
  - [ ] "Class" class and it's properties
  - [ ] Annotations
- [ ] Java with databases (required [Relational databases](#relational-databases)) 
  - [ ] JDBC
  - [ ] Statements (Statement/PreparedStatement/CallableStatement)
  - [ ] Driver management 
  - [ ] Result set 
  - [ ] DAO
  - [ ] Connection pool
- [ ] Javadoc 

---
## Data formatting types
- [ ] XML
  - [ ] Structure of XML document - nodes and attributes
  - [ ] XSD and validation 
  - [ ] Namespaces
- [ ] JSON
- [ ] YAML

--- 
## Relational databases
- [ ] RDBMS concepts (MySQL, PostgreSQL etc.)
  - [ ] SQL basics
  - [ ] Creating tables
  - [ ] Manipulating tables - CRUD (Create, Read, Update, Delete) operations
  - [ ] Primary and foreign keys
  - [ ] Table normalization
  - [ ] ACID
  - [ ] Indexes, triggers, views, stored procedures (advanced)

--- 
## Web basics
- [ ] HTTP protocol - request/response structure
- [ ] HTML basics
  - [ ] HTML page structure
  - [ ] HTML tags and attributes
  - [ ] HTML forms
- [ ] CSS basics
  - [ ] Applying styles to tags
  - [ ] Bootstrap library
- [ ] JS basics
  - [ ] Basics of the language
  - [ ] Handling browser events
  - [ ] Manipulating DOM
  - [ ] JQuery

---
## Build tools
- [ ] Maven
- [ ] Gradle

---
## Algorithms and data structures
- [ ] Big O notation - algorithm complexity
- [ ] Soring algorithms
- [ ] Search algorithms
- [ ] Graph travestying algorithms
- [ ] Trees
- [ ] Maps
- [ ] Greedy algorithms 
- [ ] Dynamic programming

---
## Code design best practices
- [ ] Code conventions
- [ ] Clean code and refactoring practices
- [ ] Design patterns
  - [ ] Factory
  - [ ] Abstract factory
  - [ ] Singleton
  - [ ] Command
Visit [Refactoring Guru](https://refactoring.guru/)

---
## Java EE (Jakarta EE )
- [ ] Tomcat installation and configuration
- [ ] Structure of web application - web.xml
- [ ] Servlets
  - [ ] Servlet lifecycle
  - [ ] Request, Response
  - [ ] Servlet mapping
- [ ] HTTP sessions, cookies, attributes
- [ ] Request dispatcher
  - [ ] Forward 
  - [ ] Include 
  - [ ] sendRedirect
- [ ] Request filters
- [ ] Listeners (context/request/sessions)
- [ ] JSP
  - [ ] Scriplets
  - [ ] Basic operators and logic elements
  - [ ] Expression language (EL)
  - [ ] Tags
    - [ ] Tag libraries - JSTL 
    - [ ] Custom tags
- [ ] Post/Redirect/Get pattern

---
## Testing
- [ ] JUnit
- [ ] Mockito

---
## Spring framework 
- [ ] Spring core
  - [ ] IoC
  - [ ] Spring beans
  - [ ] Spring configuration
  - [ ] Bean wiring
  - [ ] Aspects
- [ ] Spring MVC
- [ ] Spring Data
- [ ] Spring WEB
- [ ] JPA & Hibernate

---
## Java advanced
- [ ] Java memory model 
- [ ] Garbage collector workflow and types of GC
- [ ] Language optimization practices 

---
## System integration
- [ ] REST protocol
 - [ ] Write custom rest endpoint on Spring Web/JAX-RS
 - [ ] API design 
- [ ] SOAP protocol
- [ ] Microservices architecture

---
## Linux
- [ ] Basic concepts - file system, structure, permissions
- [ ] BASH
  - [ ] BASH commands 
  - [ ] BASH scripts
  - [ ] SSH remote connection and manipulations

---
## Cloud
- [ ] Basic concepts of cloud services (AWS, GC, Azure)
