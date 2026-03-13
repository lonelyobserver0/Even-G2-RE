package sb;

import kotlin.Result;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20844a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20845b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f20846c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20847d;

    public A0(Object obj) {
        this.f20844a = obj;
        this.f20845b = Result.m46isFailureimpl(obj) ? null : obj;
        this.f20846c = Result.m43exceptionOrNullimpl(obj);
        Result.m47isSuccessimpl(obj);
        this.f20847d = Result.m46isFailureimpl(obj);
    }
}
