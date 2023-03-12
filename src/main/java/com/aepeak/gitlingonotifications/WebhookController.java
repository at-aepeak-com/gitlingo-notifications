package com.aepeak.gitlingonotifications;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class WebhookController {
    @PostMapping("/webhook")
    public ResponseEntity<String> receiveWebhook(@RequestHeader("X-GitHub-Event") String eventType, @RequestBody String payload) {
        // process the webhook notification        
        log.info(eventType + ": " + payload);

        return ResponseEntity.ok(eventType + ": " + payload);
    }
}
