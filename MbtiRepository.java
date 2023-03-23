package miniProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day17.ClientDTO;

public class MbtiRepository {
	
	private static MbtiRepository mbtiRepository = new MbtiRepository();
	private MbtiRepository() {}
	public static MbtiRepository getInstance() {
		return mbtiRepository;
	}
	MbtiDTO mbtiDTO = new MbtiDTO();
	List<MbtiDTO> resultList = new ArrayList<>(); 
	
	public boolean save(MbtiDTO mbtiDTO) {
		boolean result = resultList.add(mbtiDTO);
		return result;
	}
		
	public List<MbtiDTO> findAll() {
		return resultList;
	}
	
//	public MbtiDTO findById(String nick, String password) {
//		for (MbtiDTO mbtiDTO : resultList) {
//			if (mbtiDTO.getNick().equals(nick)) {
//				return mbtiDTO;
//			}
//
//		}
//		return null;
//
//	}



	
//	public List<MbtiDTO> mbtiList(String account) {
//		List<MbtiDTO> mbtiList = new ArrayList<>();
//		return mbtiList;
	
	

	


}
