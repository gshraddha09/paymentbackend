package com.dbs.web.service;

import org.springframework.stereotype.Service;

import com.dbs.web.beans.Message;
import com.dbs.web.repository.MessageRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageService {
	@Autowired
	private MessageRepository repo;

	public Message findById(String msgcode) {
		try {
			Optional<Message> message = this.repo.findById(msgcode);
			return message.orElseThrow(() -> {
				return new EntityNotFoundException("Message with " + msgcode + " does not exist");
			});
		} catch (IllegalArgumentException iae) {
			return null;
		}
	}

	public List<Message> getMessages() {
		List<Message> m = new ArrayList<>();
		this.repo.findAll().forEach(msg -> m.add(msg));
		return m;
	}
}
