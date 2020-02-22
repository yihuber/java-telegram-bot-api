package com.pengrad.telegrambot;

import com.pengrad.telegrambot.model.*;
import com.pengrad.telegrambot.request.*;
import com.pengrad.telegrambot.response.*;

import org.junit.*;

import java.io.File;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

import okhttp3.*;
import okhttp3.logging.*;

import static org.junit.Assert.*;

/**
 * stas
 * 5/2/16.
 */
public class TelegramBotTest {

    TelegramBot bot;
    Integer chatId;
    Long groupId;
    Integer forwardMessageId = 1;
    Integer forwardMessageIdUser = 23714;
    String stickerId = "BQADAgAD4AAD9HsZAAGVRXVaYXiJVAI";
    String channelName = "@bottest";
    Long channelId = -1001002720332L;
    Integer memberBot = 215003245;
    String privateKey;
    String testPassportData;
    String testCallbackQuery;
    String testUpdate;

    Path resourcePath = Paths.get("src/test/resources");
    File imageFile = resourcePath.resolve("image.jpg").toFile();
    byte[] imageBytes = Files.readAllBytes(imageFile.toPath());
    File stickerFile = resourcePath.resolve("imageSticker.png").toFile();
    File stickerFileAnim = resourcePath.resolve("sticker_anim.tgs").toFile();
    File audioFile = resourcePath.resolve("beep.mp3").toFile();
    byte[] audioBytes = Files.readAllBytes(audioFile.toPath());
    File docFile = resourcePath.resolve("doc.txt").toFile();
    byte[] docBytes = Files.readAllBytes(docFile.toPath());
    File videoFile = resourcePath.resolve("tabs.mp4").toFile();
    byte[] videoBytes = Files.readAllBytes(videoFile.toPath());
    File videoNoteFile = resourcePath.resolve("video_note.mp4").toFile();
    byte[] videoNoteBytes = Files.readAllBytes(videoNoteFile.toPath());
    String certificateFile = resourcePath.resolve("cert.pem").toString();
    String someUrl = "http://google.com/";
    String audioFileId = "CQADAgADXAADgNqgSevw7NljQE4lAg";
    String docFileId = "BQADAgADuwADgNqYSaVAUsHMq6hqAg";
    String voiceFileId = "AwADAgADYwADuYNZSZww_hkrzCIpAg";
    String videoFileId = "BAADAgADZAADuYNZSXhLnzJTZ2yvAg";
    String photoFileId = "AgADAgADDKgxG7mDWUlvyFIJ9XfF9yszSw0ABBhVadWwbAK1z-wIAAEC";
    String gifFileId = "CgADAgADfQADgNqgSTt9SzatJhc3FgQ";
    String withSpaceFileId = "BAADAgADZwADkg-4SQI5WM0SPNHrAg";
    String stickerSet = "testset_by_pengrad_test_bot";
    String imageUrl = "https://telegram.org/img/t_logo.png";
    File thumbFile = resourcePath.resolve("thumb.jpg").toFile();
    byte[] thumbBytes = Files.readAllBytes(thumbFile.toPath());
    Integer thumbSize = 3718;
    File gifFile = resourcePath.resolve("anim3.gif").toFile();
    byte[] gifBytes = Files.readAllBytes(gifFile.toPath());

    public TelegramBotTest() throws IOException {
        String token, chat, group;
        boolean localBuild = false;

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("local.properties"));

            token = properties.getProperty("TEST_TOKEN");
            chat = properties.getProperty("CHAT_ID");
            group = properties.getProperty("GROUP_ID");
            privateKey = properties.getProperty("PRIVATE_KEY");
            testPassportData = properties.getProperty("TEST_PASSPORT_DATA");
            testCallbackQuery = properties.getProperty("TEST_CALLBACK_QUERY");
            testUpdate = properties.getProperty("TEST_JSON");
            localBuild = true;

        } catch (Exception e) {
            token = System.getenv("TEST_TOKEN");
            chat = System.getenv("CHAT_ID");
            group = System.getenv("GROUP_ID");
            privateKey = System.getenv("PRIVATE_KEY");
            testPassportData = System.getenv("TEST_PASSPORT_DATA");
            testCallbackQuery = System.getenv("TEST_CALLBACK_QUERY");
            testUpdate = System.getenv("TEST_JSON");
        }
        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder()
                .connectTimeout(75, TimeUnit.SECONDS)
                .writeTimeout(75, TimeUnit.SECONDS)
                .readTimeout(75, TimeUnit.SECONDS)
                .addInterceptor(new RetryInterceptor(1000));
        if (localBuild) {
            okHttpBuilder.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
        }
        bot = new TelegramBot.Builder(token).okHttpClient(okHttpBuilder.build()).build();
        chatId = Integer.parseInt(chat);
        groupId = Long.parseLong(group);
    }

    @Test
    public void testParseUpdate() {
        Update u = BotUtils.parseUpdate(testUpdate);
        assertEquals(Integer.valueOf(874203432), u.updateId());
    }

    @Test
    public void getMe() {
        GetMeResponse response = bot.execute(new GetMe());
        User user = response.user();
        UserTest.checkUser(user);
        assertTrue(user.isBot());
        assertFalse(user.canJoinGroups()); // can be changed via BotFather
        assertTrue(user.canReadAllGroupMessages());
        assertTrue(user.supportsInlineQueries());
    }
}
