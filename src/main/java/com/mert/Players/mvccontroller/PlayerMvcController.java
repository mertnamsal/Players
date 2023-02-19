package com.mert.Players.mvccontroller;

import com.mert.Players.dto.request.PlayerSaveRequestDto;
import com.mert.Players.repository.entity.Group;
import com.mert.Players.service.GroupService;
import com.mert.Players.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

import static com.mert.Players.constant.EndPoints.*;

@Controller
@RequestMapping(MVCPLAYER)
@RequiredArgsConstructor
public class PlayerMvcController {

    private final PlayerService playerService;
    private final GroupService groupService;

    @GetMapping(REGISTER)
    public ModelAndView index(){
        ModelAndView model = new ModelAndView();
        model.setViewName("register");
        model.addObject("title","Player Registration");
        return model;
    }

    @PostMapping(REGISTER)
    public ModelAndView index(PlayerSaveRequestDto dto){
        ModelAndView model = new ModelAndView();

        if(playerService.existsPlayerByJerseyno(dto.getJerseyno())){
            model.setViewName("register");
        }else{

            playerService.register(dto);
            return new ModelAndView("redirect:register");
        }
        return model;


    }
}
