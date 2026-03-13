package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Map;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class NotificationChannelGroupDetails implements Serializable {
    private static final String DESCRIPTION = StubApp.getString2(659);
    private static final String ID = StubApp.getString2(290);
    private static final String NAME = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
    public String description;
    public String id;
    public String name;

    public static NotificationChannelGroupDetails from(Map<String, Object> map) {
        NotificationChannelGroupDetails notificationChannelGroupDetails = new NotificationChannelGroupDetails();
        notificationChannelGroupDetails.id = (String) map.get(ID);
        notificationChannelGroupDetails.name = (String) map.get(NAME);
        notificationChannelGroupDetails.description = (String) map.get(DESCRIPTION);
        return notificationChannelGroupDetails;
    }
}
