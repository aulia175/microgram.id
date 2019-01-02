package com.microgram.web.controller;

import java.util.List;

import com.microgram.web.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api/")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	RestTemplate restTemplate;	
	
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
//	
//	@GetMapping(value = "/status/{dealerId}")
//	private String getStatus(@PathVariable("dealerId") long dealerId) throws Exception {
//		String path = Setting.dealerUrl + "/dealer?id=" + dealerId;
//		return restTemplate.getForEntity(path,  String.class).getBody();
//	}
//
//	@GetMapping(value = "/full/{dealerId}")
//	private DealerDetail postStatus(@PathVariable("dealerId") long dealerId) throws Exception {
//		String path = Setting.dealerUrl + "/dealer";
//		DealerModel dealer = dealerService.getDealerDetailById(dealerId).get();
//		DealerDetail detail = restTemplate.postForObject(path, dealer, DealerDetail.class);
//		return detail;
//	}
//
//	@PostMapping(value="/add")
//	private DealerModel addDealerSubmit(@RequestBody DealerModel dealer) {
//		System.out.println("masuk");
//		dealerService.addDealer(dealer);
//		return dealer;
//	}
//	
//	@GetMapping(value="/{dealerId}")
//	private DealerModel viewDealer(@PathVariable("dealerId") long dealerId, Model model) {
//		return dealerService.getDealerDetailById(dealerId).get();
//		
//	}
//	
//	@DeleteMapping(value="/delete")
//	private String deleteDealer(@RequestParam("dealerId") long id,Model model) {
//		DealerModel dealer = dealerService.getDealerDetailById(id).get();
//		dealerService.deleteDealer(dealer);
//		return "Success";
//	}
//	
//	@PutMapping(value="/{id}")
//	private String updateDealerSubmit(
//			@PathVariable (value="id") long id,
//			@RequestParam("alamat")String alamat,
//			@RequestParam("telp")String telp) {
//		DealerModel dealer = (DealerModel) dealerService.getDealerDetailById(id).get();
//		if(dealer.equals(null)) {
//			return "couldn't find your dealer";
//		}
//		dealer.setAlamat(alamat);
//		dealer.setNoTelp(telp);
//		dealerService.updateDealer(id, dealer);
//		return "update success";
//	} 
//	@GetMapping()
//	private List<DealerModel> viewAllDealer(Model model){
//		System.out.println("masuk");
//		return dealerService.getDealerList();
//	}	
}