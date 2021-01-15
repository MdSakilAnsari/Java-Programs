//JDBC is a API which is used to communication between user and database.
//DAO-DATA ACCESS OBJECT
/*
 * 								Driver
 * 									|
 *	------------------------------------------------------------------
 *	 	|					|					|					|
 * Bridge driver 	Native API Driver	Middle wear driver
 * 
 * 
 * Type-1(Bridge Driver)--> driver is the default driver of Microsoft operating system.Now a days type-1 driver is not in use because
 * every time JDBC translate to ODBC due to get performance and need to download extra software to communicates with database. 	
 * 
 * Type-2(Native API Driver)--> It is written in native language means in C language.Here no need for translation but need to install extra software.
 * 
 * Type-3(Middle wear driver or network protocol driver)--->It can use any where no need to install extra software.It is not reliable in market-
 * Once data base is change need to change the code of java program.
 * 
 * Type-4()
 */

public class Pep27_JDBC {

}
