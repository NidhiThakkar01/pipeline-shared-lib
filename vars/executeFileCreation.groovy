def call(def filename,def fileContent = "Hello, It is sample file for execution"){
  sh """
  echo ${filename}
  echo $filename
  touch ${filename}
  """
  writeFile(${filename}, fileContent)
  echo 'File is written'
}
