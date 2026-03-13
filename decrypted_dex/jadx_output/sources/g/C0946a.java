package g;

import Z9.C0366a;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import f.h;
import i.AbstractActivityC1027h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0946a extends F1 {

    /* renamed from: e, reason: collision with root package name */
    public final int f14195e;

    public C0946a(int i3) {
        this.f14195e = i3;
        if (i3 <= 1) {
            throw new IllegalArgumentException(StubApp.getString2(17738));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r1 >= 2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    @Override // com.google.android.gms.internal.measurement.F1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent l(android.app.Activity r6, f.h r7) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0946a.l(android.app.Activity, f.h):android.content.Intent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.F1
    public final C0366a r(AbstractActivityC1027h context, Parcelable parcelable) {
        h input = (h) parcelable;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.F1
    public final Object t(Intent intent, int i3) {
        Object arrayList;
        if (i3 != -1) {
            intent = null;
        }
        if (intent != null) {
            Intrinsics.checkNotNullParameter(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                arrayList = CollectionsKt.emptyList();
            } else {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i10 = 0; i10 < itemCount; i10++) {
                        Uri uri = clipData.getItemAt(i10).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }
}
