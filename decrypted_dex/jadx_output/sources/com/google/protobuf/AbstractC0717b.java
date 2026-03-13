package com.google.protobuf;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0717b implements InterfaceC0730h0 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    public static w0 newUninitializedMessageException(InterfaceC0732i0 interfaceC0732i0) {
        return new w0();
    }

    public final String a() {
        return StubApp.getString2(12632) + getClass().getName() + StubApp.getString2(12633);
    }

    public abstract AbstractC0717b internalMergeFrom(AbstractC0719c abstractC0719c);

    public boolean mergeDelimitedFrom(InputStream inputStream, C0750u c0750u) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        m19mergeFrom((InputStream) new C0715a(inputStream, AbstractC0741n.s(inputStream, read)), c0750u);
        return true;
    }

    public abstract AbstractC0717b mergeFrom(AbstractC0741n abstractC0741n, C0750u c0750u);

    public abstract AbstractC0717b mergeFrom(byte[] bArr, int i3, int i10);

    public abstract AbstractC0717b mergeFrom(byte[] bArr, int i3, int i10, C0750u c0750u);

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = Q.f12119a;
        iterable.getClass();
        boolean z2 = iterable instanceof W;
        String string2 = StubApp.getString2(6810);
        String string22 = StubApp.getString2(6809);
        if (z2) {
            List k3 = ((W) iterable).k();
            W w10 = (W) list;
            int size = list.size();
            for (Object obj : k3) {
                if (obj == null) {
                    String str = string22 + (w10.size() - size) + string2;
                    for (int size2 = w10.size() - 1; size2 >= size; size2--) {
                        w10.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0733j) {
                    w10.h((AbstractC0733j) obj);
                } else {
                    w10.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof q0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t3 : iterable) {
            if (t3 == null) {
                String str2 = string22 + (list.size() - size3) + string2;
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t3);
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
        return mergeDelimitedFrom(inputStream, C0750u.a());
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0717b m17mergeFrom(AbstractC0741n abstractC0741n) throws IOException {
        return mergeFrom(abstractC0741n, C0750u.a());
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0717b m15mergeFrom(AbstractC0733j abstractC0733j) throws T {
        try {
            AbstractC0741n i3 = abstractC0733j.i();
            m17mergeFrom(i3);
            i3.a(0);
            return this;
        } catch (T e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(a(), e11);
        }
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0717b m16mergeFrom(AbstractC0733j abstractC0733j, C0750u c0750u) throws T {
        try {
            AbstractC0741n i3 = abstractC0733j.i();
            mergeFrom(i3, c0750u);
            i3.a(0);
            return this;
        } catch (T e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(a(), e11);
        }
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0717b m20mergeFrom(byte[] bArr) throws T {
        return mergeFrom(bArr, 0, bArr.length);
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0717b m21mergeFrom(byte[] bArr, C0750u c0750u) throws T {
        return mergeFrom(bArr, 0, bArr.length, c0750u);
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0717b m18mergeFrom(InputStream inputStream) throws IOException {
        AbstractC0741n g10 = AbstractC0741n.g(inputStream);
        m17mergeFrom(g10);
        g10.a(0);
        return this;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0717b m19mergeFrom(InputStream inputStream, C0750u c0750u) throws IOException {
        AbstractC0741n g10 = AbstractC0741n.g(inputStream);
        mergeFrom(g10, c0750u);
        g10.a(0);
        return this;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0717b m14mergeFrom(InterfaceC0732i0 interfaceC0732i0) {
        if (getDefaultInstanceForType().getClass().isInstance(interfaceC0732i0)) {
            return internalMergeFrom((AbstractC0719c) interfaceC0732i0);
        }
        throw new IllegalArgumentException(StubApp.getString2(12634));
    }
}
