package www.silver.hom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class englishService {

	String[][] englishword = {
			{"���","����Ʈ","�Ȱ�","���","�п�","�����","�ٳ���","ü��","���߾���","��ȭ��","����","Ű��","����","����","������","����","��","�ڵ���","����","ģ��"},
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
