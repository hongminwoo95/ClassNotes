package www.silver.hom;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class wordController {

	wordService w = new wordService();
	
	@RequestMapping(value = "/w", method = RequestMethod.GET)
	public String word(Locale locale, Model model) {
		return "word/word";
	}
	
	@RequestMapping(value = "/allw", method = RequestMethod.GET)
	public String wordAll(Locale locale, Model model) {
		List<wordDTO> list = w.all();
		model.addAttribute("wordlist", list);
		return "word/word";
	}
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String word1(@RequestParam(required=false) String wordText , Model model) {
		List<wordDTO> list = w.search(wordText);
		model.addAttribute("wordlist", list);
		return "word/word";
	}
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String word2(@RequestParam(required=false) String wordText , Model model) {
		List<wordDTO> list = w.select(wordText);
		model.addAttribute("wordlist", list);
		return "word/word";
	}
	
}
