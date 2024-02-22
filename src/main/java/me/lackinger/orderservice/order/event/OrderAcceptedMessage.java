package me.lackinger.orderservice.order.event;

public record OrderAcceptedMessage(
		Long orderId
) {}
