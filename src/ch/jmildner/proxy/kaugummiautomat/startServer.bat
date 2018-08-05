
rem java ch.jmildner.proxy.kaugummiautomat.TestKaugummiAutomat

set classpath=c:\jars\kaugummiautomat.jar;%classpath%

cd \

start rmiregistry

java   ch.jmildner.proxy.kaugummiautomat.TestKaugummiAutomat

pause
