package dya28.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// OutputStreamWriter : 바이트 스트림을 문자스트림으로 변경
// OutputStream(바이트스트림) => OutputStreamWriter => BufferedWriter(문자스트림)

// InputStreamReader : 바이트 스트림을 문자스트림으로 변경
// InputStream => InputStreamWriter => BufferedReader

public class Ex02_OutputStreamWriter {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			//System.out.print("원하는 문자 : ");
			
			//모니터에 정보를 내보내자
			osw = new OutputStreamWriter(System.out); //System.out : 모니터. in은 키보드
			bw = new BufferedWriter(osw);
			bw.write("원하는 문자 : ");
			bw.flush();
			//이렇게 하면 우리가 System.out.println한거랑 똑같다.
			
			
			//키보드를 통해서 정보를 입력 받기
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			
			//받은 정보 출력
			bw.write("받은 문자 : " + msg);
			bw.flush();
			
			//여기까지 한게 스캐너와 System.out.println을 대신 한 것
			
		} catch (Exception e) {
		}finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
	}
}
