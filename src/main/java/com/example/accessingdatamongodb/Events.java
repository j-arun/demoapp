package com.example.accessingdatamongodb;

import org.springframework.data.annotation.Id;


public class Events {

	@Id
	public String id;

	public String name;
	public String content;
	public String ts1;
	public String ts2;
	public String cs;

	public Events() {}

	@Override
	public String toString() {
		return String.format(
				"Event[id=%s']", id);
	}

}

