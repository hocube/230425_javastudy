package network.com.ict.edu9;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import network.com.ict.edu9db.DAO;
import network.com.ict.edu9.DB_Server;
import network.com.ict.edu9db.VO;

public class CP_Client extends Thread {
	// 전역변수로 바꾸기
	Socket s;
	DB_Server server;

	// 입출력을 할 수있도록
	ObjectInputStream in;
	ObjectOutputStream out;
	String ip;
	int result;

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
				Object obj = in.readObject(); // 서버에서 Protocol 객체를 받아 읽는다.
				if (obj != null) {
					Protocol p = (Protocol) obj;
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
						VO vo = (VO) p.getVo(); // 2인 경우, VO 객체를 가져와 데이터베이스에 삽입
						// 삽입 성공 시 전체 목록을 가져와 Protocol 객체에 설정하고 클라이언트로 전송.
						result = DAO.getInsert(vo);
						if (result > 0) {
							list = DAO.getList();
							p.setList(list);
							out.writeObject(p); // 업데이트된 회원 정보가 담긴 Protocol을 클라이언트로 전송
							out.flush();
						}
						break;
					case 3:
						VO vo1 = (VO) p.getVo();
						result = DAO.getDelete(vo1);
						if (result > 0) {
							list = DAO.getList();
							p.setList(list);
							out.writeObject(p);
							out.flush();
						}
						break;
					case 4:
						VO vo2 = p.getVo();
						System.out.println("vo2: " + vo2);
						System.out.println("vo2.getCustid(): " + (vo2 != null ? vo2.getCustid() : "vo2 is null"));
						VO resultVO = DAO.getOne(vo2.getCustid()); // 전역변수에서 선언한 result는 int라 여기서는 사용할 수 없음.
						// DAO.getOne(vo2.getCustid())는 VO 객체를 반환하므로
						// 별도의 VO 타입 변수를 선언해야함.
					    if (resultVO != null) {
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
