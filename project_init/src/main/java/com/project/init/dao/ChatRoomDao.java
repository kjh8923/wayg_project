package com.project.init.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.project.init.dto.ChatRoomDto;

public class ChatRoomDao {
	
	private Map<String, ChatRoomDto> chatRoomDtoMap;
	
	@PostConstruct
	private void init() {
		chatRoomDtoMap = new LinkedHashMap<>();
	}
	
	public List<ChatRoomDto> findAllRooms() {
		//채팅방 생성 순서 최근 순으로 반환
		List<ChatRoomDto> result = new ArrayList<>(chatRoomDtoMap.values());
		Collections.reverse(result);
		
		return result;
	}
	
	public ChatRoomDto findRoomById(String id) {
		return chatRoomDtoMap.get(id);
	}
}