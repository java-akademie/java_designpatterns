rd  ch /s
del *.jar

javac -d . *.java

jar -cmf  manifest.mf kaugummiautomat1.jar ch\jmildner\state\kaugummiautomat1\*.class 

set classpath=.\kaugummiautomat1.jar;%classpath%
java ch.jmildner.state.kaugummiautomat1.TestKaugummiAutomat
java ch.jmildner.state.kaugummiautomat1.SwingFrame

pause
