package network.com.ict.edu7;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer implements Runnable {
	ServerSocket ss;

	// 접속자(대기자)의 정보를 저장하는 곳
	ArrayList<CopyClient> c_list;

	// 대화방을 저장하는 곳
	ArrayList<ChatRoom> r_list;
	
	public ChatServer() {
		c_list = new ArrayList<>();
		r_list = new ArrayList<>();
		try {
			ss = new ServerSocket(7779);
			System.out.println("서버 대기중...");
			new Thread(this).start();
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				Socket s = ss.accept();
				CopyClient cc = new CopyClient(s, this);
				cc.start();
				c_list.add(cc);
				
				
			} catch (Exception e) {
			}
		}
	}
	
	// 대기실에 있는 모든 접속자에게 메세지 전달
	public void sendMsg(Protocol p) {
		for (CopyClient k : c_list) {
			try {
				k.out.writeObject(p);
				k.out.flush();
			} catch (Exception e) {
			}
		}
	}
	
	// 방 목록에 방 추가
	public void addRoom(ChatRoom room) {
		r_list.add(room);
	}
	
	// index 받아서 list로부터 방 객체 하나를 반환
	public ChatRoom getRoom(int index) {
		return r_list.get(index);
	}
	
	// 현재 대기실에서 삭제
	public void removeClient(CopyClient cc) {
		c_list.remove(cc);
		
		// 목록 갱신
		// refresh();
	}
	
	// 대기실 목록 갱신(방 목록, 대기실 명단)
	public void refresh() {
		Protocol p = new Protocol();
		p.setCmd(2); //2번: 접속 및 갱신
		p.setNames(getUserName()); //대기실 명단 갱신
		p.setRooms(getRoomName()); //방 목록 갱신
		
		sendMsg(p);
	}
	
	// 프로토콜 가서 보면 setNames이 스트링 배열임. 그래서 얘도 스트링배열
	public String[] getUserName() {
		String[] arr = new String[c_list.size()]; //c_list의 size만큼 끄집어 내겠다(사이즈 알아내기)
		int i = 0;
		for (CopyClient k : c_list) {
			arr[i++] = k.nickName;
		}
		return arr;
	}
	
	public String[] getRoomName() {
		String[] arr = new String[r_list.size()];
		int i = 0;
		for (ChatRoom k : r_list) {
			arr[i++] = k.getTitle();
		}
		return arr;
	}
	
	public void addClient(CopyClient cc) {
		c_list.add(cc);
		refresh();
	}
	
	// 방 객체 삭제(방에서 나가기)
	// c_room : 채팅방 리스트
	public void removerRoom(ChatRoom c_room) {
		r_list.remove(c_room);
	}

	public static void main(String[] args) {
		new ChatServer();
	}
}