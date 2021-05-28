package com.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReservationController {
	
	@Autowired
    private CustomerRepository custRepository;
	@Autowired
	private HotelRepository hotelRepository;
	@Autowired
	private ReservationRepository reservationRepository;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	  
	@RequestMapping("/profile")
	public String profile(Model model)
	{
		return "profile";
	}
	
	@PostMapping("/profile")
	public ModelAndView profilePost(
	            @RequestParam("userName") String userName,
	            @RequestParam("pw") String pw)
	{
		ModelAndView model = new ModelAndView();
		Customer cust = custRepository.CheckPassword(userName);
		if (cust.getPw().equals(pw))
		{
			model.setViewName("profile");
			model.addObject("CustomerKey",cust);
			return model;
		}
		return new ModelAndView("signin");
    }
	
	@RequestMapping("/reservationList")
	public String reservationList(Model model)
	{
		model.addAttribute("reservations", reservationRepository.findAll());
		return "reservationList";
	}
	
	@PostMapping("/reservationList")
	public String reservationList(Model model,  @RequestParam("custId") Integer custId)
	{
		
		
		Reservation rest = reservationRepository.CheckcustId(custId);
		model.addAttribute("CustomerKey",rest);
		return "reservationList";
	}
	
	
	@PostMapping("/reservationDelete")
	public String reservationDelete(Model model, @RequestParam("resId") int resId)
	{
		reservationRepository.deleteById(resId);
		model.addAttribute("reservations", reservationRepository.findAll());
		
		return "reservationList";
	}
	
	@RequestMapping("/registration")
	public String registration()
	{
		return "registration";
	}
	
	@RequestMapping("/registrationConfirmation")
	public String registrationConfirmation()
	{
		return "registrationConfirmation";
	}

	@RequestMapping("/signin")
	public String signin()
	{
		return "signin";
	}
	
	@PostMapping("/registration")
	public String registration(
	            @RequestParam("userName") String userName,
	            @RequestParam("pw") String pw,
	            @RequestParam("email") String email,
	            @RequestParam("firstname") String firstname,
	    		@RequestParam("lastname") String lastname,
				@RequestParam("phoneNumber") String phoneNumber,
				@RequestParam("address") String address,
				@RequestParam("city") String city,
				@RequestParam("postalCode") String postalCode,
				@RequestParam("country") String country)
	    
	    {
			Customer employee= new Customer( userName,  pw, email, firstname,  lastname,
					 phoneNumber,  address,  city,  postalCode,  country);
			custRepository.save(employee);
        return "registrationConfirmation";
    }
	
	@RequestMapping("/hotel")
	public String hotel(Model model)
	{
		model.addAttribute("hotels", hotelRepository.findAll());
		return "hotel";
	}	
	
	@RequestMapping("/reservation")
	public String reservation()
	{
		return "reservation";
	}
	
	@PostMapping("/reservation")
	public String reservation(
	            @RequestParam("totalNights") int totalNights,
	            @RequestParam("totalGuest") int totalGuest,
	            @RequestParam("custId") Customer custId,
	            @RequestParam("roomId") int roomId
	            )
	    
	    {
		Reservation res= new Reservation(totalNights, totalGuest, custId, roomId);
		reservationRepository.save(res);
        return "payment";
    }
	

	@RequestMapping ("/payment")
	public String payment()
	{
		return "payment";
	}
	
	@RequestMapping ("/paymentConfirmation")
	public String paymentConfirmation()
	{
		return "paymentConfirmation";
	}
	
	
	@RequestMapping("/customerEdit")
	 public String customerEdit()
	{
			return "customerEdit";
	}
	
	@PostMapping("/customerEdit")
	 public  String customerEdit(
			 @RequestParam("custId") int custId,
			 @RequestParam("userName") String userName,
				@RequestParam("pw") String pw,
	            @RequestParam("email") String email,
	 			@RequestParam("firstname") String firstname,
	 			@RequestParam("lastname") String lastname,
				@RequestParam("phoneNumber") String phoneNumber,
				@RequestParam("address") String address,
				@RequestParam("city") String city,
				@RequestParam("postalCode") String postalCode,
				@RequestParam("country") String country)
	 	
	   
	{
		Customer cust= new Customer(custId, userName, pw, email,firstname,lastname,phoneNumber,address,city,postalCode ,country);
		custRepository.save(cust);
			return "customerEditConfirmation";
	}
	

	@RequestMapping("/reservationEdit")
	 public String reservationEdit()
	{
			return "reservationEdit";
	}
	
	
	@PostMapping("/reservationEdit")
	 public  String reservationEdit(
			 @RequestParam("reservationId") int reservationId,
			 @RequestParam("totalNights") int totalNights,
				@RequestParam("totalGuest") int totalGuest,
				@RequestParam("custId") Customer custId,
				@RequestParam("roomId") int roomId)
	 	
	   
	{
		Reservation res= new Reservation(reservationId, totalNights, totalGuest, custId, roomId);
		reservationRepository.save(res);
			return "reservationEditConfirmation";
	}
	
	
	@RequestMapping("/reservationEditConfirmation")
	 public String reservationEditConfirmation()
	{
			return "reservationEditConfirmation";
	}
	

}
