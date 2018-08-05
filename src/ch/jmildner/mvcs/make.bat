set comp=javac
set comp=javac
set verz=mvcs

del *.zip
del *.jar
del *.class 

rmdir ch /s

pause

jar cfM %verz%.zip *.*

%comp% -d . *.java

pause

appletviewer ViewApplet1.html

jar -cmf  manifest.mf %verz%.jar ch\jmildner\designpattern\mvcs\*.class 

rmdir ch /s

appletviewer ViewApplet2.html

pause

set classpath=.\mvcs.jar;%classpath%
java ch.jmildner.designpattern.mvcs.ViewFrame

pause
