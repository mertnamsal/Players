package com.mert.Players.mvccontroller;

import com.mert.Players.mvccontroller.models.GroupIndexModel;
import com.mert.Players.mvccontroller.models.PlayerIndexModel;
import com.mert.Players.repository.entity.Player;
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
@RequestMapping(MVCGROUP)
@RequiredArgsConstructor
public class GroupMvcController {
    private final GroupService groupService;
    private final PlayerService playerService;

    @GetMapping(INDEX)
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        GroupIndexModel model = new GroupIndexModel();
        model.setName0(groupService.findById(0L).get().getName());
        model.setName0(groupService.findById(1L).get().getName());
        model.setName0(groupService.findById(2L).get().getName());
        model.setPlayerList0(groupService.findById(0L).get().getPlayers());
        model.setPlayerList1(groupService.findById(1L).get().getPlayers());
        model.setPlayerList2(groupService.findById(2L).get().getPlayers());
        modelAndView.addObject("model",model);


        return modelAndView;
    }
    @PostMapping(REMOVE)
    public ModelAndView remove(Long id,int groupid){
        Optional<Player> player = playerService.findById(id);
        if(player.isPresent()){
            Player playerr = player.get();

            playerr.setGroup(groupService.findById((long)groupid).get());
            playerService.save(playerr);
        }
        System.out.println(groupid);
        return new ModelAndView("redirect:index");
    }
}
