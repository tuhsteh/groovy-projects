
/*
 * if("foobar") ...
 * if(42) ...
 * if(someObject) ...
 */

if("foobar") {
    println "Found a String, \"foobar\"."
}

if("") {
    println "Found an empty String."
} else {
    println "Empty Strings are False!"
}

if(42) {
    println "Found an Integer, 42."
}

// this will throw an exception
if(someObject) {
    println "Found someObject."
} 
