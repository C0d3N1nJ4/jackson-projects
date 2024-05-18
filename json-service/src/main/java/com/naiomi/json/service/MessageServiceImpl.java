package com.naiomi.json.service;

import com.naiomi.json.entities.Message;
import com.naiomi.json.repo.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService{

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    @Override
    public Optional<Message> getMessage(Long id){
        return messageRepository.findById(id);
    }

    @Override
    public List<Message> getAllMessages(){
        return messageRepository.findAll();
    }

    @Override
    public void saveMessage(Message message){
        messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Long id){
        messageRepository.deleteById(id);
    }

    @Override
    public void updateMessage(Long id, Message message){
        messageRepository.save(message);
    }

}
