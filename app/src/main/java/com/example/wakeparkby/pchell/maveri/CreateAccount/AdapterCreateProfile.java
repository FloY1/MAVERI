package com.example.wakeparkby.pchell.maveri.CreateAccount;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

import com.example.wakeparkby.pchell.maveri.Database.DatabaseProfile;
import com.example.wakeparkby.pchell.maveri.MainMenu.ActivityMainMenu;
import com.example.wakeparkby.pchell.maveri.Profile.Profile;
import com.example.wakeparkby.pchell.maveri.SignIn.ActivitySignIn;
/**
 * класс для связи логики и интерфейса создания профиля
 */
public class AdapterCreateProfile {

    /**
     * начало активити входа
     * @param context базовый параметр
     */
    public static void startActivitySignIn(Context context) {
        Intent intent_signIn = new Intent(context, ActivitySignIn.class);
        context.startActivity(intent_signIn);
    }

    /**
     * конструктор с параметрами
     * @param userKey номер пользователя
     * @param firstName Имя
     * @param lastName Фамилия
     * @param age возраст
     * @param interestString список интересов
     */
    public AdapterCreateProfile(String userKey, String firstName, String lastName, String age, String interestString) {
        DatabaseProfile databaseProfile = new DatabaseProfile();
        databaseProfile.newProfile(userKey, firstName, lastName, age, interestString);
    }


}
