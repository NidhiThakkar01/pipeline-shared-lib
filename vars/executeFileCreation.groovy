def call(def filename,def fileContent = "Hello, It is sample file for execution"){
  sh """
  echo ${filename}
  echo $filename
  touch ${filename}
  ls
  writeFile(${filename}, fileContent)
  ls
  echo 'File is written'
  """
}
