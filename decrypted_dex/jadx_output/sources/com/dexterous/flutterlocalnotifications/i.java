package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationDetails f11121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11122b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11123c;

    public i(NotificationDetails notificationDetails, int i3, ArrayList arrayList) {
        this.f11121a = notificationDetails;
        this.f11122b = i3;
        this.f11123c = arrayList;
    }

    public final String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f11121a + ", startMode=" + this.f11122b + ", foregroundServiceTypes=" + this.f11123c + '}';
    }
}
