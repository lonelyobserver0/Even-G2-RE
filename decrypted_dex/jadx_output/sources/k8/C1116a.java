package k8;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1116a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15485a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15486b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15487c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15488d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15489e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15490f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15491g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15492h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15493i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f15494k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15495l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C1116a() {
        /*
            r13 = this;
            java.lang.String r1 = ""
            r3 = 4956(0x135c, float:6.945E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r6 = 2160(0x870, float:3.027E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r7 = 19126(0x4ab6, float:2.6801E-41)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r2 = r1
            r4 = r1
            r5 = r1
            r8 = r1
            r9 = r3
            r10 = r3
            r11 = r1
            r12 = r1
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.C1116a.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1116a)) {
            return false;
        }
        C1116a c1116a = (C1116a) obj;
        return Intrinsics.areEqual(this.f15485a, c1116a.f15485a) && Intrinsics.areEqual(this.f15486b, c1116a.f15486b) && Intrinsics.areEqual(this.f15487c, c1116a.f15487c) && Intrinsics.areEqual(this.f15488d, c1116a.f15488d) && Intrinsics.areEqual(this.f15489e, c1116a.f15489e) && Intrinsics.areEqual(this.f15490f, c1116a.f15490f) && Intrinsics.areEqual(this.f15491g, c1116a.f15491g) && Intrinsics.areEqual(this.f15492h, c1116a.f15492h) && Intrinsics.areEqual(this.f15493i, c1116a.f15493i) && Intrinsics.areEqual(this.j, c1116a.j) && Intrinsics.areEqual(this.f15494k, c1116a.f15494k) && Intrinsics.areEqual(this.f15495l, c1116a.f15495l);
    }

    public final int hashCode() {
        return this.f15495l.hashCode() + u.d(u.d(u.d(u.d(u.d(u.d(u.d(u.d(u.d(u.d(this.f15485a.hashCode() * 31, 31, this.f15486b), 31, this.f15487c), 31, this.f15488d), 31, this.f15489e), 31, this.f15490f), 31, this.f15491g), 31, this.f15492h), 31, this.f15493i), 31, this.j), 31, this.f15494k);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(19127));
        sb2.append(this.f15485a);
        sb2.append(StubApp.getString2(19128));
        sb2.append(this.f15486b);
        sb2.append(StubApp.getString2(19129));
        sb2.append(this.f15487c);
        sb2.append(StubApp.getString2(17553));
        sb2.append(this.f15488d);
        sb2.append(StubApp.getString2(17554));
        sb2.append(this.f15489e);
        sb2.append(StubApp.getString2(19130));
        sb2.append(this.f15490f);
        sb2.append(StubApp.getString2(19131));
        sb2.append(this.f15491g);
        sb2.append(StubApp.getString2(19132));
        sb2.append(this.f15492h);
        sb2.append(StubApp.getString2(19133));
        sb2.append(this.f15493i);
        sb2.append(StubApp.getString2(19134));
        sb2.append(this.j);
        sb2.append(StubApp.getString2(19135));
        sb2.append(this.f15494k);
        sb2.append(StubApp.getString2(1946));
        return h.s(sb2, this.f15495l, ')');
    }

    public C1116a(String appMode, String driveMode, String driveId, String startedAt, String endedAt, String navSdkVersion, String navNativeSdkVersion, String appVersion, String appUserId, String appSessionId, String recording, String owner) {
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        Intrinsics.checkNotNullParameter(driveMode, "driveMode");
        Intrinsics.checkNotNullParameter(driveId, "driveId");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        Intrinsics.checkNotNullParameter(endedAt, "endedAt");
        Intrinsics.checkNotNullParameter(navSdkVersion, "navSdkVersion");
        Intrinsics.checkNotNullParameter(navNativeSdkVersion, "navNativeSdkVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appUserId, "appUserId");
        Intrinsics.checkNotNullParameter(appSessionId, "appSessionId");
        Intrinsics.checkNotNullParameter(recording, "recording");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f15485a = appMode;
        this.f15486b = driveMode;
        this.f15487c = driveId;
        this.f15488d = startedAt;
        this.f15489e = endedAt;
        this.f15490f = navSdkVersion;
        this.f15491g = navNativeSdkVersion;
        this.f15492h = appVersion;
        this.f15493i = appUserId;
        this.j = appSessionId;
        this.f15494k = recording;
        this.f15495l = owner;
    }
}
