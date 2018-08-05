cls

del *.class
del *.jar

set jc=jikes

%jc% -d . MyDb.java
%jc% -d . MyPanel.java 
%jc% -d . MyFrame.java 

jar -cmf  manifest.mf mydb.jar ch\jmildner\db\mydb\*.class 

rd  ch /s

java  -jar mydb.jar

set classpath=mydb.jar;%classpath%
java ch.jmildner.db.mydb.MyFrame

pause