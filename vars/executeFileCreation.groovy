def call(def filename,def fileContent = "Hello, It is sample file for execution"){
  sh '''
  touch ${filename}
  writeFile(${filename}, fileContent)
  echo "File is written"
  '''
}
