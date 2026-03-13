package com.mapbox.common.module.okhttp;

import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wc.C1881F;
import wc.s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwc/F;", "response", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "generateOutputHeaders", "(Lwc/F;)Ljava/util/HashMap;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class HttpCallbackKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap<String, String> generateOutputHeaders(C1881F c1881f) {
        HashMap<String, String> hashMap = new HashMap<>();
        s sVar = c1881f.f22330f;
        int size = sVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            String lowerCase = sVar.b(i3).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            hashMap.put(lowerCase, sVar.d(i3));
        }
        return hashMap;
    }
}
