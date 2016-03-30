package com.example.umibiox.appet_proto.Net;

import android.content.Context;
import com.microsoft.windowsazure.mobileservices.MobileServiceClient;
import com.microsoft.windowsazure.mobileservices.table.TableQueryCallback;

import java.net.MalformedURLException;

/**
 * Created by william on 30/03/2016.
 */
public abstract class AzureClient<T> implements TableQueryCallback {

    MobileServiceClient client;

    public AzureClient(Context con){
        try{
            client = new MobileServiceClient( "https://proyectoappet.azure-mobile.net/",
                    "aqfHPzKMAIroOFFmACypKZGewOXQmA59",con);
        } catch(MalformedURLException ex){
            ex.printStackTrace();
        }

    }

}
