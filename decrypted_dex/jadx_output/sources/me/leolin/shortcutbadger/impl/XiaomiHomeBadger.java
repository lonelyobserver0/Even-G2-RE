package me.leolin.shortcutbadger.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.stub.StubApp;
import ec.C0859b;
import ec.InterfaceC0858a;
import hc.b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XiaomiHomeBadger implements InterfaceC0858a {

    /* renamed from: a, reason: collision with root package name */
    public ResolveInfo f17358a;

    @Override // ec.InterfaceC0858a
    public final List a() {
        return Arrays.asList(StubApp.getString2(26125), StubApp.getString2(26126), StubApp.getString2(26127), StubApp.getString2(26128), StubApp.getString2(26129), StubApp.getString2(26123), StubApp.getString2(26124));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        Object valueOf;
        try {
            Object newInstance = Class.forName(StubApp.getString2("26130")).newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField(StubApp.getString2("26131"));
            declaredField.setAccessible(true);
            if (i3 == 0) {
                valueOf = "";
            } else {
                try {
                    valueOf = Integer.valueOf(i3);
                } catch (Exception unused) {
                    declaredField.set(newInstance, Integer.valueOf(i3));
                }
            }
            declaredField.set(newInstance, String.valueOf(valueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent(StubApp.getString2(26132));
            intent.putExtra(StubApp.getString2(26133), componentName.getPackageName() + StubApp.getString2(601) + componentName.getClassName());
            intent.putExtra(StubApp.getString2(26134), String.valueOf(i3 == 0 ? "" : Integer.valueOf(i3)));
            try {
                b.U(context, intent);
            } catch (C0859b unused3) {
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase(StubApp.getString2(21084))) {
            if (this.f17358a == null) {
                Intent intent2 = new Intent(StubApp.getString2(25994));
                intent2.addCategory(StubApp.getString2(25995));
                this.f17358a = context.getPackageManager().resolveActivity(intent2, PKIFailureInfo.notAuthorized);
            }
            if (this.f17358a != null) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(StubApp.getString2(490));
                Notification build = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f17358a.getIconResource()).build();
                try {
                    Object obj = build.getClass().getDeclaredField(StubApp.getString2("26135")).get(build);
                    obj.getClass().getDeclaredMethod(StubApp.getString2("26136"), Integer.TYPE).invoke(obj, Integer.valueOf(i3));
                    notificationManager.notify(0, build);
                } catch (Exception e10) {
                    throw new C0859b(StubApp.getString2(26137), e10);
                }
            }
        }
    }
}
