package org.anudip.stream;

import  java.io.*;

import  java.nio.file.*;

public  class  Rewriter  {

public  static  void  copy(Path  source,  Path  target) throws  Exception  {

try (BufferedReader r = Files.newBufferedReader(source);

Writer  w  =  Files.newBufferedWriter(target))

{

String  temp  =  null;

while((temp  =  r.readLine())  !=  null)  { w.write(temp);


}

}

}

public  static  void  main(String[]  tooMany)  throws Throwable  {

Rewriter.copy(Paths.get("/original.txt"),



FileSystems.getDefault().getPath("/","unoriginal.txt"));

}

}