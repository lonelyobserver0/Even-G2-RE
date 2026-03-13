package com.google.protobuf;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class F extends AbstractC0719c {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, F> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected x0 unknownFields;

    public F() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = x0.f12241f;
    }

    public static D access$000(AbstractC0748s abstractC0748s) {
        abstractC0748s.getClass();
        return (D) abstractC0748s;
    }

    public static void b(F f10) {
        if (f10 == null || f10.isInitialized()) {
            return;
        }
        w0 newUninitializedMessageException = f10.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        throw new T(newUninitializedMessageException.getMessage());
    }

    public static F c(F f10, InputStream inputStream, C0750u c0750u) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            AbstractC0741n g10 = AbstractC0741n.g(new C0715a(inputStream, AbstractC0741n.s(inputStream, read)));
            F parsePartialFrom = parsePartialFrom(f10, g10, c0750u);
            g10.a(0);
            return parsePartialFrom;
        } catch (T e10) {
            if (e10.f12121a) {
                throw new T(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new T(e11.getMessage(), e11);
        }
    }

    public static F d(F f10, byte[] bArr, int i3, int i10, C0750u c0750u) {
        F newMutableInstance = f10.newMutableInstance();
        try {
            u0 b2 = r0.f12216c.b(newMutableInstance);
            b2.f(newMutableInstance, bArr, i3, i3 + i10, new D0.g(c0750u));
            b2.b(newMutableInstance);
            return newMutableInstance;
        } catch (T e10) {
            if (e10.f12121a) {
                throw new T(e10.getMessage(), e10);
            }
            throw e10;
        } catch (w0 e11) {
            throw new T(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof T) {
                throw ((T) e12.getCause());
            }
            throw new T(e12.getMessage(), e12);
        } catch (IndexOutOfBoundsException unused) {
            throw T.g();
        }
    }

    public static H emptyBooleanList() {
        return C0725f.f12149d;
    }

    public static I emptyDoubleList() {
        return r.f12213d;
    }

    public static M emptyFloatList() {
        return C0754y.f12247d;
    }

    public static N emptyIntList() {
        return G.f12094d;
    }

    public static O emptyLongList() {
        return C0716a0.f12138d;
    }

    public static <E> P emptyProtobufList() {
        return s0.f12219d;
    }

    public static <T extends F> T getDefaultInstance(Class<T> cls) {
        T t3 = (T) defaultInstanceMap.get(cls);
        if (t3 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t3 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(StubApp.getString2(12106), e10);
            }
        }
        if (t3 != null) {
            return t3;
        }
        T t10 = (T) ((F) G0.b(cls)).getDefaultInstanceForType();
        if (t10 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t10);
        return t10;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(StubApp.getString2(12624) + cls.getName() + StubApp.getString2(12625) + str + StubApp.getString2(12626), e10);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(StubApp.getString2(12108), e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(StubApp.getString2(12107), cause);
        }
    }

    public static N mutableCopy(N n10) {
        G g10 = (G) n10;
        int i3 = g10.f12096c;
        int i10 = i3 == 0 ? 10 : i3 * 2;
        if (i10 >= i3) {
            return new G(Arrays.copyOf(g10.f12095b, i10), g10.f12096c, true);
        }
        throw new IllegalArgumentException();
    }

    public static Object newMessageInfo(InterfaceC0732i0 interfaceC0732i0, String str, Object[] objArr) {
        return new t0(interfaceC0732i0, str, objArr);
    }

    public static <ContainingType extends InterfaceC0732i0, Type> D newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC0732i0 interfaceC0732i0, K k3, int i3, O0 o02, boolean z2, Class cls) {
        return new D(containingtype, Collections.EMPTY_LIST, interfaceC0732i0, new C(k3, i3, o02, true, z2));
    }

    public static <ContainingType extends InterfaceC0732i0, Type> D newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC0732i0 interfaceC0732i0, K k3, int i3, O0 o02, Class cls) {
        return new D(containingtype, type, interfaceC0732i0, new C(k3, i3, o02, false, false));
    }

    public static <T extends F> T parseDelimitedFrom(T t3, InputStream inputStream) throws T {
        T t10 = (T) c(t3, inputStream, C0750u.a());
        b(t10);
        return t10;
    }

    public static <T extends F> T parseFrom(T t3, ByteBuffer byteBuffer, C0750u c0750u) throws T {
        AbstractC0741n f10;
        if (byteBuffer.hasArray()) {
            f10 = AbstractC0741n.f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && G0.f12100d) {
            f10 = new C0739m(byteBuffer, false);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            f10 = AbstractC0741n.f(bArr, 0, remaining, true);
        }
        T t10 = (T) parseFrom(t3, f10, c0750u);
        b(t10);
        return t10;
    }

    public static <T extends F> T parsePartialFrom(T t3, AbstractC0741n abstractC0741n, C0750u c0750u) throws T {
        T t10 = (T) t3.newMutableInstance();
        try {
            u0 b2 = r0.f12216c.b(t10);
            Ab.g gVar = abstractC0741n.f12201b;
            if (gVar == null) {
                gVar = new Ab.g(abstractC0741n);
            }
            b2.g(t10, gVar, c0750u);
            b2.b(t10);
            return t10;
        } catch (T e10) {
            if (e10.f12121a) {
                throw new T(e10.getMessage(), e10);
            }
            throw e10;
        } catch (w0 e11) {
            throw new T(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof T) {
                throw ((T) e12.getCause());
            }
            throw new T(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof T) {
                throw ((T) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends F> void registerDefaultInstance(Class<T> cls, T t3) {
        t3.markImmutable();
        defaultInstanceMap.put(cls, t3);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(E.f12087c);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(IntCompanionObject.MAX_VALUE);
    }

    public int computeHashCode() {
        r0 r0Var = r0.f12216c;
        r0Var.getClass();
        return r0Var.a(getClass()).h(this);
    }

    public final <MessageType extends F, BuilderType extends A> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(E.f12089e);
    }

    public Object dynamicMethod(E e10, Object obj) {
        return dynamicMethod(e10, obj, null);
    }

    public abstract Object dynamicMethod(E e10, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r0 r0Var = r0.f12216c;
        r0Var.getClass();
        return r0Var.a(getClass()).j(this, (F) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & IntCompanionObject.MAX_VALUE;
    }

    public final InterfaceC0746p0 getParserForType() {
        return (InterfaceC0746p0) dynamicMethod(E.f12091g);
    }

    @Override // com.google.protobuf.AbstractC0719c
    public int getSerializedSize(u0 u0Var) {
        int i3;
        int i10;
        if (isMutable()) {
            if (u0Var == null) {
                r0 r0Var = r0.f12216c;
                r0Var.getClass();
                i10 = r0Var.a(getClass()).i(this);
            } else {
                i10 = u0Var.i(this);
            }
            if (i10 >= 0) {
                return i10;
            }
            throw new IllegalStateException(i2.u.p(i10, StubApp.getString2(12109)));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (u0Var == null) {
            r0 r0Var2 = r0.f12216c;
            r0Var2.getClass();
            i3 = r0Var2.a(getClass()).i(this);
        } else {
            i3 = u0Var.i(this);
        }
        setMemoizedSerializedSize(i3);
        return i3;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        r0 r0Var = r0.f12216c;
        r0Var.getClass();
        r0Var.a(getClass()).b(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= IntCompanionObject.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i3, AbstractC0733j abstractC0733j) {
        if (this.unknownFields == x0.f12241f) {
            this.unknownFields = new x0();
        }
        x0 x0Var = this.unknownFields;
        x0Var.a();
        if (i3 == 0) {
            throw new IllegalArgumentException(StubApp.getString2(12627));
        }
        x0Var.f((i3 << 3) | 2, abstractC0733j);
    }

    public final void mergeUnknownFields(x0 x0Var) {
        this.unknownFields = x0.e(this.unknownFields, x0Var);
    }

    public void mergeVarintField(int i3, int i10) {
        if (this.unknownFields == x0.f12241f) {
            this.unknownFields = new x0();
        }
        x0 x0Var = this.unknownFields;
        x0Var.a();
        if (i3 == 0) {
            throw new IllegalArgumentException(StubApp.getString2(12627));
        }
        x0Var.f(i3 << 3, Long.valueOf(i10));
    }

    public F newMutableInstance() {
        return (F) dynamicMethod(E.f12088d);
    }

    public boolean parseUnknownField(int i3, AbstractC0741n abstractC0741n) throws IOException {
        if ((i3 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == x0.f12241f) {
            this.unknownFields = new x0();
        }
        return this.unknownFields.d(i3, abstractC0741n);
    }

    public void setMemoizedHashCode(int i3) {
        this.memoizedHashCode = i3;
    }

    public void setMemoizedSerializedSize(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException(i2.u.p(i3, StubApp.getString2(12109)));
        }
        this.memoizedSerializedSize = (i3 & IntCompanionObject.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC0736k0.f12168a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StubApp.getString2(12110));
        sb2.append(obj);
        AbstractC0736k0.c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.google.protobuf.InterfaceC0732i0
    public void writeTo(AbstractC0747q abstractC0747q) throws IOException {
        r0 r0Var = r0.f12216c;
        r0Var.getClass();
        u0 a3 = r0Var.a(getClass());
        C0720c0 c0720c0 = abstractC0747q.f12212d;
        if (c0720c0 == null) {
            c0720c0 = new C0720c0(abstractC0747q);
        }
        a3.e(this, c0720c0);
    }

    public static final <T extends F> boolean isInitialized(T t3, boolean z2) {
        byte byteValue = ((Byte) t3.dynamicMethod(E.f12085a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        r0 r0Var = r0.f12216c;
        r0Var.getClass();
        boolean c10 = r0Var.a(t3.getClass()).c(t3);
        if (z2) {
            t3.dynamicMethod(E.f12086b, c10 ? t3 : null);
        }
        return c10;
    }

    public final <MessageType extends F, BuilderType extends A> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((F) messagetype);
    }

    public Object dynamicMethod(E e10) {
        return dynamicMethod(e10, null, null);
    }

    @Override // com.google.protobuf.InterfaceC0734j0
    public final F getDefaultInstanceForType() {
        return (F) dynamicMethod(E.f12090f);
    }

    @Override // com.google.protobuf.InterfaceC0732i0
    public final A newBuilderForType() {
        return (A) dynamicMethod(E.f12089e);
    }

    /* renamed from: toBuilder, reason: merged with bridge method [inline-methods] */
    public final A m13toBuilder() {
        return ((A) dynamicMethod(E.f12089e)).mergeFrom(this);
    }

    public static <T extends F> T parseDelimitedFrom(T t3, InputStream inputStream, C0750u c0750u) throws T {
        T t10 = (T) c(t3, inputStream, c0750u);
        b(t10);
        return t10;
    }

    public static O mutableCopy(O o5) {
        C0716a0 c0716a0 = (C0716a0) o5;
        int i3 = c0716a0.f12140c;
        int i10 = i3 == 0 ? 10 : i3 * 2;
        if (i10 >= i3) {
            return new C0716a0(Arrays.copyOf(c0716a0.f12139b, i10), c0716a0.f12140c, true);
        }
        throw new IllegalArgumentException();
    }

    public static M mutableCopy(M m4) {
        C0754y c0754y = (C0754y) m4;
        int i3 = c0754y.f12249c;
        int i10 = i3 == 0 ? 10 : i3 * 2;
        if (i10 >= i3) {
            return new C0754y(Arrays.copyOf(c0754y.f12248b, i10), c0754y.f12249c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends F> T parseFrom(T t3, ByteBuffer byteBuffer) throws T {
        return (T) parseFrom(t3, byteBuffer, C0750u.a());
    }

    public static I mutableCopy(I i3) {
        r rVar = (r) i3;
        int i10 = rVar.f12215c;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new r(Arrays.copyOf(rVar.f12214b, i11), rVar.f12215c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends F> T parseFrom(T t3, AbstractC0733j abstractC0733j) throws T {
        T t10 = (T) parseFrom(t3, abstractC0733j, C0750u.a());
        b(t10);
        return t10;
    }

    public static <T extends F> T parseFrom(T t3, AbstractC0733j abstractC0733j, C0750u c0750u) throws T {
        AbstractC0741n i3 = abstractC0733j.i();
        T t10 = (T) parsePartialFrom(t3, i3, c0750u);
        i3.a(0);
        b(t10);
        return t10;
    }

    public static H mutableCopy(H h2) {
        C0725f c0725f = (C0725f) h2;
        int i3 = c0725f.f12151c;
        int i10 = i3 == 0 ? 10 : i3 * 2;
        if (i10 >= i3) {
            return new C0725f(Arrays.copyOf(c0725f.f12150b, i10), c0725f.f12151c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends F> T parseFrom(T t3, byte[] bArr) throws T {
        T t10 = (T) d(t3, bArr, 0, bArr.length, C0750u.a());
        b(t10);
        return t10;
    }

    public static <E> P mutableCopy(P p8) {
        int size = p8.size();
        return p8.e(size == 0 ? 10 : size * 2);
    }

    public static <T extends F> T parseFrom(T t3, byte[] bArr, C0750u c0750u) throws T {
        T t10 = (T) d(t3, bArr, 0, bArr.length, c0750u);
        b(t10);
        return t10;
    }

    @Override // com.google.protobuf.InterfaceC0732i0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends F> T parsePartialFrom(T t3, AbstractC0741n abstractC0741n) throws T {
        return (T) parsePartialFrom(t3, abstractC0741n, C0750u.a());
    }

    public static <T extends F> T parseFrom(T t3, InputStream inputStream) throws T {
        T t10 = (T) parsePartialFrom(t3, AbstractC0741n.g(inputStream), C0750u.a());
        b(t10);
        return t10;
    }

    public static <T extends F> T parseFrom(T t3, InputStream inputStream, C0750u c0750u) throws T {
        T t10 = (T) parsePartialFrom(t3, AbstractC0741n.g(inputStream), c0750u);
        b(t10);
        return t10;
    }

    public static <T extends F> T parseFrom(T t3, AbstractC0741n abstractC0741n) throws T {
        return (T) parseFrom(t3, abstractC0741n, C0750u.a());
    }

    public static <T extends F> T parseFrom(T t3, AbstractC0741n abstractC0741n, C0750u c0750u) throws T {
        T t10 = (T) parsePartialFrom(t3, abstractC0741n, c0750u);
        b(t10);
        return t10;
    }
}
