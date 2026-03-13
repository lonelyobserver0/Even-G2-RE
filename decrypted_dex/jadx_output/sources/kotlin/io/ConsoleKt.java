package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\u0013\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\t\u0010\r\u001a\u00020\u0001H\u0087\b\u001a\b\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¨\u0006\u0012"}, d2 = {"print", "", "message", "", "", "", "", "", "", "", "", "", "", "println", "readln", "", "readlnOrNull", "readLine", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName(name = "ConsoleKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ConsoleKt {
    @InlineOnly
    private static final void print(Object obj) {
        System.out.print(obj);
    }

    @InlineOnly
    private static final void println(Object obj) {
        System.out.println(obj);
    }

    public static final String readLine() {
        LineReader lineReader = LineReader.INSTANCE;
        InputStream in = System.in;
        Intrinsics.checkNotNullExpressionValue(in, "in");
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset(...)");
        return lineReader.readLine(in, defaultCharset);
    }

    @SinceKotlin(version = "1.6")
    public static final String readln() {
        String readlnOrNull = readlnOrNull();
        if (readlnOrNull != null) {
            return readlnOrNull;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @SinceKotlin(version = "1.6")
    public static final String readlnOrNull() {
        return readLine();
    }

    @InlineOnly
    private static final void print(int i3) {
        System.out.print(i3);
    }

    @InlineOnly
    private static final void println(int i3) {
        System.out.println(i3);
    }

    @InlineOnly
    private static final void print(long j) {
        System.out.print(j);
    }

    @InlineOnly
    private static final void println(long j) {
        System.out.println(j);
    }

    @InlineOnly
    private static final void print(byte b2) {
        System.out.print(Byte.valueOf(b2));
    }

    @InlineOnly
    private static final void println(byte b2) {
        System.out.println(Byte.valueOf(b2));
    }

    @InlineOnly
    private static final void print(short s10) {
        System.out.print(Short.valueOf(s10));
    }

    @InlineOnly
    private static final void println(short s10) {
        System.out.println(Short.valueOf(s10));
    }

    @InlineOnly
    private static final void print(char c10) {
        System.out.print(c10);
    }

    @InlineOnly
    private static final void println(char c10) {
        System.out.println(c10);
    }

    @InlineOnly
    private static final void print(boolean z2) {
        System.out.print(z2);
    }

    @InlineOnly
    private static final void println(boolean z2) {
        System.out.println(z2);
    }

    @InlineOnly
    private static final void print(float f10) {
        System.out.print(f10);
    }

    @InlineOnly
    private static final void println(float f10) {
        System.out.println(f10);
    }

    @InlineOnly
    private static final void print(double d8) {
        System.out.print(d8);
    }

    @InlineOnly
    private static final void println(double d8) {
        System.out.println(d8);
    }

    @InlineOnly
    private static final void print(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.print(message);
    }

    @InlineOnly
    private static final void println(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.println(message);
    }

    @InlineOnly
    private static final void println() {
        System.out.println();
    }
}
