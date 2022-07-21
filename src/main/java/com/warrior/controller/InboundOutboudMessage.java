package com.warrior.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InboundOutboudMessage {
	
	private String symbol;
	private String open;
	private String high;
	private String low;
	private String close;

}
