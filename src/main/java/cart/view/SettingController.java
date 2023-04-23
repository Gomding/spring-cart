package cart.view;

import cart.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingController {

    private final MemberService memberService;

    public SettingController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/settings")
    public String setting(Model model) {
        model.addAttribute("members", memberService.allMembers());
        return "settings";
    }
}
