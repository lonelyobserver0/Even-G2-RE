package Tc;

import Q2.g;
import com.stub.StubApp;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b implements org.slf4j.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7417a;

    /* renamed from: b, reason: collision with root package name */
    public volatile org.slf4j.a f7418b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f7419c;

    /* renamed from: d, reason: collision with root package name */
    public Method f7420d;

    /* renamed from: e, reason: collision with root package name */
    public g f7421e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f7422f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7423g;

    public b(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z2) {
        this.f7417a = str;
        this.f7422f = linkedBlockingQueue;
        this.f7423g = z2;
    }

    @Override // org.slf4j.a
    public final void a(String str) {
        d().a(str);
    }

    @Override // org.slf4j.a
    public final void b(String str, Throwable th) {
        d().b(str, th);
    }

    @Override // org.slf4j.a
    public final void c(Object obj, String str) {
        d().c(obj, str);
    }

    public final org.slf4j.a d() {
        if (this.f7418b != null) {
            return this.f7418b;
        }
        if (this.f7423g) {
            return a.f7416a;
        }
        if (this.f7421e == null) {
            g gVar = new g(21, (char) 0);
            gVar.f5712c = this;
            gVar.f5711b = this.f7417a;
            gVar.f5713d = this.f7422f;
            this.f7421e = gVar;
        }
        return this.f7421e;
    }

    @Override // org.slf4j.a
    public final void e(String str) {
        d().e(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b.class == obj.getClass() && this.f7417a.equals(((b) obj).f7417a);
    }

    @Override // org.slf4j.a
    public final void f() {
        d().f();
    }

    public final boolean g() {
        Boolean bool = this.f7419c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f7420d = this.f7418b.getClass().getMethod(StubApp.getString2("11764"), Sc.a.class);
            this.f7419c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f7419c = Boolean.FALSE;
        }
        return this.f7419c.booleanValue();
    }

    @Override // org.slf4j.a
    public final String getName() {
        return this.f7417a;
    }

    @Override // org.slf4j.a
    public final void h(String str, String str2) {
        d().h(str, str2);
    }

    public final int hashCode() {
        return this.f7417a.hashCode();
    }

    @Override // org.slf4j.a
    public final void k(String str, Boolean bool) {
        d().k(str, bool);
    }

    @Override // org.slf4j.a
    public final void l(Object obj, String str) {
        d().l(obj, str);
    }

    @Override // org.slf4j.a
    public final void n(String str) {
        d().n(str);
    }

    @Override // org.slf4j.a
    public final void o(String str) {
        d().o(str);
    }

    @Override // org.slf4j.a
    public final void p(Boolean bool, Boolean bool2) {
        d().p(bool, bool2);
    }
}
