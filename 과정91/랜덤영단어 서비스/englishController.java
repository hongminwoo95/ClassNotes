package www.silver.hom;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class englishController {

	@RequestMapping(value = "/english", method = RequestMethod.GET)
	public String english(Locale locale, Model model) {
		englishService englishService = new englishService();
		List<englishDTO> list = englishService.all();

			model.addAttribute("words", list);
			
		return "english/english";
	}
	
	
}
