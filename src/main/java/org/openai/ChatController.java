package org.openai;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    private final OpenAiChatModel openAiChatModel;

    public ChatController(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    @RequestMapping("/tell-jokes")
    public String tellJokes() {
        System.out.println("Inside tell jokes");
        String value = openAiChatModel.call("Tell me a joke");
        return "Joke is: "+value;
    }
}
