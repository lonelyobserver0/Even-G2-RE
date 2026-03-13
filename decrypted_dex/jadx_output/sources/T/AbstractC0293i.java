package T;

/* renamed from: T.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0293i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008b -> B:13:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:13:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.List r6, T.T r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof T.C0290f
            if (r0 == 0) goto L13
            r0 = r8
            T.f r0 = (T.C0290f) r0
            int r1 = r0.f6852d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6852d = r1
            goto L18
        L13:
            T.f r0 = new T.f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6851c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6852d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L41
            if (r2 != r3) goto L34
            java.util.Iterator r6 = r0.f6850b
            java.io.Serializable r7 = r0.f6849a
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L32
            goto L6e
        L32:
            r8 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 275(0x113, float:3.85E-43)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        L41:
            java.io.Serializable r6 = r0.f6849a
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L65
        L49:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            T.h r2 = new T.h
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f6849a = r8
            r0.f6852d = r4
            T.m r7 = (T.C0297m) r7
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L64
            goto L9f
        L64:
            r6 = r8
        L65:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L6e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L97
            java.lang.Object r8 = r6.next()
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0.f6849a = r7     // Catch: java.lang.Throwable -> L32
            r0.f6850b = r6     // Catch: java.lang.Throwable -> L32
            r0.f6852d = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L32
            if (r8 != r1) goto L6e
            goto L9f
        L87:
            T r2 = r7.element
            if (r2 != 0) goto L8e
            r7.element = r8
            goto L6e
        L8e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlin.ExceptionsKt.addSuppressed(r2, r8)
            goto L6e
        L97:
            T r6 = r7.element
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto La0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L9f:
            return r1
        La0:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T.AbstractC0293i.a(java.util.List, T.T, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
