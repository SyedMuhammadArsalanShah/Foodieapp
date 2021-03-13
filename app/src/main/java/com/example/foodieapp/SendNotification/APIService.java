package com.example.foodieapp.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAxaZFGOc:APA91bG123Ux2MlYurPHhaEoPrcT2GWgiWwhMi2TYtXjZqXsRxxtsH0ojxInlilBILOjV6ChA4fWM_66EW11MUzda4E6khIsqQubrC-QDkck8W5YkIANKr1A-WFRyBBtwJ5Z9jucoXSz"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
