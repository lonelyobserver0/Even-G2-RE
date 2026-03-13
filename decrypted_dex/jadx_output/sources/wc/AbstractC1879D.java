package wc;

import Kc.C0104k;
import Kc.InterfaceC0102i;
import java.io.File;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.D, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public abstract class AbstractC1879D {
    public static final C1878C Companion = new C1878C();

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC1879D create(String str, v vVar) {
        Companion.getClass();
        return C1878C.a(str, vVar);
    }

    public abstract long contentLength();

    public abstract v contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC0102i interfaceC0102i);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC1879D create(v vVar, C0104k content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new C1876A(vVar, content, 1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    public static final AbstractC1879D create(v vVar, File file) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new C1876A(vVar, file, 0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC1879D create(v vVar, String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return C1878C.a(content, vVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC1879D create(v vVar, byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return C1878C.b(vVar, content, 0, length);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC1879D create(v vVar, byte[] content, int i3) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return C1878C.b(vVar, content, i3, length);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC1879D create(byte[] bArr) {
        C1878C c1878c = Companion;
        c1878c.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return C1878C.c(c1878c, bArr, null, 0, 7);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC1879D create(byte[] bArr, v vVar) {
        C1878C c1878c = Companion;
        c1878c.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return C1878C.c(c1878c, bArr, vVar, 0, 6);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC1879D create(byte[] bArr, v vVar, int i3) {
        C1878C c1878c = Companion;
        c1878c.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return C1878C.c(c1878c, bArr, vVar, i3, 4);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC1879D create(byte[] bArr, v vVar, int i3, int i10) {
        Companion.getClass();
        return C1878C.b(vVar, bArr, i3, i10);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC1879D create(C0104k c0104k, v vVar) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(c0104k, "<this>");
        return new C1876A(vVar, c0104k, 1);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC1879D create(File file, v vVar) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new C1876A(vVar, file, 0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC1879D create(v vVar, byte[] content, int i3, int i10) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return C1878C.b(vVar, content, i3, i10);
    }
}
