package network.com.ict.edu9;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import network.com.ict.edu9db.DAO;
import network.com.ict.edu9.DB_Server;
import network.com.ict.edu9db.VO;

public class CP_Client extends Thread{
	// 전역변수로 바꾸기
		Socket s;
		DB_Server server;

		// 입출력을 할 수있도록
		ObjectInputStream in;
		ObjectOutputStream out;
		String ip;

		public CP_Client(Socket s, DB_Server server) {
			this.s = s;
			this.server = server;
			try {
				System.out.println("CP_Client in&out 실행");
				in = new ObjectInputStream(s.getInputStream());
				out = new ObjectOutputStream(s.getOutputStream());
			} catch (Exception e) {
			}
		}

		@Override
		public void run() {
			esc: while (true) {
				try {
					System.out.println("CP_Client run() 실행");
					Object obj = in.readObject();
					if(obj != null) {
						Protocol p = (Protocol)obj;
						switch (p.getCmd()) {
						case 0:
							out.writeObject(p);
							out.flush();
							break esc;
						case 1:
							System.out.println("CP_Client run()의 case 1 실행");
							List<VO> list = DAO.getList();
							p.setList(list);
							out.writeObject(p);
							out.flush();
							break;
						case 2:
							VO vo = (VO)p.getVo(); // VO 객체를 직접 프로토콜에서 가져옵니다.
							int result = DAO.getInsert(vo);
							if(result > 0) {
								list = DAO.getList();
								p.setList(list);
								out.writeObject(p);
								out.flush();
							}
							break;
						}
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			try {
				out.close();
				in.close();
				s.close();
			} catch (Exception e) {
			}
		}
	}
