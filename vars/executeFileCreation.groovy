def call(def filename,def fileContent = "Hello, It is sample file for execution"){
  script{
    println("Just checking script working")
  } 
  sh """
  echo ${filename}
  echo $filename
  touch ${filename}
  """
  writeFile(file: filename,text: fileContent)
  echo 'File is written'
}
