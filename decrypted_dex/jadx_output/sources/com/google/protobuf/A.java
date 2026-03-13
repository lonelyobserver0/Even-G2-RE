package com.google.protobuf;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class A extends AbstractC0717b {
    private final F defaultInstance;
    protected F instance;

    public A(F f10) {
        this.defaultInstance = f10;
        if (f10.isMutable()) {
            throw new IllegalArgumentException(StubApp.getString2(12099));
        }
        this.instance = f10.newMutableInstance();
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        F newMutableInstance = this.defaultInstance.newMutableInstance();
        r0.f12216c.b(newMutableInstance).a(newMutableInstance, this.instance);
        this.instance = newMutableInstance;
    }

    public final boolean isInitialized() {
        return F.isInitialized(this.instance, false);
    }

    /* renamed from: build, reason: merged with bridge method [inline-methods] */
    public final F m5build() {
        F buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC0717b.newUninitializedMessageException(buildPartial);
    }

    @Override // com.google.protobuf.InterfaceC0730h0
    public F buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    /* renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final A m6clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException(StubApp.getString2(12099));
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC0734j0
    public F getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.AbstractC0717b
    public A internalMergeFrom(F f10) {
        return mergeFrom(f10);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public A m9clone() {
        A newBuilderForType = getDefaultInstanceForType().newBuilderForType();
        newBuilderForType.instance = buildPartial();
        return newBuilderForType;
    }

    public A mergeFrom(F f10) {
        if (getDefaultInstanceForType().equals(f10)) {
            return this;
        }
        copyOnWrite();
        F f11 = this.instance;
        r0.f12216c.b(f11).a(f11, f10);
        return this;
    }

    @Override // com.google.protobuf.AbstractC0717b
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public A m12mergeFrom(byte[] bArr, int i3, int i10, C0750u c0750u) throws T {
        copyOnWrite();
        try {
            r0.f12216c.b(this.instance).f(this.instance, bArr, i3, i3 + i10, new D0.g(c0750u));
            return this;
        } catch (T e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(StubApp.getString2(12101), e11);
        } catch (IndexOutOfBoundsException unused) {
            throw T.g();
        }
    }

    @Override // com.google.protobuf.AbstractC0717b
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public A m11mergeFrom(byte[] bArr, int i3, int i10) throws T {
        return m12mergeFrom(bArr, i3, i10, C0750u.a());
    }

    @Override // com.google.protobuf.AbstractC0717b
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public A m10mergeFrom(AbstractC0741n abstractC0741n, C0750u c0750u) throws IOException {
        copyOnWrite();
        try {
            u0 b2 = r0.f12216c.b(this.instance);
            F f10 = this.instance;
            Ab.g gVar = abstractC0741n.f12201b;
            if (gVar == null) {
                gVar = new Ab.g(abstractC0741n);
            }
            b2.g(f10, gVar, c0750u);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }
}
