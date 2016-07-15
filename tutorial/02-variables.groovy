
//def, make me a variable.
def x = 42
println x.getClass()
//expected:  class java.lang.Integer
assert java.lang.Integer == x.getClass()

x = "Hello World"
println x.getClass()
//expected:  class java.lang.String
assert java.lang.String == x.getClass()
