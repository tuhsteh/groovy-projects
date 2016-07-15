
// use $ for variable replacement within a string.
def x = "World"
println "Hello, $x"


// additionally, use curlies to treat a string 
// as a character array within another string.
def firstName = "Douglas"
def name = "Adams"
println "Hello, ${firstName[0]}. $name"

// multiline string...
def s = """This is
a multiline
string"""
println s