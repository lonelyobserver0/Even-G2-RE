package d0;

import Z9.C0366a;
import android.content.ClipData;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import f.C0861a;
import f.C0867g;
import i.AbstractActivityC1027h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: d0.H, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0770H extends F1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13136e;

    public /* synthetic */ C0770H(int i3) {
        this.f13136e = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1 >= 2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent C(android.app.Activity r5, f.h r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r1 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            r3 = 1
            if (r1 < r2) goto L12
            goto L1d
        L12:
            r2 = 30
            if (r1 < r2) goto L1f
            int r1 = c5.z.a()
            r2 = 2
            if (r1 < r2) goto L1f
        L1d:
            r1 = r3
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L47
            android.content.Intent r5 = new android.content.Intent
            r0 = 16470(0x4056, float:2.308E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r5.<init>(r0)
            g.f r0 = r6.f13697a
            java.lang.String r0 = com.google.android.gms.internal.measurement.L1.r(r0)
            r5.setType(r0)
            g.b r6 = r6.f13699c
            r6.getClass()
            r6 = 16471(0x4057, float:2.3081E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.putExtra(r6, r3)
            return r5
        L47:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.content.pm.ResolveInfo r0 = com.google.android.gms.internal.measurement.L1.q(r5)
            if (r0 == 0) goto L93
            android.content.pm.ResolveInfo r5 = com.google.android.gms.internal.measurement.L1.q(r5)
            if (r5 == 0) goto L86
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            android.content.Intent r0 = new android.content.Intent
            r1 = 11736(0x2dd8, float:1.6446E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            android.content.pm.ApplicationInfo r1 = r5.applicationInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r5 = r5.name
            r0.setClassName(r1, r5)
            g.f r5 = r6.f13697a
            java.lang.String r5 = com.google.android.gms.internal.measurement.L1.r(r5)
            r0.setType(r5)
            g.b r5 = r6.f13699c
            r5.getClass()
            r5 = 16472(0x4058, float:2.3082E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r0.putExtra(r5, r3)
            return r0
        L86:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 2906(0xb5a, float:4.072E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        L93:
            android.content.Intent r5 = new android.content.Intent
            r0 = 4518(0x11a6, float:6.331E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r5.<init>(r0)
            g.f r6 = r6.f13697a
            java.lang.String r6 = com.google.android.gms.internal.measurement.L1.r(r6)
            r5.setType(r6)
            java.lang.String r6 = r5.getType()
            if (r6 != 0) goto Ld4
            r6 = 627(0x273, float:8.79E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.setType(r6)
            r6 = 4497(0x1191, float:6.302E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r0 = 4496(0x1190, float:6.3E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.String[] r6 = new java.lang.String[]{r6, r0}
            r0 = 4501(0x1195, float:6.307E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r5.putExtra(r0, r6)
        Ld4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0770H.C(android.app.Activity, f.h):android.content.Intent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.F1
    public final Intent l(AbstractActivityC1027h context, Parcelable parcelable) {
        String string2;
        Bundle bundleExtra;
        switch (this.f13136e) {
            case 0:
                C0867g c0867g = (C0867g) parcelable;
                Intent intent = new Intent(StubApp.getString2(2488));
                Intent intent2 = c0867g.f13694b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra((string2 = StubApp.getString2(16419)))) != null) {
                    intent.putExtra(string2, bundleExtra);
                    intent2.removeExtra(string2);
                    if (intent2.getBooleanExtra(StubApp.getString2(16473), false)) {
                        String string22 = StubApp.getString2(16474);
                        IntentSender intentSender = c0867g.f13693a;
                        Intrinsics.checkNotNullParameter(intentSender, string22);
                        c0867g = new C0867g(intentSender, null, c0867g.f13695c, c0867g.f13696d);
                    }
                }
                intent.putExtra(StubApp.getString2(16422), c0867g);
                if (M.J(2)) {
                    Log.v(StubApp.getString2(49), StubApp.getString2(16475) + intent);
                }
                return intent;
            case 1:
                return C(context, (f.h) parcelable);
            case 2:
                String[] input = (String[]) parcelable;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent putExtra = new Intent(StubApp.getString2(16420)).putExtra(StubApp.getString2(16421), input);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                Intent input2 = (Intent) parcelable;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                return input2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.F1
    public C0366a r(AbstractActivityC1027h context, Parcelable parcelable) {
        switch (this.f13136e) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter((f.h) parcelable, "input");
                return null;
            case 2:
                String[] input = (String[]) parcelable;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (input.length == 0) {
                    return new C0366a(MapsKt.emptyMap(), 7);
                }
                for (String str : input) {
                    if (D.a.a(context, str) != 0) {
                        return null;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(input.length), 16));
                for (String str2 : input) {
                    Pair pair = TuplesKt.to(str2, Boolean.TRUE);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return new C0366a(linkedHashMap, 7);
            default:
                return super.r(context, parcelable);
        }
    }

    @Override // com.google.android.gms.internal.measurement.F1
    public final Object t(Intent intent, int i3) {
        List arrayList;
        List zip;
        Map map;
        switch (this.f13136e) {
            case 0:
                return new C0861a(intent, i3);
            case 1:
                if (i3 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                Intrinsics.checkNotNullParameter(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
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
                return (Uri) CollectionsKt.firstOrNull(arrayList);
            case 2:
                if (i3 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra(StubApp.getString2(16421));
                    int[] intArrayExtra = intent.getIntArrayExtra(StubApp.getString2(16426));
                    if (intArrayExtra == null || stringArrayExtra == null) {
                        return MapsKt.emptyMap();
                    }
                    ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                    for (int i11 : intArrayExtra) {
                        arrayList2.add(Boolean.valueOf(i11 == 0));
                    }
                    zip = CollectionsKt___CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList2);
                    map = MapsKt__MapsKt.toMap(zip);
                    return map;
                }
                return MapsKt.emptyMap();
            default:
                return new C0861a(intent, i3);
        }
    }
}
