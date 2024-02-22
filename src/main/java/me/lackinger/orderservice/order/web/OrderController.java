package me.lackinger.orderservice.order.web;

import jakarta.validation.Valid;
import me.lackinger.orderservice.order.domain.Order;
import me.lackinger.orderservice.order.domain.OrderService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("orders")
public class OrderController {

	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@GetMapping
	public Flux<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

	@PostMapping
	public Mono<Order> submitOrder(@RequestBody @Valid OrderRequest orderRequest) {
		return orderService.submitOrder(orderRequest.isbn(), orderRequest.quantity());
	}

}
