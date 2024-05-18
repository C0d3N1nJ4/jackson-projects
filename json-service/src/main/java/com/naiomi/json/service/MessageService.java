package com.naiomi.json.service;

import com.naiomi.json.entities.Message;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface MessageService {

    Optional<Message> getMessage(Long id);

    List<Message> getAllMessages();

    void saveMessage(Message message);

    void deleteMessage(Long id);

    void updateMessage(Long id, Message message);


}
