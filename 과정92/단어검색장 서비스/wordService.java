package www.silver.hom;

import java.util.ArrayList;
import java.util.List;

public class wordService {

	String[][] word={ 
			{"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ"},
			{"감사", "날개", "달", "라면", "말", "본심", "사실"},
			{"1. 명사 : 고마움을 나타내는 인사", "1. 명사 : 새나 곤충의 몸 양쪽에 붙어서 날아다니는 데 쓰는 기관", "1. 명사 : 지구의 위성. 햇빛을 반사하여 밤에 밝은 빛을 낸다", "1. 명사 : 면,건더기,분말을 넣고 끓인 음식", "1. 명사 : 사람의 생각이나 느낌 따위를 표현하고 전달하는 데 쓰는 음성 기호", "1. 명사 : 본디부터 변함없이 그대로 가지고 있는 마음", "1. 명사 : 실제로 있었던 일이나 현재에 있는 일"},
			{"2. 명사 : 고밥게 여김. 또는 그런 마음", "2. 명사 : 공중에 잘 뜨게 하기 위하여 비행기의 양쪽 옆에 단 부분", "2. 명사 : 한 해를 열둘로 나눈 것 가운데 하나의 기간을 세는 단위", "2. 조사 : 모음으로 끝나는 체언이나 부사어의 뒤에 붙어, 어떤 대상을 조건으로 삼는 뜻을 나타내는 보조사", "2. 명사 : 음성 기호로 생각이나 느낌을 표현하고 전달하는 행위. 또는 그런 결과물", "2. 명사 : 꾸밈이나 거짓이 없는 참마음", "2. 명사 : 겉으로 드러나지 아니한 일을 솔직하게 말할 때 쓰는 말"}
	     	};

	
	public List<wordDTO> all(){
		List<wordDTO> list = new ArrayList();
		wordDTO a = null;
		for (int i=0; i < word[0].length; i++) {
			a = new wordDTO();
			a.setInitial(word[0][i]);
			a.setWord(word[1][i]);
			a.setNounone(word[2][i]);
			a.setNountwo(word[3][i]);
			list.add(a);
		}
		return list;
	}
	
	public List<wordDTO> search(String wordText){
		List<wordDTO> list = new ArrayList();
		wordDTO a = null;
		for (int i=0; i < word[0].length; i++) {
			String text = word[1][i];
			if (wordText.equals(text)) {
				a = new wordDTO();
				a.setInitial(word[0][i]);
				a.setWord(word[1][i]);
				a.setNounone(word[2][i]);
				a.setNountwo(word[3][i]);
				break;
			}				
		}
		list.add(a);		
		return list;	
	}
	public List<wordDTO> select(String wordText){
		List<wordDTO> list = new ArrayList();
		wordDTO a = null;
		for (int i=0; i < word[0].length; i++) {
			String text = word[0][i];
			if (wordText.equals(text)) {
				a = new wordDTO();
				a.setInitial(word[0][i]);
				a.setWord(word[1][i]);
				a.setNounone(word[2][i]);
				a.setNountwo(word[3][i]);
				break;
			}				
		}
		list.add(a);		
		return list;	
	}
	
	
	
}
