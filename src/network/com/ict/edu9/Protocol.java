package network.com.ict.edu9;

import java.io.Serializable;
import java.util.List;

import network.com.ict.edu9db.VO;

public class Protocol implements Serializable {
	// 0: 종료 1:전체보기 2:삽입 3:삭제(custid로) 4:검색(custid로)
	int cmd;
	int result;
	List<VO> list;
	VO vo; //한 개짜리를 위해
	
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public List<VO> getList() {
		return list;
	}
	public void setList(List<VO> list) {
		this.list = list;
	}
	public VO getVo() {
		return vo;
	}
	public void setVo(VO vo) {
		this.vo = vo;
	}
}