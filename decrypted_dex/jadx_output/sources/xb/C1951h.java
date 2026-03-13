package xb;

import Sb.w;
import i5.C1059c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: xb.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1951h extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1059c f23162a;

    /* renamed from: b, reason: collision with root package name */
    public w f23163b;

    /* renamed from: c, reason: collision with root package name */
    public Sb.a f23164c;

    /* renamed from: d, reason: collision with root package name */
    public C1947d f23165d;

    /* renamed from: e, reason: collision with root package name */
    public int f23166e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f23167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1059c f23168g;

    /* renamed from: h, reason: collision with root package name */
    public int f23169h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1951h(C1059c c1059c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23168g = c1059c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23167f = obj;
        this.f23169h |= Integer.MIN_VALUE;
        return C1059c.b(this.f23168g, this);
    }
}
