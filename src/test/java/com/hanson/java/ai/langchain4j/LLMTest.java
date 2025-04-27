package com.hanson.java.ai.langchain4j;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author hanson
 * @description: 大语言模型测试类
 * @date 2025-04-27 22:21:01
 * @version: 1.0
 */
@SpringBootTest
public class LLMTest {

    /**
     * deepseek api key:sk-6151959f318640a482bcc994067d3cf8
     * sk-6151959f318640a482bcc994067d3cf8
     *
     * langchain4j官网：https://docs.langchain4j.dev/get-started/
     */
    @Test
    public void testGPTDemo() {
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();
        String answer = model.chat("你是谁啊");
        System.out.println(answer);
    }

    // OpenAiChatModel类实现了ChatLanguageModel类，两个方法都可以
    @Autowired
//    private OpenAiChatModel openAiChatModel;
    private ChatLanguageModel chatLanguageModel;

    @Test
    public void testSpringBoot() {
        String answer = chatLanguageModel.chat("你是谁？");
//        String answer = openAiChatModel.chat("你是谁？");
        System.out.println(answer);
    }
}
