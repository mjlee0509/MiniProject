package miniProject;

import java.util.HashMap;
import java.util.Map;

import day17.ClientDTO;

public class MbtiRepository {
	
	private static MbtiRepository mbtiRepository = new MbtiRepository();
	private MbtiRepository() {}
	public static MbtiRepository getInstance() {
		return mbtiRepository;
	}
	MbtiDTO mbtiDTO = new MbtiDTO();
	Map<Integer, ClientDTO> cMap = new HashMap<>();
	
//	public boolean ieResult(MbtiDTO mbtiDTO) {
//		
//	}


}
