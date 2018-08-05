package ch.jmildner.proxy.kaugummiautomat;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface KaugummiAutomatRemote extends Remote
{
	String getBericht() throws RemoteException;
}
