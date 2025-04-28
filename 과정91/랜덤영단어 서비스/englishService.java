package www.silver.hom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class englishService {

	String[][] englishword = {
			{"사과","아파트","안경","담배","학원","모니터","바나나","체리","대추야자","무화과","포도","키위","레몬","망고","오렌지","딸기","귤","자동차","교실","친구"},
			{"apple","apartment","glasses","cigarette","academy","monitor","banana","cherry","datepalm","fig","grape","kiwi","lemon","mango","orange","strawberry","tangerine","car","classroom","friend"}
	};
		
	public List<englishDTO> all(){
		Random r = new Random();
		List<englishDTO> list = new ArrayList();
		englishDTO dto = null;
		for (int i=0; i<5; i++) {
			dto = new englishDTO();
			int num = r.nextInt(20);			
			dto.setWord(englishword[0][num]);
			dto.setEnglishword(englishword[1][num]);
			list.add(dto);
		}			

		return list;
	}
	
	
}
