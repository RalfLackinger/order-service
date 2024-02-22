package me.lackinger.orderservice.order.event;

public record OrderDispatchedMessage(
		Long orderId
) {}
