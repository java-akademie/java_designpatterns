set comp=jikes
set comp=javac
set verz=mvc

del *.zip
del *.jar
del *.class 



jar cfM %verz%.zip *.*

%comp% -d . Amount.java
%comp% -d . Account.java

%comp% -d . EinzahlungController.java
%comp% -d . AbhebungController.java

%comp% -d . AmountViewer.java

%comp% -d . MvcPanel.java
%comp% -d . MvcFrame.java
%comp% -d . MvcApplet.java

pause

appletviewer MvcApplet1.html

jar -cmf  manifest.mf %verz%.jar ch\jmb\%verz%\*.class 

del ch\jmb\%verz%\*.class
rd  ch\jmb\%verz%
rd  ch\jmb
rd  ch

appletviewer MvcApplet2.html

pause

set classpath=.\%verz%.jar;%classpath%
java ch.jmb.%verz%.MvcFrame

pause
