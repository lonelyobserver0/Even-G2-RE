package com.google.protobuf;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0719c implements InterfaceC0732i0 {
    protected int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0717b.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC0733j abstractC0733j) throws IllegalArgumentException {
        if (!abstractC0733j.g()) {
            throw new IllegalArgumentException(StubApp.getString2(12636));
        }
    }

    public final String a(String str) {
        return StubApp.getString2(11852) + getClass().getName() + StubApp.getString2(12637) + str + StubApp.getString2(12638);
    }

    public abstract int getSerializedSize(u0 u0Var);

    public w0 newUninitializedMessageException() {
        return new w0();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC0747q.f12210e;
            C0743o c0743o = new C0743o(bArr, serializedSize);
            writeTo(c0743o);
            if (c0743o.l0() == 0) {
                return bArr;
            }
            throw new IllegalStateException(StubApp.getString2("11636"));
        } catch (IOException e10) {
            throw new RuntimeException(a(StubApp.getString2(12639)), e10);
        }
    }

    public AbstractC0733j toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C0731i c0731i = AbstractC0733j.f12158b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC0747q.f12210e;
            C0743o c0743o = new C0743o(bArr, serializedSize);
            writeTo(c0743o);
            if (c0743o.l0() == 0) {
                return new C0731i(bArr);
            }
            throw new IllegalStateException(StubApp.getString2("11636"));
        } catch (IOException e10) {
            throw new RuntimeException(a(StubApp.getString2(12640)), e10);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int S5 = AbstractC0747q.S(serializedSize) + serializedSize;
        if (S5 > 4096) {
            S5 = 4096;
        }
        C0745p c0745p = new C0745p(outputStream, S5);
        c0745p.i0(serializedSize);
        writeTo(c0745p);
        if (c0745p.f12209i > 0) {
            c0745p.q0();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = AbstractC0747q.f12210e;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C0745p c0745p = new C0745p(outputStream, serializedSize);
        writeTo(c0745p);
        if (c0745p.f12209i > 0) {
            c0745p.q0();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0717b.addAll((Iterable) iterable, (List) list);
    }
}
