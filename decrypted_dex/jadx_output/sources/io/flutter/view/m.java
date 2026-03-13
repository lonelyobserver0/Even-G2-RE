package io.flutter.view;

import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import com.stub.StubApp;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Method f15212a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f15213b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f15214c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f15215d;

    public m() {
        Method method;
        Method method2;
        Method method3;
        String string2 = StubApp.getString2(18939);
        String string22 = StubApp.getString2(17879);
        Field field = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod(string2, new Class[0]);
        } catch (NoSuchMethodException unused) {
            Log.w(string22, StubApp.getString2(18940));
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod(string2, new Class[0]);
        } catch (NoSuchMethodException unused2) {
            Log.w(string22, StubApp.getString2(18941));
            method2 = null;
        }
        try {
            Field declaredField = AccessibilityNodeInfo.class.getDeclaredField(StubApp.getString2("18942"));
            declaredField.setAccessible(true);
            field = declaredField;
            method3 = Class.forName(StubApp.getString2("18943")).getMethod(StubApp.getString2("6443"), Integer.TYPE);
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
            Log.w(string22, StubApp.getString2(18944));
            method3 = null;
        }
        this.f15212a = method;
        this.f15213b = method2;
        this.f15214c = field;
        this.f15215d = method3;
    }

    public static Long a(m mVar, AccessibilityRecord accessibilityRecord) {
        String string2 = StubApp.getString2(17879);
        Method method = mVar.f15213b;
        if (method == null) {
            return null;
        }
        try {
            return (Long) method.invoke(accessibilityRecord, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.w(string2, StubApp.getString2(18946), e10);
            return null;
        } catch (InvocationTargetException e11) {
            Log.w(string2, StubApp.getString2(18945), e11);
            return null;
        }
    }

    public static boolean b(int i3, long j) {
        return (j & (1 << i3)) != 0;
    }
}
