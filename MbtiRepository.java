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
	List<MbtiDTO> mbtiList = new ArrayList<>(); 
	
	public List<MbtiDTO> findAll() {
		return mbtiList;
		
	}
	
	public List<MbtiDTO> mbtiList(String account) {
		List<MbtiDTO> mbtiList = new ArrayList<>();
		for (MbtiDTO mbtiDTO : mbtiList) {
			if (mbtiDTO.getEiResult().equals(eiResult)) {
				mbtiList.add(mbtiDTO);
			}
		}
		return mbtiList;
	
	

	


}
}