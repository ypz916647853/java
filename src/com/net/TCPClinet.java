package com.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClinet {

	public static void main(String[] args) throws Exception, Exception {
		Socket khdtjz=new Socket("10.2.103.31",8899);
		OutputStream os=khdtjz.getOutputStream();
		FileInputStream fin=new FileInputStream("d:\\1.jpg");
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {			
			//System.out.print((char)b);
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		InputStream is=khdtjz.getInputStream();
		//byte[]zjhc=new byte[1024];
		b=is.read(zjhc);
		while(b!=-1) {			
			//System.out.print((char)b);
			System.out.print(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();

	}

}