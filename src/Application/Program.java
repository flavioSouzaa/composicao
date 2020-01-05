package Application;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import Entities.Order;
import Entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
     	
	//	Order order = new Order(1800,sdt.format(data),OrderStatus.PENDING_PAYMENT);
		Order order = new Order(1800,data , OrderStatus.DELIVERED);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
