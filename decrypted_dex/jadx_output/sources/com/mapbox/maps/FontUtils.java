package com.mapbox.maps;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import com.stub.StubApp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/FontUtils;", "", "()V", "DEFAULT_FONT", "", "DEFAULT_FONT_STACKS", "", "TAG", "TYPEFACE_FONTMAP_FIELD_NAME", "deviceFonts", "getDeviceFonts", "()Ljava/util/List;", "extractValidFont", "font", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FontUtils {
    private static final String DEFAULT_FONT = StubApp.getString2(1999);
    private static final String TAG = StubApp.getString2(13912);
    private static final String TYPEFACE_FONTMAP_FIELD_NAME = StubApp.getString2(13913);
    public static final FontUtils INSTANCE = new FontUtils();
    private static final List<String> DEFAULT_FONT_STACKS = CollectionsKt.listOf((Object[]) new String[]{StubApp.getString2(1999), StubApp.getString2(13911), StubApp.getString2(13910)});

    private FontUtils() {
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    private final List<String> getDeviceFonts() {
        ArrayList arrayList = new ArrayList();
        try {
            Typeface create = Typeface.create(Typeface.DEFAULT, 0);
            Field declaredField = Typeface.class.getDeclaredField(StubApp.getString2("13913"));
            Intrinsics.checkNotNullExpressionValue(declaredField, "Typeface::class.java.get…EFACE_FONTMAP_FIELD_NAME)");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(create);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, android.graphics.Typeface>");
            arrayList.addAll(((java.util.Map) obj).keySet());
            return arrayList;
        } catch (Exception e10) {
            Log.e(StubApp.getString2(13912), StubApp.getString2(13914) + e10);
            return arrayList;
        }
    }

    public final String extractValidFont(String font) {
        List<String> deviceFonts = getDeviceFonts();
        if (deviceFonts == null || deviceFonts.isEmpty()) {
            deviceFonts = DEFAULT_FONT_STACKS;
        }
        if (font != null && deviceFonts.contains(font)) {
            return font;
        }
        Log.i(StubApp.getString2(13912), StubApp.getString2(13915));
        return StubApp.getString2(1999);
    }
}
