package xb;

import Sb.w;
import i5.C1059c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: xb.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1949f extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1059c f23154a;

    /* renamed from: b, reason: collision with root package name */
    public w f23155b;

    /* renamed from: c, reason: collision with root package name */
    public Sb.a f23156c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f23157d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f23158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1059c f23159f;

    /* renamed from: g, reason: collision with root package name */
    public int f23160g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1949f(C1059c c1059c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23159f = c1059c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23158e = obj;
        this.f23160g |= Integer.MIN_VALUE;
        return C1059c.a(this.f23159f, this);
    }
}
