package com.cabal.app.Utils;

import androidx.annotation.NonNull;

import java.util.Arrays;

public class AfterRegisterUserData {
    private String avatar;
    private String nickname;
    private Integer[] hobbies;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(Integer[] hobbies) {
        this.hobbies = hobbies;
    }

    public AfterRegisterUserData(String avatar, String nickname, Integer[] hobbies) {
        this.avatar = avatar;
        this.nickname = nickname;
        this.hobbies = hobbies;
    }

    @NonNull
    @Override
    public String toString() {
        return "AfterRegisterUserData{" +
                "avatar length='" + avatar.length() + '\'' +
                ", nickname='" + nickname + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}