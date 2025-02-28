package com.pengrad.telegrambot.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

/**
 * stas
 * 8/5/15.
 */
public class Chat implements Serializable {
    private final static long serialVersionUID = 0L;

    public enum Type {
        @SerializedName("private") Private, group, supergroup, channel
    }

    private Long id;
    private Type type;

    //Channel and Group
    private String title;

    //Private and Channel
    private String username;

    //Private
    private String first_name;
    private String last_name;

    private ChatPhoto photo;
    private String bio;
    private Boolean has_private_forwards;
    private Boolean join_to_send_messages;
    private Boolean join_by_request;
    private String description;
    private String invite_link;
    private Message pinned_message;
    private ChatPermissions permissions;
    private Integer slow_mode_delay;
    private Integer message_auto_delete_time;
    private Boolean has_protected_content;
    private String sticker_set_name;
    private Boolean can_set_sticker_set;
    private Long linked_chat_id;
    private ChatLocation location;

    public Long id() {
        return id;
    }

    public Type type() {
        return type;
    }

    public String firstName() {
        return first_name;
    }

    public String lastName() {
        return last_name;
    }

    public String username() {
        return username;
    }

    public String title() {
        return title;
    }

    public ChatPhoto photo() {
        return photo;
    }

    public String bio() {
        return bio;
    }

    public Boolean hasPrivateForwards() {
        return has_private_forwards != null && has_private_forwards;
    }

    public Boolean joinToSendMessages() {
        return join_to_send_messages != null && join_to_send_messages;
    }

    public Boolean joinByRequest() {
        return join_by_request != null && join_by_request;
    }

    public String description() {
        return description;
    }

    public String inviteLink() {
        return invite_link;
    }

    public Message pinnedMessage() {
        return pinned_message;
    }

    public ChatPermissions permissions() {
        return permissions;
    }

    public Integer slowModeDelay() {
        return slow_mode_delay;
    }

    public Integer messageAutoDeleteTime() {
        return message_auto_delete_time;
    }

    public Boolean hasProtectedContent() {
        return has_protected_content != null && has_protected_content;
    }

    public String stickerSetName() {
        return sticker_set_name;
    }

    public Boolean canSetStickerSet() {
        return can_set_sticker_set != null && can_set_sticker_set;
    }

    public Long linkedChatId() {
        return linked_chat_id;
    }

    public ChatLocation location() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(id, chat.id) &&
                type == chat.type &&
                Objects.equals(first_name, chat.first_name) &&
                Objects.equals(last_name, chat.last_name) &&
                Objects.equals(username, chat.username) &&
                Objects.equals(title, chat.title) &&
                Objects.equals(photo, chat.photo) &&
                Objects.equals(bio, chat.bio) &&
                Objects.equals(has_private_forwards, chat.has_private_forwards) &&
                Objects.equals(join_to_send_messages, chat.join_to_send_messages) &&
                Objects.equals(join_by_request, chat.join_by_request) &&
                Objects.equals(description, chat.description) &&
                Objects.equals(invite_link, chat.invite_link) &&
                Objects.equals(pinned_message, chat.pinned_message) &&
                Objects.equals(permissions, chat.permissions) &&
                Objects.equals(slow_mode_delay, chat.slow_mode_delay) &&
                Objects.equals(message_auto_delete_time, chat.message_auto_delete_time) &&
                Objects.equals(has_protected_content, chat.has_protected_content) &&
                Objects.equals(sticker_set_name, chat.sticker_set_name) &&
                Objects.equals(can_set_sticker_set, chat.can_set_sticker_set) &&
                Objects.equals(linked_chat_id, chat.linked_chat_id) &&
                Objects.equals(location, chat.location);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type=" + type +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", photo=" + photo +
                ", bio='" + bio + '\'' +
                ", has_private_forwards=" + has_private_forwards +
                ", join_to_send_messages=" + join_to_send_messages +
                ", join_by_request=" + join_by_request +
                ", description='" + description + '\'' +
                ", invite_link='" + invite_link + '\'' +
                ", pinned_message=" + pinned_message +
                ", permissions=" + permissions +
                ", slow_mode_delay=" + slow_mode_delay +
                ", message_auto_delete_time=" + message_auto_delete_time +
                ", has_protected_content=" + has_protected_content +
                ", sticker_set_name='" + sticker_set_name + '\'' +
                ", can_set_sticker_set=" + can_set_sticker_set +
                ", linked_chat_id=" + linked_chat_id +
                ", location=" + location +
                '}';
    }
}
