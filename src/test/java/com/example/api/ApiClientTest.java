package com.example.api;

import api.ApiClient;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApiClientTest {

    @Test
    public void testFetchPost() throws Exception {
        ApiClient client = new ApiClient();
        JsonNode result = client.fetchPost();

        assertNotNull(result);
        assertEquals(1, result.get("id").asInt());
        assertEquals(1, result.get("userId").asInt());
    }

}
