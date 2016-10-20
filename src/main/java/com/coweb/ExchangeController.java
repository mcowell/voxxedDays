package com.coweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExchangeController {

	@RequestMapping(value="/{currency}/exchange-rate", method = RequestMethod.GET)
	@ResponseBody
	public String getExchangeRate(@PathVariable("currency") String currency) {
		if (currency.equals("usd"))
		{
			return "1.00";
		}
		else
		{
			return "not suppported";
		}
}

}
