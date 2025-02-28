package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Mirco Ianese
 * 20 Apr 2022
 */
public class ChatAdministratorRights implements Serializable {

    private final static long serialVersionUID = 0L;

    private Boolean is_anonymous;
    private Boolean can_manage_chat;
    private Boolean can_delete_messages;
    private Boolean can_manage_video_chats;
    private Boolean can_restrict_members;
    private Boolean can_promote_members;
    private Boolean can_change_info;
    private Boolean can_invite_users;
    private Boolean can_post_messages;
    private Boolean can_edit_messages;
    private Boolean can_pin_messages;

    public Boolean isAnonymous() {
        return is_anonymous;
    }

    public Boolean canManageChat() {
        return can_manage_chat;
    }

    public Boolean canDeleteMessages() {
        return can_delete_messages;
    }

    public Boolean canManageVideoChats() {
        return can_manage_video_chats;
    }

    public Boolean canRestrictMembers() {
        return can_restrict_members;
    }

    public Boolean canPromoteMembers() {
        return can_promote_members;
    }

    public Boolean canChangeInfo() {
        return can_change_info;
    }

    public Boolean canInviteUsers() {
        return can_invite_users;
    }

    public Boolean canPostMessages() {
        return can_post_messages;
    }

    public Boolean canEditMessages() {
        return can_edit_messages;
    }

    public Boolean canPinMessages() {
        return can_pin_messages;
    }

    public ChatAdministratorRights canManageChat(boolean canManageChat) {
        this.can_manage_chat = canManageChat;
        return this;
    }
    
    public ChatAdministratorRights canDeleteMessages(boolean canDeleteMessages) {
        this.can_delete_messages = canDeleteMessages;
        return this;
    }

    public ChatAdministratorRights canManageVideoChats(boolean canManageVideoChats) {
        this.can_manage_video_chats = canManageVideoChats;
        return this;
    }

    public ChatAdministratorRights canRestrictMembers(boolean canRestrictMembers) {
        this.can_restrict_members = canRestrictMembers;
        return this;
    }

    public ChatAdministratorRights canPromoteMembers(boolean canPromoteMembers) {
        this.can_promote_members = canPromoteMembers;
        return this;
    }

    public ChatAdministratorRights canChangeInfo(boolean canChangeInfo) {
        this.can_change_info = canChangeInfo;
        return this;
    }

    public ChatAdministratorRights canInviteUsers(boolean canInviteUsers) {
        this.can_invite_users = canInviteUsers;
        return this;
    }

    public ChatAdministratorRights canPostMessages(boolean canPostMessages) {
        this.can_post_messages = canPostMessages;
        return this;
    }

    public ChatAdministratorRights canEditMessages(boolean canEditMessages) {
        this.can_edit_messages = canEditMessages;
        return this;
    }

    public ChatAdministratorRights canPinMessages(boolean canPinMessages) {
        this.can_pin_messages = canPinMessages;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatAdministratorRights that = (ChatAdministratorRights) o;
        return Objects.equals(is_anonymous, that.is_anonymous) && Objects.equals(can_manage_chat, that.can_manage_chat) && Objects.equals(can_delete_messages, that.can_delete_messages) && Objects.equals(can_manage_video_chats, that.can_manage_video_chats) && Objects.equals(can_restrict_members, that.can_restrict_members) && Objects.equals(can_promote_members, that.can_promote_members) && Objects.equals(can_change_info, that.can_change_info) && Objects.equals(can_invite_users, that.can_invite_users) && Objects.equals(can_post_messages, that.can_post_messages) && Objects.equals(can_edit_messages, that.can_edit_messages) && Objects.equals(can_pin_messages, that.can_pin_messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(is_anonymous, can_manage_chat, can_delete_messages, can_manage_video_chats, can_restrict_members, can_promote_members, can_change_info, can_invite_users, can_post_messages, can_edit_messages, can_pin_messages);
    }

    @Override
    public String toString() {
        return "ChatAdministratorRights{" +
                "is_anonymous=" + is_anonymous +
                ", can_manage_chat=" + can_manage_chat +
                ", can_delete_messages='" + can_delete_messages + '\'' +
                ", can_manage_video_chats=" + can_manage_video_chats +
                ", can_restrict_members=" + can_restrict_members +
                ", can_promote_members=" + can_promote_members +
                ", can_change_info=" + can_change_info +
                ", can_invite_users=" + can_invite_users +
                ", can_post_messages=" + can_post_messages +
                ", can_edit_messages=" + can_edit_messages +
                ", can_pin_messages=" + can_pin_messages +
                '}';
    }

}
