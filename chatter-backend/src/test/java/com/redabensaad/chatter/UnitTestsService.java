package com.redabensaad.chatter;

import com.redabensaad.chatter.dao.entity.Channel;
import com.redabensaad.chatter.service.ChatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class UnitTestsService {

    @Autowired
    ChatService chatService;

    @Test
    void TestGetAllChannels() {
        assertTrue(chatService.getAllChannels().size() > 0);
    }

    @Test
    void TestGetChannelById() {
        assertEquals("GENERAL", chatService.getChannelById(1L).getName());
    }

    @Test
    void TestDeleteChannel() {
        assertEquals(false, chatService.deleteChannel(1L));
    }

    @Test
    void TestSaveChannel() {
        Channel canal = null;
        try {
            canal = chatService.saveChannel(new Channel("CanalJUnit", "Canal de tests unitaires", new ArrayList<>()));
            assertTrue(canal != null);
        } catch (DataIntegrityViolationException e) {
            assertTrue(canal == null);
        }
    }


}