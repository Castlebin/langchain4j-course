package com.pig4cloud.ai.langchain4j17rag3.service;

/**
 * @author lengleng
 * @date 2024/10/9
 */
public interface ChatAssistant {

    /**
     * 聊天
     *
     * @param message 消息
     * @return {@link String }
     */
    String chat(String message);
}
