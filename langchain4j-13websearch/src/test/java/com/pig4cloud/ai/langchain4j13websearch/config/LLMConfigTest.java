package com.pig4cloud.ai.langchain4j13websearch.config;

import com.pig4cloud.ai.langchain4j13websearch.service.ChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LLMConfigTest {

    @Autowired
    private ChatAssistant chatAssistant;

    /**
     * 测试Web搜索增强的问答功能
     * 验证系统能否通过互联网搜索获取实时信息并回答关于上证指数的问题
     */
    @Test
    void testWebSearchEnhancedQuestionAnswering() {
        String chat = chatAssistant.chat("今天20241008 上证指数是多少？");

        System.out.println(chat);
    }
}
