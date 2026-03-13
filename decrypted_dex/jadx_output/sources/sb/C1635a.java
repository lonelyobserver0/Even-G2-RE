package sb;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1635a extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f20922a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20923b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20924c;

    public C1635a(String code, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f20922a = code;
        this.f20923b = str;
        this.f20924c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f20923b;
    }
}
