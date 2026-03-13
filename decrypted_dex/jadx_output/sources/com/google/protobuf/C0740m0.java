package com.google.protobuf;

/* renamed from: com.google.protobuf.m0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0740m0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0732i0 f12197a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f12198b;

    /* renamed from: c, reason: collision with root package name */
    public final C0751v f12199c;

    public C0740m0(y0 y0Var, C0751v c0751v, InterfaceC0732i0 interfaceC0732i0) {
        this.f12198b = y0Var;
        c0751v.getClass();
        this.f12199c = c0751v;
        this.f12197a = interfaceC0732i0;
    }

    @Override // com.google.protobuf.u0
    public final void a(Object obj, Object obj2) {
        v0.k(this.f12198b, obj, obj2);
    }

    @Override // com.google.protobuf.u0
    public final void b(Object obj) {
        this.f12198b.getClass();
        x0 x0Var = ((F) obj).unknownFields;
        if (x0Var.f12246e) {
            x0Var.f12246e = false;
        }
        this.f12199c.getClass();
        Xa.h.x(obj);
        throw null;
    }

    @Override // com.google.protobuf.u0
    public final boolean c(Object obj) {
        this.f12199c.getClass();
        Xa.h.x(obj);
        throw null;
    }

    @Override // com.google.protobuf.u0
    public final Object d() {
        InterfaceC0732i0 interfaceC0732i0 = this.f12197a;
        return interfaceC0732i0 instanceof F ? ((F) interfaceC0732i0).newMutableInstance() : interfaceC0732i0.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.u0
    public final void e(Object obj, C0720c0 c0720c0) {
        this.f12199c.getClass();
        Xa.h.x(obj);
        throw null;
    }

    @Override // com.google.protobuf.u0
    public final void f(Object obj, byte[] bArr, int i3, int i10, D0.g gVar) {
        F f10 = (F) obj;
        if (f10.unknownFields == x0.f12241f) {
            f10.unknownFields = new x0();
        }
        throw com.mapbox.common.b.d(obj);
    }

    @Override // com.google.protobuf.u0
    public final void g(Object obj, Ab.g gVar, C0750u c0750u) {
        this.f12198b.getClass();
        y0.a(obj);
        this.f12199c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.u0
    public final int h(F f10) {
        this.f12198b.getClass();
        return f10.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.u0
    public final int i(F f10) {
        this.f12198b.getClass();
        x0 x0Var = f10.unknownFields;
        int i3 = x0Var.f12245d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < x0Var.f12242a; i11++) {
            int i12 = x0Var.f12243b[i11] >>> 3;
            i10 += AbstractC0747q.N(3, (AbstractC0733j) x0Var.f12244c[i11]) + AbstractC0747q.S(i12) + AbstractC0747q.R(2) + (AbstractC0747q.R(1) * 2);
        }
        x0Var.f12245d = i10;
        return i10;
    }

    @Override // com.google.protobuf.u0
    public final boolean j(F f10, F f11) {
        this.f12198b.getClass();
        return f10.unknownFields.equals(f11.unknownFields);
    }
}
