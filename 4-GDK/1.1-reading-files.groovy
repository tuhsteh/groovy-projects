
baseDir = "."

new File(baseDir, 'haiku.txt').eachLine { line ->
    println line
}
