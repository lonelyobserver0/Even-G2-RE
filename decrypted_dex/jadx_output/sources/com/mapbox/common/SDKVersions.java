package com.mapbox.common;

import android.content.res.AssetManager;
import com.stub.StubApp;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mapbox/common/SDKVersions;", "", "()V", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SDKVersions {
    private static final String MAPBOX_IDENTIFIER = StubApp.getString2(13136);
    private static final String SDK_VERSIONS_FOLDER = StubApp.getString2(13450);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mapbox/common/SDKVersions$Companion;", "", "()V", "MAPBOX_IDENTIFIER", "", "SDK_VERSIONS_FOLDER", "getList", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final List<String> getList() {
            boolean contains;
            ArrayList arrayList = new ArrayList();
            AssetManager assets = MapboxSDKCommon.INSTANCE.getContext().getAssets();
            String string2 = StubApp.getString2(13450);
            String[] list = assets.list(string2);
            if (list != null) {
                for (String filename : list) {
                    Intrinsics.checkNotNullExpressionValue(filename, "filename");
                    contains = StringsKt__StringsKt.contains((CharSequence) filename, (CharSequence) "mapbox", true);
                    if (contains) {
                        InputStream open = assets.open(string2 + File.separator + filename);
                        Intrinsics.checkNotNullExpressionValue(open, "assets.open(SDK_VERSIONS…ile.separator + filename)");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192);
                        try {
                            arrayList.add(bufferedReader.readLine() + StubApp.getString2("1561") + filename + ')');
                            CloseableKt.closeFinally(bufferedReader, null);
                        } finally {
                        }
                    }
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @JvmStatic
    public static final List<String> getList() {
        return INSTANCE.getList();
    }
}
