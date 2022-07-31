package com.sc9.hicto.event;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.sc9.hicto.api.HictoApi;
import com.sc9.hicto.api.model.EventDto;

import io.swagger.annotations.Api;

@Controller
@Api(tags = "Events")
public class EventController implements HictoApi {

	@Override
	public ResponseEntity<List<EventDto>> createEvent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<EventDto>> deleteEvent(Long eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<EventDto>> getEvent(Long eventId) {
		List<EventDto> result = new ArrayList<>();
		EventDto event = new EventDto();
		event.setId(1007L);
		event.setTitle("test title1");
		event.setContents("test contents1");
		event.setCreatedAt(OffsetDateTime.now());
		event.setUpdatedAt(OffsetDateTime.now());
		result.add(event);
		
		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<EventDto>> updateEvent(Long eventId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
