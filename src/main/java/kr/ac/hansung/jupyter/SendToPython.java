package kr.ac.hansung.jupyter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SendToPython {

	private static SendToPython sendToPython = new SendToPython();
	private static String HOST = "127.0.0.1";
	private static int PORT = 10000;
	private static int BUFSIZE = 1024;
	private String receiveData;

	public String getReceiveData() {
		return receiveData;
	}

	private SendToPython() {
		System.out.println("//////////");
	}
	
	public static synchronized SendToPython getInstance() {
		return sendToPython;
	}

	public String ClientRun(String data) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			socket = new Socket(HOST, PORT);
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);

			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			bw.write(data);
			bw.newLine();
			bw.flush();

			receiveData = "";
			receiveData = br.readLine();
			System.out.println("서버로부터 받은 데이터 : " + receiveData);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				osw.close();
				os.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return receiveData;
	}

	/*public static void main(String[] args) throws IOException {

		SendToPython cm = SendToPython.getInstance();
		String receiveData = cm.ClientRun("9.8, 2.3, 7.5, 8.2, 6.7");
		System.out.println(receiveData);
	}*/

}
