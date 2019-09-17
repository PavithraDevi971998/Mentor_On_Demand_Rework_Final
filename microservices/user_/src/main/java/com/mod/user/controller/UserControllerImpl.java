package com.mod.user.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mod.user.dao.UserDao;
import com.mod.user.model.User;
import com.mod.user.service.UserService;






@Controller
public class UserControllerImpl implements UserController{
	@Autowired
	private UserService userSevice;
	
	@Autowired
	private UserDao userDao;
	@RequestMapping( value = "/addUsers", method = RequestMethod.GET)
	public String getUserForm(ModelMap model) {
		System.out.println("add User");
		User user=new User();
		model.addAttribute("user", user);
		System.out.println("hii");
		return "register";
	}
	@RequestMapping(path="/userList")
	public ModelAndView getuserList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("userList");
		mv.addObject("userList",userSevice.getuserList());
		return mv;
	}
	@RequestMapping(value = "/addUsers", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("user") @Valid User user, 
			BindingResult result, Model model) throws SQLException {
		System.out.println(user);
		if(result.hasErrors()){
			
			return "register";
		}
		userSevice.insertUser(user);
		System.out.println("inserted");
		return "redirect:/loginUser";
		}
	@RequestMapping(path="/loginUser")
	public String loginUser(Model model) throws Exception {
	       User user=new User();
	       System.out.println("hii");
	       model.addAttribute("user1", user);
	       return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String submit(@ModelAttribute("user1")  @Valid User user, BindingResult result,Model model) {
	     return "login";
	       
	}
	@RequestMapping(path = "/login", method = RequestMethod.POST)
    public ModelAndView login1(User user, Model model, HttpSession session) throws Exception  {

           ModelAndView mav = null;

           String email = user.getEmail();
           List<User> user1 = userSevice.findByemail(email);
System.out.println(user1);
           User user2 = user1.get(0);

           if ((user.getEmail().equals(user2.getEmail())) && (user.getPassword().equals(user2.getPassword()))) {

                session.setAttribute("user", user2);
                        mav = new ModelAndView("redirect:/mentorList");
                  }else {

                  mav = new ModelAndView("login", "message", "Invalid Username or Password");
           }

           return mav;

    }
	
	@RequestMapping(path="/updateStatus")
	public ModelAndView updateStatus(@RequestParam("id") int id,@RequestParam("userId") int userId){
	       ModelAndView mav=new ModelAndView();
	    //   Mentor mentor1=mentorDao.findBymentorId(id);
	       //mentorDao.save(mentor);
	       User user=userDao.findByid(userId);
	       
	       user.setStatusUser("RequestPending");
	       //mentor1.setStatusMentor("RequestSent");
	       //mentorDao.save(mentor1);
	       userDao.save(user);
	       mav=new ModelAndView("redirect:/mentorList");
	       return mav;
	}
	@RequestMapping(path="/welcome")
	public String welcome(Model model) throws Exception {
	       
	       return "welcome";
	}
	@RequestMapping(path="/admin")
	public String admin(Model model) throws Exception {
	       
	       return "admin";
	}
	
}