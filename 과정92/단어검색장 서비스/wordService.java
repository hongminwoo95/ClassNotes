package www.silver.hom;

import java.util.ArrayList;
import java.util.List;

public class wordService {

	String[][] word={ 
			{"��", "��", "��", "��", "��", "��", "��"},
			{"����", "����", "��", "���", "��", "����", "���"},
			{"1. ��� : ������ ��Ÿ���� �λ�", "1. ��� : ���� ������ �� ���ʿ� �پ ���ƴٴϴ� �� ���� ���", "1. ��� : ������ ����. �޺��� �ݻ��Ͽ� �㿡 ���� ���� ����", "1. ��� : ��,�Ǵ���,�и��� �ְ� ���� ����", "1. ��� : ����� �����̳� ���� ������ ǥ���ϰ� �����ϴ� �� ���� ���� ��ȣ", "1. ��� : ������� ���Ծ��� �״�� ������ �ִ� ����", "1. ��� : ������ �־��� ���̳� ���翡 �ִ� ��"},
			{"2. ��� : ���� ����. �Ǵ� �׷� ����", "2. ��� : ���߿� �� �߰� �ϱ� ���Ͽ� ������� ���� ���� �� �κ�", "2. ��� : �� �ظ� ���ѷ� ���� �� ��� �ϳ��� �Ⱓ�� ���� ����", "2. ���� : �������� ������ ü���̳� �λ���� �ڿ� �پ�, � ����� �������� ��� ���� ��Ÿ���� ������", "2. ��� : ���� ��ȣ�� �����̳� ������ ǥ���ϰ� �����ϴ� ����. �Ǵ� �׷� �����", "2. ��� : �ٹ��̳� ������ ���� ������", "2. ��� : ������ �巯���� �ƴ��� ���� �����ϰ� ���� �� ���� ��"}
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
